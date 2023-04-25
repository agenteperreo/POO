package ejercico3enum;

public class Articulo {

	/**
	 * Nombre del articulo
	 */
	private String nombre;

	/**
	 * Precio del articulo
	 */
	private double precio;

	/**
	 * Valor del IVA para mutiplicar y sacar el 21%
	 */
	private static final double IVA = 0.21;

	/**
	 * Articulos restantes en stock
	 */
	private int cuantosQuedan;

	/**
	 * Enum del departamento del articulo
	 * 
	 * @author isaac
	 *
	 */
	private enum Departamento {
		Electronica, Alimentación, Droguería
	}

	/**
	 * Atributo del enum Departamento
	 */
	private Departamento departamento;

	/**
	 * Constructor con parametros
	 * 
	 * @param nombre        Nombre del articulo
	 * @param precio        Precio del articulo
	 * @param cuantosQuedan Cuantos articulos hay en stock
	 * @param departamento  Tipo de departamento del articulo
	 */
	public Articulo(String nombre, double precio, int cuantosQuedan, String departamento) {
		if (!nombre.isEmpty() && nombre != null) {

			this.nombre = nombre;

		} else {
			System.out.println("El nombre no es correcto.");
		}
		if (precio > 0) {
			this.precio = precio;

		} else {
			System.out.println("El precio no puede ser negativo.");
		}
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		} else {
			System.out.println("La cantidad es incorrecta");
		}

		this.departamento = Departamento.valueOf(departamento);
	}

	/**
	 * Metodo get del nombre del articulo
	 * 
	 * @return Nombre del articulo
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo set del nombre del articulo
	 * 
	 * @param nombre Nombre del articulo
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo get del precio del articulo
	 * 
	 * @return precio del articulo
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Metodo set del precio del articulo
	 * 
	 * @param precio Precio del articulo
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Metodo get del stock del articulo
	 * 
	 * @return Cantidad en stock
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	/**
	 * Metodo set de la cantidad en stock del articulo
	 * 
	 * @param cuantosQuedan Cantidad en stock
	 */
	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan = cuantosQuedan;
	}

	/**
	 * Metodo get del departamento del articulo
	 * 
	 * @return Departamento del articulo
	 */
	public Departamento getDepartamento() {
		return departamento;
	}

	/**
	 * Metodo set del departamento del articulo
	 * 
	 * @param departamento Departamento dle articulo
	 */
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	/**
	 * Metodm que nos devuelve el precio del producto con el IVA incluido
	 * 
	 * @return Precio del articulo
	 */
	public double getPVP() {

		// Creamos la variable y hacemos los calculo para el precio final
		double precioFinal = precio + (precio * IVA);

		// Devolvemos el precio
		return precioFinal;
	}

	/**
	 * Metodo que devuelve el precio del articulo con el descuento
	 * 
	 * @param descuento Porcentaje del descuento
	 * @return Precio del articulo con el descuento
	 */
	public double getPVPDescuento(int descuento) {

		// Calculamos el precio restandole el descuento
		double precioFinal = getPVP() - (getPVP() * descuento / 100);

		// Devovemos el precio
		return precioFinal;

	}

	/**
	 * Metodo para vender el articulo
	 * 
	 * @param cantidad Cantidad que queremos vender
	 * @return Si podemos o no vender esa cantidad de articulos
	 */
	public boolean vender(int cantidad) {

		// Variable boolean para saber si se puede vender o no esa cantidad de articulos
		boolean poder;

		// Si la cantidad que se quiere vender es mayor que cuantos quedan
		if (cantidad > cuantosQuedan) {

			// No se puede hacer la compra
			poder = false;

			// Si no
		} else {
			// Podemos hacer la compra
			poder = true;

			// Restamos la cantidad vendida al stock
			cuantosQuedan -= cantidad;
		}

		// Devolvemos si pudimos vender o no
		return poder;
	}

	/**
	 * Metodo para almacenar en stock
	 * 
	 * @param cantidad Cantidad de articulos que vamos a almacenar
	 */
	public void almacena(int cantidad) {

		// Añadimos la cantidad de articulo al stock
		cuantosQuedan += cantidad;

	}

	/**
	 * Metodo para mostrar la información del articulo
	 */
	public void mostrarInformación() {
		System.out.println("Nombre del articulo: " + nombre);
		System.out.println("Precio: " + precio);
		System.out.println("Stock: " + cuantosQuedan);
		System.out.println("Departamento: " + departamento);
	}

}
