package br.com.wagner.estudo.banco.dto;
public class UsuarioDTO {
	
	private String name;
	private String password;
	private int age;
	private String address;	
	private double saldo;
	
	public UsuarioDTO(String name, String password, int age, String address, double saldo) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
		this.address = address;
		this.saldo = saldo;
	}
	
	public UsuarioDTO(String name, String password, int age, String address) {
		this(name, password, age, address, 0.0);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}