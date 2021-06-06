package br.com.wagner.estudo.banco.view;

import java.util.Scanner;

import br.com.wagner.estudo.banco.dto.UsuarioDTO;

public class UsuarioView {


	public static void alteraDados(UsuarioDTO user, Scanner input) {

		while (true) {
			OlhaOFront.alterarDadosMenu(); // menu de alteracoes: nome, idade, endereco e senha
			String op = input.next();

			if (op.equals("1")) {
				System.out.println("Digite seu novo nome:");
				String newName = input.next();
				newName += input.nextLine();
				user.setName(newName);
			}

			else if (op.equals("2")) {
				System.out.println("Digite sua nova idade:");
				int newAge = input.nextInt();
				while (newAge < 0 || newAge > 130) {
					System.out.println("Idade invalida! Tente novamente: ");
					newAge = input.nextInt();
				}
				user.setAge(newAge);
			}

			else if (op.equals("3")) {
				System.out.println("Digite seu novo endereco:");
				String newAddress = input.next();
				newAddress += input.nextLine();
				user.setAddress(newAddress);
			}

			else if (op.equals("4")) {
				System.out.println("Digite sua nova senha:");
				String newPsword = input.next();
				while (newPsword.length() < 6) {
					System.out.println("Invalido! Sua senha deve ter no minimo 6 caracteres: ");
					newPsword = input.next();
				}
				user.setPassword(newPsword);
			}

			else if (op.equals("123")) {
				OlhaOFront.caixaTexto("       [Alteracao encerrada]");
				break;
			}

			else {
				OlhaOFront.caixaTexto("Operacao invalida! Tente novamente");
			}
		}
	}	
}
