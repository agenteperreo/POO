package ejercicio2enum;

public class Libro {

	/**
	 * Titulo del libro
	 */
	private String titulo;

	/**
	 * Autor del libro
	 */
	private String autor;

	/**
	 * Cantidad de ejemplares
	 */
	private int numeroEjemplares;

	/**
	 * Ejemplares prestados
	 */
	private int ejemplaresPrestados;
	
	enum Genero {
		Narrativo, lirico, Dramatico, Didactico, Poetico
	}

	/**
	 * Atributo genero
	 */
	private Genero genero;
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
	public Libro(String titulo, String autor, int numeroEjemplares, int ejemplaresPrestados, String genero) {
		this.titulo = "El quijote";
		this.autor = "Migule de Cervantes";
		this.numeroEjemplares = 270;
		this.ejemplaresPrestados = 4;
		this.genero = Genero.valueOf(genero);
	}

	/**
	 * Metodo get del titulo de la obra
	 * @return	Titulo de la obra
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Metodo set del titulo de la obra
	 * @param titulo Nuevo titulo de la obra
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Metodo get del autor de la obra
	 * @return	Autor de la obra
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Metodo set del autor de la obra
	 * @param autor	Autor de la obra
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Metodo get de los ejemplares totales
	 * @return	Ejemplares totales de la obra
	 */
	public int getNumeroEjemplares() {
		return numeroEjemplares;
	}

	/**
	 * Metodo set de los ejemplares totales
	 * @param numeroEjemplares	Ejemplares totales de la obra
	 */
	public void setNumeroEjemplares(int numeroEjemplares) {
		this.numeroEjemplares = numeroEjemplares;
	}

	/**
	 * Metodo get de los ejemplares prestado
	 * @return	Ejemplares prestado
	 */
	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}

	/**
	 * Metodo set ejemplares prestados
	 * @param ejemplaresPrestados	Ejemplares prestados
	 */
	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		this.ejemplaresPrestados = ejemplaresPrestados;
	}

	/**
	 * Metodo get del genero de la obra
	 * @return	Genero de la obra
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * Metodo set del genero de la obra
	 * @param genero	Genero de la obra
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
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

	public void mostrarInformacion() {
		System.out.println("Titulo de la obra: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Genero: " + genero);
		System.out.println("Numero de ejemplares: " + numeroEjemplares);
		System.out.println("Ejemplares prestados: " + ejemplaresPrestados);
	}
	
	

}
