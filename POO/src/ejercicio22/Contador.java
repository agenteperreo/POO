package ejercicio22;

public class Contador {

	/**
	 * Variable privada contador
	 */
	private int cont;

	/**
	 * Caontructor con el atributo
	 * 
	 * @param cont Variable contador
	 */
	public Contador(int cont) {
		this.cont = cont;

		// Si el contador es menor que 0
		if (cont < 0) {

			// Cambiamos el contador a 0
			this.cont = 0;
		}
	}

	/**
	 * Constructor vacio
	 */
	public Contador() {
		super();
	}

	/**
	 * Getter del contador
	 * 
	 * @return contador
	 */
	public int getCont() {
		return cont;
	}

	/**
	 * Setter del contador
	 * 
	 * @param cont Nuevo valor del contador
	 */
	public void setCont(int cont) {
		this.cont = cont;
	}

	/**
	 * Metodo para incrementar en 1 el contador
	 */
	public void incrementar() {
		
		// Añadimos 1 al contador
		cont++;
	}

	/**
	 * Metodo para decrementar en 1 el contador
	 */
	public void decrementar() {
		
		// Restamos 1 al contador
		cont--;
		
		// Si el contador es menor que 0
		if (cont < 0) {
			
			// Lo cambiamos a 0
			cont = 0;
		}
	}
}
