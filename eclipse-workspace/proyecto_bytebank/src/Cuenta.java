class Cuenta {
	private double saldo; 
	private int agencia; 
	private int numero;
	Cliente titular = new Cliente(); // Lo que hace es que al momento de llamarse el titular se creara automaticamente un nuevo Objeto con el nombre Cliente de esta manera se podra evitar errores
	
	private static int total  = 0;
	
	
	public Cuenta(int agencia) { // no tiene retorno ni nads, es un metodo que retorna cuenta , el constructor te obliga dar parametros para que se pueda hacer valido o compile el codigo
		if (agencia <= 0) {
			System.out.println("No se permite 0");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("Se van creando: " +  total + " cuentas");
	}
	
	
	//no retorna valor
	public void depositar(double valor){ // se debe especificar si es double o char etc , si no dara error 
		
		//this.saldo = this.saldo + valor; // se usa el this para dar a entender que se usara solo es parametro o valor en esta operacion
		this.saldo += valor; // el += hace que se sume el valor que esta despues del igual haciendo mas facil y escribir menos el codigo 
	}
	
	//retorna valor 
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			//this.saldo = this.saldo - valor;
			this.saldo -= valor;
			return true;
		} else {
			return false;
			
		}
	}
	
	public boolean transferir(double valor, Cuenta cuenta){
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			//cuenta.saldo = cuenta.saldo + valor;
			cuenta.depositar(valor);
			return true;
			}
		else {
			return false;
			}
			}
	
	public double getSaldo(){ //obtiene o consigue un valor que se quiera asignar
		return this.saldo;
		
	}
	
	public void setAgencia(int agencia) { // asigna valores
		if (agencia > 0) {
		this.agencia = agencia;
		} else {
			System.out.println("No estan permitidos numeros negativos!");
		}
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Cuenta.total;
		
	}
}