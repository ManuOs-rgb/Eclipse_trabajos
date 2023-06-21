
public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		miCuenta.getSaldo();
		miCuenta.depositar(200);
		System.out.println(miCuenta.getSaldo());
		
		miCuenta.retirar(100);
		System.out.println(miCuenta.getSaldo());
		
		Cuenta cuentaPamela = new Cuenta(); 
		cuentaPamela.getSaldo();
		cuentaPamela.depositar(15500);
		boolean puedeTransferir = cuentaPamela.transferir(1000 , miCuenta);

		
		if (puedeTransferir) {
			System.out.println("Transferencia exitosa");
		} else {
			System.out.println("No se pudo transferir");
		}
		
		System.out.println("Tu saldo Pamela es de: " + cuentaPamela.getSaldo());
		System.out.println("Tu saldo Osvaldo es de: " + miCuenta.getSaldo());
		
		
	}

}
