import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Bem vindo(a) ao BBB - Banco Banco Brasil");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Nome do Usu�rio: ");
		String name = input.nextLine(); 
		
		System.out.println("Digite sua senha: ");
		String psword = input.nextLine(); 
		while (psword.length() < 6) {
			System.out.println("Inv�lido! Sua senha deve ter no m�nimo 6 caracteres: ");
			psword = input.nextLine();
		}
		System.out.println("Agora informe a sua idade: ");
		byte age = input.nextByte();  
		
		System.out.println("Digite o seu endere�o: ");
		String address = input.next();
		address += input.nextLine();
		
		Usuario user = new Usuario(name, psword, age , address);
			
		
		while (true) {
			
		
			System.out.print("\n\nEscolha a opera��o que deseja realiza:\n[1] Saque, [2] Dep�sito, [3] Saldo, [123] Sair\n-");
			byte op = input.nextByte();
			
			if (op == 1) {
				System.out.print("Digite o valor que deseja sacar: R$");
				float v_saque = input.nextFloat();
				while (v_saque > user.Saldo) {
					System.out.print("Inv�lido! Valor inserido � maior que o saldo atual! Tente novamente: R$");
					v_saque = input.nextFloat();
				}
				user.Saldo = OperacoesBanco.Saque(v_saque, user.Saldo);
				System.out.println("Saque no valor de R$" + v_saque + " realizado com sucesso!");
			}
			
			if (op == 2) {
				System.out.print("Digite o valor que deseja depositar: R$");
				float v_deposito = input.nextFloat();
				user.Saldo = OperacoesBanco.Deposito(v_deposito, user.Saldo) ;
				System.out.println("Dep�sito no valor de R$" + v_deposito + " realizado com sucesso!");
			}
			
			if (op == 3) {
				System.out.print("Seu saldo atual � de: R$" + OperacoesBanco.Saldo(user.Saldo));				
			}
			
			if (op == 123) {
				System.out.println("\nOpera��o Finalizada. Obrigado e volte sempre!");		
				break;
			}
		}
		
		System.out.println("Dados do Usu�rio - Nome: " + user.Name + ", Idade: " + user.Age + ", Endere�o: " + user.Adress);
	}

}
