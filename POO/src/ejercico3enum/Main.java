package ejercico3enum;

public class Main {

	public static void main(String[] args) {
		
		// Objeto articulo 
		Articulo articulo = new Articulo ("Camel", 5.40, 12, "Droguería");
		
		double precio = articulo.getPVP();
		double precioDescuento = articulo.getPVPDescuento(4);
		
		
		System.out.println(articulo);
		
		System.out.println("Este es el precio de un artículo: "+precio);		
		System.out.println("Este es el precio con descuento: "+precioDescuento);
		
		articulo.vender(7);
		
		articulo.mostrarInformación();

	}

}
