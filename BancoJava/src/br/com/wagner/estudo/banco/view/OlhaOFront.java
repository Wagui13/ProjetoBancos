package br.com.wagner.estudo.banco.view;

public class OlhaOFront {

	public static void caixaTexto(String msg) {
		System.out.printf("+------------------------------------------------------+\n %s                    +------------------------------------------------------+-> \n Press enter <-\n", msg);
	}
	
	public static void operacoesMenu() {
		
		System.out.print("\n\n       Escolha a operacao que deseja realizar:\n" +  
				"+------------------------------------------------------+\n" + 
				"| [1] Deposito  |   [2] Saque   |  [3] Consultar Saldo |\n" + 
				"+------------------------------------------------------+\n" + 
				"| [4] Consultar Dados de Usuario | [5] Alterar Dados   |\n" + 
				"+------------------------------------------------------+\n" + 
				"|                     [123] Sair                       |\n" + 
				"+------------------------------------------------------+\n" + 
				"                        ->");
	}
	
	
	public static void alterarDadosMenu() {
		System.out.print("\n  Escolha o que deseja alterar ou digite 123 para sair\n" +         
	    		"+------------------------------------------------------+\n" + 
	    		"| [1] Nome  |  [2] Idade |  [3] Endereco |  [4] Senha  |\n" + 
	    		"+------------------------------------------------------+\n" + 
	    		"|                     [123] Sair                       |\n" + 
	    		"+------------------------------------------------------+\n" + 
	    		"                        ->");	
	}
	

	public static void bemVinde() {
		System.out.println("+------------------------------------------------------+\n" + 
				"|         Seja Bem Vinde ao Banco Banco Brasil         |\n" + 
				"|       Casdastre seus dados e se torne um BBB!        |\n" + 
				"+------------------------------------------------------+\n");
	}


	public static void volteSempre() {
		System.out.println("\n+------------------------------------------------------+\n" + 
				"|                 Banco Banco Brasil                   |\n" + 
				"|            Muito obrigado e volte sempre!            |\n" + 
				"+------------------------------------------------------+\n");	
	}
	
	
	public static void depositoMenu(double vDeposito) {
		
		System.out.printf(
				"+------------------------------------------------------+\n" + 
				"Deposito de R$%.2f realizado com sucesso!\n" +    
				"+------------------------------------------------------+\n" + 
				"-> Press enter <-\n\n", vDeposito);
	}
	
	
	public static void saqueMenu(double vSaque) {
		
		System.out.printf(
				"+------------------------------------------------------+\n " + 
				"Saque no valor de R$%.2f realizado com sucesso!\n" + 
				"+------------------------------------------------------+\n" + 
				"-> Press enter <-\n\n", vSaque);
	}
	
	
	public static void saldoMenu(double vSaldo) {
		
		System.out.printf(
				"+------------------------------------------------------+\n" + 
				"O seu saldo atual: R$%.2f\n" +   
				"+------------------------------------------------------+\n" + 
				" -> Press enter <-\n\n", vSaldo);
	}
	
	
	public static void validaSaqueDeposito() {
		
		System.out.printf(
				"+------------------------------------------------------+\n" + 
				"|           Valor incorreto! Tente novamente:          |\n" + 
				"+------------------------------------------------------+\n" + 
				"                       -> R$");
	}
	
	public static void consultaDadosMenu(String nome, int idade, String endereco) {
		System.out.printf(
				"\n+------------------------------------------------------+\n" + 
				" Nome: %s  \n" + 
				"+------------------------------------------------------+\n" + 
				" Idade: %s " + 
				"+------------------------------------------------------+\n" + 
				" Endereco: %s " + 
				"+------------------------------------------------------+\n" + 
				"                  -> Press enter <-\n\n", nome, idade, endereco);
	}
}
