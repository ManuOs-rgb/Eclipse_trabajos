
public class TestRefencia3 {
	public static void main(String[] args) {
		Cuenta cuentaOsvaldo = new Cuenta();
		cuentaOsvaldo.depositar(300);;
		
//		Cliente cliente = new Cliente(); // hace que se cree un nuevo objeto cliente
//		cuentaOsvaldo.titular = cliente; //se va a inicializar el titular con el nombre cliente 
//		cuentaOsvaldo.titular = new Cliente(); // hara un nuevo objeto con el nombre Cliente
//		cuentaOsvaldo.titular.nombre = "Osvaldo"; // Se coloca los parametros que se van a usar 
		
		
		System.out.println(cuentaOsvaldo.titular.getNombre()); // se imprime lo que arriba se especifica y al darse un  new cuenta a la vez se crea un new cliente a la vez haciendo que aparezca el null al momento de dar otros parametros
		System.out.println(cuentaOsvaldo.getSaldo());
	}

}
