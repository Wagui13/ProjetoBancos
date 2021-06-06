package br.com.wagner.estudo.banco.business;
import br.com.wagner.estudo.banco.dto.UsuarioDTO;
import br.com.wagner.estudo.banco.view.OlhaOFront;

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
}
