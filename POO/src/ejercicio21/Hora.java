package ejercicio21;

public class Hora {

	/**
	 * Horas
	 */
	private int hora;

	/**
	 * Minutos de la hora
	 */
	private int minutos;

	/**
	 * Sgundos de la hora
	 */
	private int segundos;

	/**
	 * Constructor con todos los atributos
	 * 
	 * @param hora     Horas
	 * @param minutos  Minutos
	 * @param segundos Segundos
	 */
	public Hora(int hora, int minutos, int segundos) {
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	/**
	 * Contructor vacío
	 */
	public Hora() {
	}

	/**
	 * Contructor copia
	 * 
	 * @param h Objeto del que copiaremos los valores de los atributos
	 */
	public Hora(Hora h) {
		this.hora = h.hora;
		this.minutos = h.minutos;
		this.segundos = h.segundos;
	}

	/**
	 * Getter de la hora
	 * 
	 * @return hora
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * Setter de la hora
	 * 
	 * @param hora Nuevo valor de la hora
	 */
	public void setHora(int hora) {
		this.hora = hora;
	}

	/**
	 * Getter de los minutos
	 * 
	 * @return minutos
	 */
	public int getMinutos() {
		return minutos;
	}

	/**
	 * Setter de los minutos
	 * 
	 * @param minutos Nuevo valor de los minutos
	 */
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	/**
	 * Getter de los segundos
	 * 
	 * @return segundos
	 */
	public int getSegundos() {
		return segundos;
	}

	/**
	 * Setter de los segundos
	 * 
	 * @param segundos Nuevo valor de los segundos
	 */
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	/**
	 * Metodo para incrementar los segundos y cambiar los valores de los atributos
	 * en función de la logica
	 * 
	 * @param incremento	Cuantos segundos vamos a incrementar a la hora
	 */
	public void incrementarSegundos(int incremento) {

		// Repetimos el bucle tantas veces como segundos en el incremento
		for (int i = 1; i <= incremento; i++) {
			
			// Aumentamos en 1 los segundos
			segundos++;

			// Si los segundos son 60
			if (segundos == 60) {
				// Cambiamos los segundos a 0
				segundos = 0;
				
				// Añadimos 1 minuto
				minutos++;
			}

			// Si los minutos son 60
			if (minutos == 60) {
				
				// cambiamos los minutos a 0
				minutos = 0;
				
				// Aumentamos 1 hora
				hora++;
			}

			// Si la hora es 24
			if (hora == 24) {
				
				// Cambiamos la hora a 0
				hora = 0;
			}
		}

	}

}
