
public class OlhaOFront {

	public static void caixaTexto(String msg) {
		System.out.printf("+------------------------------------------------------+ %s                    +------------------------------------------------------+-> Press enter <-\n", msg);
	}
	
	public static void operacoesMenu() {
		
		System.out.print("\n\n       Escolha a operacao que deseja realizar:       " +  
				" +------------------------------------------------------+" + 
				" | [1] Dep�sito  |   [2] Saque   |  [3] Consultar Saldo | " + 
				" +------------------------------------------------------+ " + 
				" | [4] Consultar Dados de Usu�rio | [5] Alterar Dados   | " + 
				" +------------------------------------------------------+ " + 
				" |                     [123] Sair                       | " + 
				" +------------------------------------------------------+ " + 
				"                        -> ");
	}
	
	
	public static void alterarDadosMenu() {
		System.out.print("\n  Escolha o que deseja alterar ou digite 123 para sair " +         
	    		"+------------------------------------------------------+ " + 
	    		"| [1] Nome  |  [2] Idade |  [3] Endereco |  [4] Senha  | " + 
	    		"+------------------------------------------------------+ " + 
	    		"|                     [123] Sair                       | " + 
	    		"+------------------------------------------------------+ " + 
	    		"                        ->");	
	}
	

	public static void bemVinde() {
		System.out.println("+------------------------------------------------------+" + 
				"|         Seja Bem Vinde ao Banco Banco Brasil         | " + 
				"|       Casdastre seus dados e se torne um BBB!        | " + 
				"+------------------------------------------------------+ ");
	}


	public static void volteSempre() {
		System.out.println("\n+------------------------------------------------------+ " + 
				"|                 Banco Banco Brasil                   | " + 
				"|            Muito obrigado e volte sempre!            | " + 
				"+------------------------------------------------------+ ");	
	}
	
	
	public static void depositoMenu(double vDeposito) {
		
		System.out.printf("+------------------------------------------------------+ " + 
				     "Deposito de R$%.2f realizado com sucesso! " +    
				"+------------------------------------------------------+ " + 
				                   "-> Press enter <-\n\n", vDeposito);
	}
	
	
	public static void saqueMenu(double vSaque) {
		
		System.out.printf("+------------------------------------------------------+ " + 
				  "Saque no valor de R$%.2f realizado com sucesso!" + 
				"+------------------------------------------------------+ " + 
				                   "-> Press enter <-\n\n", vSaque);
	}
	
	
	public static void saldoMenu(double vSaldo) {
		
		System.out.printf("+------------------------------------------------------+ " + 
				           "O seu saldo atual: R$%.2f " +   
				"+------------------------------------------------------+" + 
				                  " -> Press enter <-\n\n", vSaldo);
	}
	
	
	public static void validaSaqueDeposito() {
		
		System.out.printf("+------------------------------------------------------+ " + 
				"|           Valor incorreto! Tente novamente:           | " + 
				"+------------------------------------------------------+ " + 
				"                       -> R$");
	}
	
	public static void consultaDadosMenu(String nome, int idade, String endereco) {
		System.out.printf("\n+------------------------------------------------------+ " + 
				" Nome: %s " + 
				"+------------------------------------------------------+ " + 
				" Idade: %s " + 
				"+------------------------------------------------------+ " + 
				" Endereco: %s " + 
				"+------------------------------------------------------+ " + 
				"                  -> Press enter <-\n\n", nome, idade, endereco);
	}
}
