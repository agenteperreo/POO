package ejercicio23;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Creamos el objeto
		Fecha f1 = new Fecha();

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos la fecha al usuario
		System.out.println("¿Que dia es?");
		System.out.print("Dia: ");
		f1.setDia(sc.nextInt());
		System.out.print("Mes: ");
		f1.setMes(sc.nextInt());
		System.out.print("Año: ");
		f1.setAño(sc.nextInt());

		// Comprobamos si la fecha es correcta
		if (!f1.fechaCorrecta()) {
			System.err.println("La fecha no es correcta");
		}

		// Pasamos al siguiente dia
		f1.diaSiguiente();

		// Comprobamos si el año es bisiesto
		if (f1.esBisiesto()) {
			System.out.println("El año es bisisesto");
		}

		// Mostramos la fecha
		System.out.println(f1.toString());

		// Cambiamos el mes
		f1.setMes(sc.nextInt());

		// Mostramos la fecha
		System.out.println(f1.toString());

		sc.close();

	}

}
