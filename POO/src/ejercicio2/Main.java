package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Declaración de variables
		int opc = 0;

		Libro libro = new Libro();

		Scanner sc = new Scanner(System.in);

		// Pedimos que quiere hacer al usuario
		System.out.println("1. Prestamo");
		System.out.println("2. Devolución");
		System.out.println();
		System.out.print("¿Que quieres hacer?: ");
		opc = sc.nextInt();

		switch (opc) {
		case 1 -> {
			if(libro.prestamo()) {
				System.out.println("Prestamo exitoso");
			} else {
				System.out.println("Lo sentimos pero no hay ejemplares actualmente");
			}
		}

		case 2 -> {
			if(libro.devolución()) {
				System.out.println("Devolución exitosa");
			} else {
				System.out.println("Lo sentimos, no podemos recoger un libro que no se ha prestado");
			}
		}

		default -> {
			System.err.println("Opción no valida");
		}
		}
		
		sc.close();

	}

}
