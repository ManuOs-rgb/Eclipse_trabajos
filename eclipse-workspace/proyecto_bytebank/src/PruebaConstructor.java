
public class PruebaConstructor {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(66);
		Cuenta cuenta2 = new Cuenta(3);
//		cuenta.setAgencia(-3);
		System.out.println(cuenta.getAgencia());
		System.out.println(cuenta2.getAgencia());
		
		System.out.println(Cuenta.getTotal());
	}

}
