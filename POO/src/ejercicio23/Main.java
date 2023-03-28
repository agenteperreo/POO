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
		
		if(!f1.fechaCorrecta()) {
			System.err.println("La fecha no es correcta");
		}
		
		f1.diaSiguiente();
		
		if(f1.esBisiesto()) {
			System.out.println("El año es bisisesto");
		}
		
		System.out.println(f1.toString());
		
		f1.setMes(sc.nextInt());

	}

}
