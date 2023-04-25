package ejercicio4enum;

public class Disco {

	/**
	 * Atributo donde guardaremos el código del disco
	 */
	private String codigo = "LIBRE";

	/**
	 * Atributo donde guardaremos el autor del disco
	 */
	private String autor = "";

	/**
	 * Atributo donde guardaremos el título del disco
	 */
	private String titulo = "";

	/**
	 * Atributo donde guardaremos el género del disco
	 */
	private Genero genero;

	/**
	 * Atributo donde guardaremos la duración del disco
	 */
	private int duracion = 0;

	/**
	 * Creamos el enum con los generos posibles para el disco
	 * 
	 * @author isaac
	 *
	 */
	enum Genero {
		Rock, Pop, Electronica, Reggeaton
	}

	/**
	 * Constructor por defecto
	 */
	public Disco() {
	}

	/**
	 * Constructor con solo codigo como parametro
	 * 
	 * @param codigo Codigo del disco
	 */
	public Disco(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param codigo   Codigo del disco
	 * @param autor    Autor del disco
	 * @param titulo   Titulo del disco
	 * @param genero   Genero del disco
	 * @param duracion Duración del disco
	 */
	public Disco(String codigo, String autor, String titulo, Genero genero, int duracion) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
	}

	/**
	 *  Constructor copia
	 * @param disco	Disco
	 */
	public Disco(Disco disco) {
		this.codigo = disco.codigo;
		this.autor = disco.autor;
		this.titulo = disco.titulo;
		this.genero = disco.genero;
		this.duracion = disco.duracion;
	}

	/**
	 * Metodo get del codigo
	 * @return	Codigo del disco
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Metodo set del codigo
	 * @param codigo	Codigo del disco
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * Metodo get del autor
	 * @return	Autor del disco
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Metodo set del autor
	 * @param autor	Autor del disco
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Metodo get del titulo
	 * @return	Titulo dell disco
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Metodo set del titulo
	 * @param titulo	Titulo del disco
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Metodo get del genero
	 * @return	Genero del disco
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * Metodo set del genero
	 * @param genero	Genero del disco
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	/**
	 * Metodo get de la duración
	 * @return	Duración del disco
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * Metodo set de la duración
	 * @param duracion	Duracion del disco
	 */
	public void setDuracion(int duracion) {
		
		//Si la duración es menor que 0
		if (duracion > 0) {
			
			// La duracion se pone predeterminada
			this.duracion = duracion;
		}
	}

	/**
	 * Metodo que muestra los atributos del objeto Disco
	 */
	public void mostrarInformación() {

		System.out.println("Codigo del disco: "+codigo);
		System.out.println("Autor: " + autor);
		System.out.println("Titulo: " + titulo);
		System.out.println("Genero: " + genero);
		System.out.println("Duración: " + duracion);
	}
}
