package ejercicio1enum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Creamos el objeto de la cuenta corriente
		CuentaCorriente usuario = new CuentaCorriente("12345678N", "Manoooolo", 65.02, "MASCULINO");

		// Declaración de variables
		double cantidad;
		int opción = 0;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Mientras la opción no sea 4
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

			// En función de la variable opción
			switch (opción) {

			// Si la variable es 1
			case 1 -> {

				// Pedimos cuanto quiere ingresar
				System.out.print("¿Cuanto deseas ingresar?: ");
				cantidad = sc.nextDouble();

				// Ingresamos el dinero con la función de la calse CuentaCorriente
				usuario.ingresarDinero(cantidad);

				// Mostramos un mensaje de exito
				System.out.println("Ingreso existoso");
			}

			// Si la variable es 2
			case 2 -> {

				// Pedimos cuanto quiere retirar
				System.out.print("¿Cuanto deseas retirar?: ");
				cantidad = sc.nextDouble();

				// Si la devolución de la funcion es true retiramos el dinero
				if (usuario.sacarDinero(cantidad)) {

					// Mostramos un mensaje de exito
					System.out.println("Retirada exitosa");

					// Si no
				} else {
					// Mostramos que no hay suficiente dinero en la cuenta
					System.err.println("Error, no hay suficiente dinero en la cuenta");
				}

			}

			// Si la variable es 3
			case 3 -> {

				// Llamamos a la función que muertra toda la información del objeto
				usuario.mostrarInformacion();
			}

			// Si la variable es 4
			case 4 -> {

				// Mostramos un mensaje de finalización y salimos del programa con el bucle
				// while
				System.out.println("Saliendo");
			}

			// Si es otro valor diferente a los anteriores
			default -> {
				
				// Mostramos mensaje de error de que la opción no es valida
				System.err.println("Opción no valida");
			}
			}
		}

		// Cerramos el escaner
		sc.close();

	}

}
