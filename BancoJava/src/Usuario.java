public class Usuario {
	public String Name;
	public String Psword;
	public int Age;
	public String Address;	
	public double Saldo = 1000.0f;
	
	public Usuario(String nome, String senha, int idade, String endereco) {
		Name = nome;
		Psword = senha;
		Age = idade;
		Address = endereco;
	}

}
