import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Bem vindo(a) ao BBB - Banco Banco Brasil");
		
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
		byte age = input.nextByte();  
		
		System.out.println("Digite o seu endereço: ");
		String address = input.next();
		address += input.nextLine();
		
		Usuario user = new Usuario(name, psword, age , address);
			
		
		while (true) {
			
		
			System.out.print("\n\nEscolha a operação que deseja realiza:\n[1] Saque, [2] Depósito, [3] Saldo, [123] Sair\n-");
			byte op = input.nextByte();
			
			if (op == 1) {
				System.out.print("Digite o valor que deseja sacar: R$");
				float v_saque = input.nextFloat();
				while (v_saque > user.Saldo) {
					System.out.print("Inválido! Valor inserido é maior que o saldo atual! Tente novamente: R$");
					v_saque = input.nextFloat();
				}
				user.Saldo = OperacoesBanco.Saque(v_saque, user.Saldo);
				System.out.println("Saque no valor de R$" + v_saque + " realizado com sucesso!");
			}
			
			if (op == 2) {
				System.out.print("Digite o valor que deseja depositar: R$");
				float v_deposito = input.nextFloat();
				user.Saldo = OperacoesBanco.Deposito(v_deposito, user.Saldo) ;
				System.out.println("Depósito no valor de R$" + v_deposito + " realizado com sucesso!");
			}
			
			if (op == 3) {
				System.out.print("Seu saldo atual é de: R$" + OperacoesBanco.Saldo(user.Saldo));				
			}
			
			if (op == 123) {
				System.out.println("\nOperação Finalizada. Obrigado e volte sempre!");		
				break;
			}
		}
		
		System.out.println("Dados do Usuário - Nome: " + user.Name + ", Idade: " + user.Age + ", Endereço: " + user.Adress);
	}

}
