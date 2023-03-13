package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		CuentaCorriente usuario = new CuentaCorriente("12345678N", "Manoooolo", 65.02);

		double cantidad;
		int opción = 0;

		Scanner sc = new Scanner(System.in);

		while (opción != 4) {
			
			// Menú
			System.out.println();
			System.out.println("-----------MENU------------");
			System.out.println("        1. Ingresar        ");
			System.out.println("        2. Retirar         ");
			System.out.println("        3. Mostrar         ");
			System.out.println("        4. Salir           ");
			System.out.println("---------------------------");
			
			// Pedimos que quiere hacer el usuario
			System.out.print("¿Que quieres hacer?: ");
			opción = sc.nextInt();

			switch (opción) {
			case 1 -> {
				System.out.print("¿Cuanto deseas ingresar?: ");
				cantidad = sc.nextDouble();

				usuario.ingresarDinero(cantidad);

				System.out.println("Ingreso existoso");
			}

			case 2 -> {
				System.out.print("¿Cuanto deseas retirar?: ");
				cantidad = sc.nextDouble();

				if(usuario.sacarDinero(cantidad)) {
					System.out.println("Retirada exitosa");
				} else {
					System.err.println("Error, no hay suficiente dinero en la cuenta");
				}

			}

			case 3 -> {
				usuario.mostrarInformacion();
			}

			case 4 -> {
				System.out.println("Saliendo");
			}

			default -> {
				System.err.println("Opción no valida");
			}
			}
		}

		sc.close();

	}

}
