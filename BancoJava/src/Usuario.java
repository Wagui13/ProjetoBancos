
public class Usuario {
	public String Name;
	public String Psword;
	public byte Age;
	public String Adress;	
	public float Saldo = 1000.0f;
	
	public Usuario(String nome, String senha, byte idade, String endereco) {
		Name = nome;
		Psword = senha;
		Age = idade;
		Adress = endereco;
	}

}
