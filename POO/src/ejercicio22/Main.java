package ejercicio22;

public class Main {

	public static void main(String[] args) {
		
		//Creamos el objeto contador
		Contador cont=new Contador(0);
		
		// Mostramos el valor del contador
		System.out.println(cont.getCont());
		
		// cambiamos el valor del contador
		cont.setCont(9);
		
		// Restamos 1 al contador
		cont.decrementar();
		
		// Mostramos el valor del contador
		System.out.println(cont.getCont());
		
		// Sumamos 1 al contador
		cont.incrementar();
		
		// Mostramos el valor del contador
		System.out.println(cont.getCont());

	}

}
