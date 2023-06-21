
public class PruenbaAcceso {
	
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		cuenta.setAgencia(-2);
//		cuenta.saldo = 200; no puede usarse cuenta.obtenerSaldo() = 200; porque no podemos darle un valor, no se puede intervenir en la variable
		cuenta.depositar(400);
		cuenta.retirar(300);
//		cuenta.saldo = cuenta.saldo -300; No se usa porque el saldo lo puse en privado
		
		System.out.println(cuenta.getSaldo()); // mandara 0.0 porque no tengo el saldo suficiente y es una forma segura de cuidar el dinero
		System.out.println(cuenta.getAgencia());
		
	}

}
