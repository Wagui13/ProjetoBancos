package br.com.wagner.estudo.banco;
/* Projeto de um Banco Ficticio, pra praticar e aprender Java;
 * Faltam algumas validacoes e o encapsulamento dos dados do usuario, eventualmente adicionar get e set;
   Wagner Cardoso; */

import java.util.Scanner;

import br.com.wagner.estudo.banco.business.OperacoesBanco;
import br.com.wagner.estudo.banco.dto.UsuarioDTO;
import br.com.wagner.estudo.banco.view.OlhaOFront;

public class Main {

	public static void main(String[] args) {
		
		OlhaOFront.bemVinde(); // msg de boas vindas
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nome do Usuario: ");
		String name = input.nextLine(); 
		
		System.out.println("Digite sua senha: ");
		String psword = input.nextLine(); 
		while (psword.length() < 6) {
			System.out.println("Incorreta! Sua senha deve ter no minimo 6 caracteres: ");
			psword = input.nextLine();
		}
		System.out.println("Agora informe a sua idade: ");
		int age = input.nextInt(); 
		while (age < 0 || age > 130) {
			System.out.println("Idade invalida! Tente novamente: ");
			age = input.nextInt();
		}
		
		System.out.println("Digite o seu endereco: ");
		String address = input.next();
		address += input.nextLine();
		
		OlhaOFront.caixaTexto("        Usuario cadastrado!");
		UsuarioDTO user = new UsuarioDTO(name, psword, age, address);
		
		while (true) {
					
			OlhaOFront.operacoesMenu(); // menu de operacoes: saque, deposito, saldo, dados do usuario, alterar dados e sair
			String op = input.next();
			
			if (op.equals("1")) {
				System.out.print("Digite o valor que deseja depositar: R$");
				double vDeposito = input.nextDouble();
				user.setSaldo(OperacoesBanco.deposito(vDeposito, user.getSaldo())) ;
				OlhaOFront.depositoMenu(vDeposito);
			}
			
			else if (op.equals("2")) {				
				System.out.print("Digite o valor que deseja sacar: R$");
				double vSaque = input.nextDouble();
				while (vSaque > user.getSaldo()) {
					System.out.print("Invalido! Valor inserido maior que o saldo atual! Tente novamente: R$");
					vSaque = input.nextDouble();
				}
				user.setSaldo(OperacoesBanco.saque(vSaque, user.getSaldo()));
				OlhaOFront.saqueMenu(vSaque);						
			}
			
			else if (op.equals("3")) {
				OlhaOFront.saldoMenu(user.getSaldo()); 
				//gostaria de fazer um press enter to continue no fim dos menus, mas o input.next(); pula a linha ao inves de continuar
			}
			
			else if (op.equals("4")) {
				OperacoesBanco.consultaDados(user);
			}
			
			else if (op.equals("5")) {
				OperacoesBanco.alteraDados(user);
			}
			
			else if (op.equals("123")) {
				OlhaOFront.volteSempre();	
				break;
			}
			else {
				OlhaOFront.caixaTexto("Operacao invalida! Tente novamente");
			}
		}	
		
		input.close();
	}
}
