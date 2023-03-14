package ejercicio2;

public class Libro {

	/**
	 * Titulo del libro
	 */
	String titulo;

	/**
	 * Autor del libro
	 */
	String autor;

	/**
	 * Cantidad de ejemplares
	 */
	int numeroEjemplares;

	/**
	 * Ejemplares prestados
	 */
	int ejemplaresPrestados;

	/**
	 * Contructor por defecto
	 */
	public Libro() {
	}

	/**
	 * Constructor con parametros
	 * 
	 * @param titulo              Titulo del libro
	 * @param autor               Autor del libro
	 * @param numeroEjemplares    Cantidad de ejemplares
	 * @param ejemplaresPrestados Ejemplares prestados
	 */
	public Libro(String titulo, String autor, int numeroEjemplares, int ejemplaresPrestados) {
		this.titulo = "El quijote";
		this.autor = "Migule de Cervantes";
		this.numeroEjemplares = 270;
		this.ejemplaresPrestados = 4;
	}

	/**
	 * Metodo para prestar un ejemplar
	 * 
	 * @return Si se ha podido prestar o no
	 */
	boolean prestamo() {

		boolean prestado = true;

		if (ejemplaresPrestados >= numeroEjemplares) {
			prestado = false;
		} else {
			ejemplaresPrestados++;
		}

		return prestado;
	}

	/**
	 * Metodo para devolver un libro prestado
	 * 
	 * @return Si se ha podido devolver
	 */
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
