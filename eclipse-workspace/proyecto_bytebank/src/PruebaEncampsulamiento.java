
public class PruebaEncampsulamiento {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(33);
		Cliente cliente = new Cliente();
		cliente.setNombre("Osvaldo");
		cliente.setDocumento("OMBV");
		
		cuenta.setTitular(cliente);
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getNombre());
		
		
	}

}
