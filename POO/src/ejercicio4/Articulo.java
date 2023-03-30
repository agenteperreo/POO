package ejercicio4;

public class Articulo {
	
	String nombre;
	double precio;
	static final double IVA = 0.21;
	int cuantosQuedan;
	
	public Articulo(String nombre, double precio, int cuantosQuedan) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cuantosQuedan = cuantosQuedan;
	}
	
	public double getPVP() {
		
		double precioFinal = precio+(precio*IVA);
		
		return precioFinal;
	}
	
	public double getPVPDescuento(int descuento) {
		
		double precioFinal = getPVP()-(getPVP()*descuento/100);
		
		return precioFinal;
		
	}
	
	public boolean vender(int cantidad) {
		
		boolean poder;
		
		if(cantidad>cuantosQuedan) {
			poder=false;
		} else {
			poder = true;
			cuantosQuedan-=cantidad;
		}
		
		return poder;
	}
	
	public void almacena(int cantidad) {
		
		cuantosQuedan+=cantidad;
		
	}
	
}
