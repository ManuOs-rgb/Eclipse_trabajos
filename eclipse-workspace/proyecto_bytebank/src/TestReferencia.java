
public class TestReferencia {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.getSaldo();
		
		Cuenta segundaCuenta = primeraCuenta; // esta afectara tanto la primera y la segunda cuenta, lo que se modifique en las dos sera modificado en ambos 
		segundaCuenta.depositar(300);
		
		System.out.println("Saldo primera cuenta :" + primeraCuenta.getSaldo());
		System.out.println("Saldo segunda cuenta :" + segundaCuenta.getSaldo());
		
		segundaCuenta.getSaldo();
		System.out.println("Saldo primera cuenta : " + primeraCuenta.getSaldo());
		
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Son el mismo objeto");
		} else {
			System.out.println("Son diferentes");
		}
		
	}

}
