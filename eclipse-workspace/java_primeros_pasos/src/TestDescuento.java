
public class TestDescuento {
	public static void main(String[] args) {
		double valorCompra = 100.0;
		double descuento = 0.0;
		
		if (valorCompra >=100 && valorCompra <=199.99) {
			descuento = 10.0;
		}
		else if (valorCompra >=200.0 && valorCompra <= 299.99) {
			descuento = 15.0;
			
		}
		else if (valorCompra >=300.0) {
			descuento = 20.0;
			}
		
		double valorFinal = valorCompra - ((valorCompra * descuento)/100);
		
		System.out.println("Tienes un descuento del : " + descuento + "%" + " Y tu precio final es de"
				+ " : " + valorFinal + " MXN");
		
		
//		if (valorCompra >= 100 && valorCompra <= 199.99) {
//		System.out.println("10% de descuento");
//	}
//		else if (valorCompra >= 200 && valorCompra <= 299.99) {
//				System.out.println("15% de descuento");
//		}
//		else if (valorCompra >= 300.0) {
//			System.out.println("20% de descuento ");
//		}
//			
//		}
		
		
}
}
	
