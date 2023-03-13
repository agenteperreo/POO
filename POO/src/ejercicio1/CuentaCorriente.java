package ejercicio1;

public class CuentaCorriente {

	String DNI;
	String nombre;
	double saldo;
	
	
	public CuentaCorriente(String DNI, String nombre, double saldo) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = saldo;
	}


	public CuentaCorriente(String DNI, double saldo) {
		this.DNI = DNI;
		this.saldo = saldo;
	}
	
	
	boolean sacarDinero(double cantidad) {
		
		boolean poder = true;
		
		if(cantidad>saldo) {
			poder=false;
		} else {
			saldo-=cantidad;
		}
		
		return poder;
	}
	
	void ingresarDinero(double ingreso) {
		
		saldo+=ingreso;
		
	}
	
	void mostrarInformacion() {
		
		System.out.println("DNI: "+DNI);
		System.out.println("Nombre: "+nombre);
		System.out.println("Dinero en la cuenta: "+saldo);
		
	}
	
}
