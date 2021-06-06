import java.util.Scanner;

public class OperacoesBanco {

	public static double saque(double saque, double saldo) {
		return saldo - saque;
	}

	public static double deposito(double deposito, double saldo) {
		return saldo + deposito;
	}

	public static double saldo(double saldo) {
		return saldo;
	}

	public static void consultaDados(UsuarioDTO user) {
		OlhaOFront.consultaDadosMenu(user.getName(), user.getAge(), user.getAddress());
	}

	public static void alteraDados(UsuarioDTO user) {

		Scanner input = new Scanner(System.in);
		
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
		input.close();
	}
}
