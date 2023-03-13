package ejercicio2;

public class Libro {

	String titulo;
	String autor;
	int numeroEjemplares;
	int ejemplaresPrestados;

	public Libro() {
	}

	public Libro(String titulo, String autor, int numeroEjemplares, int ejemplaresPrestados) {
		this.titulo = "El quijote";
		this.autor = "Migule de Cervantes";
		this.numeroEjemplares = 27000000;
		this.ejemplaresPrestados = 4000000;
	}

	boolean prestamo() {

		boolean prestado = true;

		if (numeroEjemplares <= 0) {
			prestado = false;
		} else {
			ejemplaresPrestados++;
			numeroEjemplares--;
		}

		return prestado;
	}

	boolean devolución() {

		boolean devuelto = true;

		if (ejemplaresPrestados <= 0) {
			System.err.println("No puedes devolver un libro que no se ha prestado");
			devuelto = false;
		} else {
			ejemplaresPrestados++;
		}

		return devuelto;
	}

}
