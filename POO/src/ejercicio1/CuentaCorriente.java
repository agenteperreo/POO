package ejercicio1;

public class CuentaCorriente {

	/**
	 * DNI del usuario
	 */
	String DNI;

	/**
	 * Nombre del usuario
	 */
	String nombre;

	/**
	 * Saldo de la cuenta corriente
	 */
	double saldo;

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param DNI    DNI del usuario
	 * @param nombre Nombre del usuario
	 * @param saldo  Cantidad de dinero en la cuenta corriente
	 */
	public CuentaCorriente(String DNI, String nombre, double saldo) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = saldo;
	}

	/**
	 * Constructor con solo el DNI y el saldo
	 * 
	 * @param DNI   DNI del usuario
	 * @param saldo Cantidad de dinero en la cuenta corriente
	 */
	public CuentaCorriente(String DNI, double saldo) {
		this.DNI = DNI;
		this.saldo = saldo;
	}

	/**
	 * Metodo para saber si se puede sacar el dinero pedido por el usuario y
	 * retirarlo en caso afirmativo
	 * 
	 * @param cantidad Cuanto quiere retirar el usuario
	 * @return Si es posible la retirada del dinero por falta de credito
	 */
	boolean sacarDinero(double cantidad) {

		// Creamos una variable para informar si se va a poder o no hacer la retirada
		boolean poder = true;

		// Si quiere retirar mas de lo que tiene en la cuenta
		if (cantidad > saldo) {

			// Cambiamos a false ya que no se puede
			poder = false;

			// Si no
		} else {
			// Le restamos la cantidad al saldo
			saldo -= cantidad;
		}

		// Devolvemos la variable boolean
		return poder;
	}

	/**
	 * Metodo para ingresar dinero en la cuenta
	 * 
	 * @param ingreso Dinero que quiere ingresar
	 */
	void ingresarDinero(double ingreso) {

		// Añadimos el ingreso al saldo
		saldo += ingreso;

	}

	/**
	 * Metodo para mostrar toda la información del objeto
	 */
	void mostrarInformacion() {

		System.out.println("DNI: " + DNI);
		System.out.println("Nombre: " + nombre);
		System.out.println("Dinero en la cuenta: " + saldo);

	}

}
