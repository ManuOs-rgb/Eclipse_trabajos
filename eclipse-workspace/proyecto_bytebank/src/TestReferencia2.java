
public class TestReferencia2 {
	public static void main(String[] args) {
		Cliente osvaldo = new Cliente();
		osvaldo.setNombre("Osvaldo Manuel Bustos Vazquez");
		osvaldo.setDocumento("979609");
		osvaldo.setTelefono("5562121079");
		
		Cuenta cuentaOsvaldo = new Cuenta();
		cuentaOsvaldo.setAgencia(1);
		cuentaOsvaldo.titular = osvaldo;
		System.out.println(cuentaOsvaldo.titular.getNombre()); // de esta forma nos manda el nombre pero de una forma privada, sin que se pueda modificar, o alterar
		System.out.println(cuentaOsvaldo.titular.getDocumento());
		System.out.println(cuentaOsvaldo.titular.getTelefono());
		System.out.println(osvaldo); // imprime en donde se ubica el objeto cuenta
		System.out.println(cuentaOsvaldo.titular); // hace lo mismo que arriba, me imprime en donde se localiza 
	}

}
