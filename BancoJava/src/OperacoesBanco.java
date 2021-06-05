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
	
	public static void consultaDados(Usuario user) {
		OlhaOFront.consultaDadosMenu(user.Name, user.Age, user.Address);
	}
	
	public static void alteraDados(Usuario user) {
		
			Scanner input = new Scanner(System.in);
			while (true) 
			{	        
				OlhaOFront.alterarDadosMenu(); // menu de altera��es: nome, idade, endere�o e senha
			    String op = input.next();
			
			    if (op.equals("1")) {
			    	System.out.println("Digite seu novo nome:");
			    	String newName = input.next();	            
			    	newName += input.nextLine();
			    	user.Name = newName;
			    }	        	

			    else if (op.equals("2")) {	     	
			    	System.out.println("Digite sua nova idade:");
			    	int newAge = input.nextInt();
			    	while (newAge < 0 || newAge > 130) {
						System.out.println("Idade inv�lida! Tente novamente: ");
						newAge = input.nextInt();
			    	}
			    	user.Age = newAge;
			    }

			    else if (op.equals("3")) {	        	
			    	System.out.println("Digite seu novo endere�o:");
			    	String newAddress = input.next(); 
			    	newAddress += input.nextLine();
			        user.Address = newAddress;	 	            	            
			    }

			    else if (op.equals("4")) {
			    	System.out.println("Digite sua nova senha:");
			    	String newPsword = input.next(); 
			    	while (newPsword.length() < 6) {
			    		System.out.println("Inv�lido! Sua senha deve ter no m�nimo 6 caracteres: ");
			    		newPsword = input.next();
					}
			    	user.Psword = newPsword;            	      	
			    }
			                
			    else if (op.equals("123")) {
			    	OlhaOFront.caixaTexto("       [Altera��o encerrada]");          	
			    	break;            	
			    }

			    else {
			    	OlhaOFront.caixaTexto("Opera��o inv�lida! Tente novamente");
			    }
			}
	}
}
