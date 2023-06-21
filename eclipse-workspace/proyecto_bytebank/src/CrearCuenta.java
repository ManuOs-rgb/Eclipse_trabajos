
public class CrearCuenta {
	public static void main(String[] args) {
		// Variable          = Valor 
		Cuenta primeraCuenta = new Cuenta(); // se necesita especificar de donde viene la clase donde quiero traer o mandar los datos , no siempre los nombres seran los mismos 
		primeraCuenta.getSaldo(); // se coloca el . para que java de las opciones de donde se quiere mandar esos datos
		System.out.println(primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.getSaldo();
		
		System.out.println(segundaCuenta.getSaldo());
		System.out.println(primeraCuenta.getAgencia());
		
		if (primeraCuenta == segundaCuenta) { //solo se esta igualando el objeto y mandara que son diferentes aun asi, si fueran ifuales deben de ponerse .saldo etc 
			System.out.println("Son el mismo objeto");
		} else {
			System.out.println("Son diferentes");
		}
	}

}
