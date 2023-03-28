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

		// Creamos la variable que vamos a devolver
		boolean prestado = true;

		// Si hay mas ejemplares prestados que cantidad de ejemplares
		if (ejemplaresPrestados >= numeroEjemplares) {

			// Cambiamos a false ya que no podemos prestar un libro que no tenemos
			prestado = false;

			// Si no
		} else {
			// Prestamos el libro y aumentamos los ejemplares prestados
			ejemplaresPrestados++;
		}

		// Devolvemos si se ha podido prestar
		return prestado;
	}

	/**
	 * Metodo para devolver un libro prestado
	 * 
	 * @return Si se ha podido devolver
	 */
	boolean devolución() {

		// Creamos la variable que vamos a devolver
		boolean devuelto = true;

		// Si los ejemplares prestado son menores o iguales que 0
		if (ejemplaresPrestados <= 0) {

			// Mostramos un error de que no se puede devolver
			System.err.println("No puedes devolver un libro que no se ha prestado");

			// Cambiamos la variable a false
			devuelto = false;

			// Si no
		} else {

			// Devolvemos el libro y decrementamos los prestados en 1
			ejemplaresPrestados--;
		}

		// Devolvemos si se ha podido devolver el libro o no
		return devuelto;
	}

}
