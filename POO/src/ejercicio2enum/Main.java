package ejercicio2enum;

public class Main {

	public static void main(String[] args) {

		//Creamos el objeto libro param: Libro, Autor, libros, libros prestados, genero 
				Libro libro1 = new Libro("Don quijote de la mancha", "Cervantes", 20, 11, "Narrativo");
				
				libro1.prestamo();
				libro1.devolución();
				
				libro1.mostrarInformacion();
				
				// Otro objeto libro
				Libro libro2 = new Libro ("Los juegos del hambre", "Suzzane Collins", 71, 24, "Lirico");
				
				libro2.prestamo();
				
				libro2.mostrarInformacion();

		
	}

}
