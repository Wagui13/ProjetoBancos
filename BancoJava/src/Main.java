/* Projeto de um Banco Ficticio, pra praticar e aprender Java;
 * Faltam algumas validacoes e o encapsulamento dos dados do usuario, eventualmente adicionar get e set;
   Wagner Cardoso; */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		OlhaOFront.bemVinde(); // msg de boas vindas
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nome do Usuário: ");
		String name = input.nextLine(); 
		
		System.out.println("Digite sua senha: ");
		String psword = input.nextLine(); 
		while (psword.length() < 6) {
			System.out.println("Inválido! Sua senha deve ter no mínimo 6 caracteres: ");
			psword = input.nextLine();
		}
		System.out.println("Agora informe a sua idade: ");
		int age = input.nextInt(); 
		while (age < 0 || age > 130) {
			System.out.println("Idade inválida! Tente novamente: ");
			age = input.nextInt();
		}
		
		System.out.println("Digite o seu endereço: ");
		String address = input.next();
		address += input.nextLine();
		
		OlhaOFront.caixaTexto("        Usuário cadastrado!");
		Usuario user = new Usuario(name, psword, age, address);
		
		while (true) {
					
			OlhaOFront.operacoesMenu(); // menu de operações: saque, deposito, saldo, dados do usuario, alterar dados e sair
			String op = input.next();
			
			if (op.equals("1")) {
				System.out.print("Digite o valor que deseja depositar: R$");
				double vDeposito = input.nextDouble();
				user.Saldo = OperacoesBanco.deposito(vDeposito, user.Saldo) ;
				OlhaOFront.depositoMenu(vDeposito);
			}
			
			else if (op.equals("2")) {				
				System.out.print("Digite o valor que deseja sacar: R$");
				double vSaque = input.nextDouble();
				while (vSaque > user.Saldo) {
					System.out.print("Inválido! Valor inserido é maior que o saldo atual! Tente novamente: R$");
					vSaque = input.nextDouble();
				}
				user.Saldo = OperacoesBanco.saque(vSaque, user.Saldo);
				OlhaOFront.saqueMenu(vSaque);						
			}
			
			else if (op.equals("3")) {
				OlhaOFront.saldoMenu(user.Saldo); 
				//gostaria de fazer um press enter to continue no fim dos menus, mas o input.next(); pula a linha ao invés de continuar
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
				OlhaOFront.caixaTexto("Operação inválida! Tente novamente");
			}
		}	
		
		input.close();
	}
}
