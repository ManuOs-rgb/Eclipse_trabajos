
public class Ejemplo_condicionales2 {
	public static void main(String[] args) {
		System.out.println("Hola mi Pamela");

		int edad = 26;
		int cantidadPersonas = 2;
		boolean esPareja;
		if (cantidadPersonas > 1) {
			esPareja = true;
		}
		else {
			esPareja = false;
		}
		
		//boolean esPareja = cantidadPersonas >;//Solo almaecna dos valores true o false
		boolean puedeEntrar = edad >=18 && esPareja;
		
//		if (edad >= 18 && esPareja) {
//			System.out.println("Usted puede entrar");
//			System.out.println("!Bienvenido!");
//	}
		if (puedeEntrar) {
			System.out.println("Bienvenido puede entar");
		}
		else {
			System.out.println("Usted no puede entrar porque es menor de edad o no tiene pareja");
		}
	

}

}
