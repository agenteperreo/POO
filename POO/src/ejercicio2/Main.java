package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Declaración de variables
		int opc = 0;

		// Creamos el objeto libro
		Libro libro = new Libro();

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos que quiere hacer al usuario
		System.out.println("1. Prestamo");
		System.out.println("2. Devolución");
		System.out.println();
		System.out.print("¿Que quieres hacer?: ");
		opc = sc.nextInt();

		// En función de la variable opc
		switch (opc) {
		
		// Si opc es 1
		case 1 -> {
			
			// Si libro.prestamo es true
			if(libro.prestamo()) {
				
				//Mostramos que se ha podido hacer el prestamo
				System.out.println("Prestamo exitoso");
				
				// Si no
			} else {
				
				// Mostramos que no ha sido posible
				System.out.println("Lo sentimos pero no hay ejemplares actualmente");
			}
		}

		// Si opc es 2
		case 2 -> {
			
			// Si libro.devolucion es true
			if(libro.devolución()) {
				
				//Mostramos que se ha podido devolver
				System.out.println("Devolución exitosa");
				
				// Si no
			} else {
				
				// Mostramos que no se ha podido devolver
				System.out.println("Lo sentimos, no podemos recoger un libro que no se ha prestado");
			}
		}

		// En otro caso
		default -> {
			
			// Mostramos el error de que la opción no es valida
			System.err.println("Opción no valida");
		}
		}
		
		// Cerramos el escaner
		sc.close();

		
	}

}
