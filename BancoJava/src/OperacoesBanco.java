
public class OperacoesBanco {
		
	public static float Saque(float saque, float saldo) {
		return saldo - saque;
	}
	
	public static float Deposito(float deposito, float saldo) {
		return saldo + deposito;
	}
	
	public static float Saldo(float saldo) {
		return saldo;
	}
}
