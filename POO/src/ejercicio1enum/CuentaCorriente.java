package ejercicio1enum;

public class CuentaCorriente {

	/**
	 * DNI del usuario
	 */
	private String DNI;

	/**
	 * Nombre del usuario
	 */
	private String nombre;

	/**
	 * Saldo de la cuenta corriente
	 */
	private double saldo;

	/**
	 * Enumerado para el sexo del usuario
	 */
	enum Sexo {
		FEMENINO, MASCULINO
	}

	/**
	 * Atributo del enum sexo
	 */
	private Sexo sexo;

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param DNI    DNI del usuario
	 * @param nombre Nombre del usuario
	 * @param saldo  Cantidad de dinero en la cuenta corriente
	 * @param sexo   Sexo del usuario
	 */
	public CuentaCorriente(String DNI, String nombre, double saldo, String sexo) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = saldo;
		this.sexo = Sexo.valueOf(sexo);
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
	 * Metodo get del DNI
	 * 
	 * @return DNI del usuario
	 */
	public String getDNI() {
		return DNI;
	}

	/**
	 * Metodo set del DNI
	 * 
	 * @param dNI Nuevo DNI del usuario
	 */
	public void setDNI(String dNI) {
		DNI = dNI;
	}

	/**
	 * Metodo get del nombre del usaurio
	 * 
	 * @return Nombre sel usuario
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo set del nombre
	 * 
	 * @param nombre Nuevo nombe del usuario
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo get del saldo de la cuenta
	 * 
	 * @return Saldo de la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Metodo set del saldo de la cuenta
	 * 
	 * @param saldo Nuevo saldo de la cuenta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Metodo get del sexo del usuario
	 * 
	 * @return Sexo del usuario
	 */
	public Sexo getSexo() {
		return sexo;
	}

	/**
	 * Metodo set del sexo del usuario
	 * 
	 * @param sexo Nuevo sexo del usuario
	 */
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
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
		System.out.println("Sexo del cliente: " + sexo);

	}

}
