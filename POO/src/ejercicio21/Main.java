package ejercicio21;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Creamos el objeto de hora
		Hora homise = new Hora();
		
		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos la hora que es
		System.out.println("¿Que hora es?: ");
		System.out.print("Hora: ");
		homise.setHora(sc.nextInt());
		
		System.out.print("Minutos: ");
		homise.setMinutos(sc.nextInt());
		
		System.out.print("Segundos: ");
		homise.setSegundos(sc.nextInt());
		
		// Pedimos cuantos egundos quiere aumentar
		System.out.print("¿Cuantos segundos quieres aumentar?: ");
		homise.incrementarSegundos(sc.nextInt());
		
		// Mostramos la hora despues del incremento
		System.out.println("Son las "+homise.getHora()+":"+homise.getMinutos()+":"+homise.getSegundos());
		
		// Cerramos el escaner
		sc.close();

	}

}
