package ejercicio22;

public class Main {

	public static void main(String[] args) {
		
		//Creamos el objeto contador
		Contador cont=new Contador(0);
		
		System.out.println(cont.getCont());
		
		cont.setCont(9);
		
		cont.decrementar();
		
		System.out.println(cont.getCont());
		
		cont.incrementar();
		
		System.out.println(cont.getCont());

	}

}
