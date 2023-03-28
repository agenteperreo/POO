package ejercicio23;

public class Fecha {

	/**
	 * Numero de dia
	 */
	private int dia;

	/**
	 * Numero del mes
	 */
	private int mes;

	/**
	 * Numero del año
	 */
	private int año;

	/**
	 * Contructor con todos los atributos
	 * 
	 * @param dia Numero de dia
	 * @param mes Numero de mes
	 * @param año Numero de año
	 */
	public Fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	/**
	 * Contructor vacio
	 */
	public Fecha() {
		super();
	}

	/**
	 * Getter del numero de dia
	 * 
	 * @return Numero del dia
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Setter del dia
	 * 
	 * @param dia Nuevo numero de dia
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * Getter del numero del mes
	 * 
	 * @return Numero del mes
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * Setter del numero del mes
	 * 
	 * @param mes Nuevo numero de mes
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}

	/**
	 * Getter del año
	 * 
	 * @return Numero del año
	 */
	public int getAño() {
		return año;
	}

	/**
	 * Setter del año
	 * 
	 * @param año Nuevo año
	 */
	public void setAño(int año) {
		this.año = año;
	}

	/**
	 * Metodo para saber si el año es bisiesto
	 * 
	 * @return Si el año es bisiesto
	 */
	public boolean esBisiesto() {

		// Variables si es bisisesto o no
		boolean bisiesto = false;

		// Si el resto del año entre 4 es 0
		if (año % 4 == 0) {

			// Es un año bisiesto
			bisiesto = true;
		}

		// Devolvemos si es bisiesto o no
		return bisiesto;
	}

	/**
	 * Metodo para ver si la fecha introduciada es correta
	 * 
	 * @return Si la fecha es correcta o no
	 */
	public boolean fechaCorrecta() {

		// Variable si lafecha es correcta o no
		boolean correcta = true;

		// En fución del atributo mes
		switch (mes) {

		// Si mes es 1
		case 1 -> {

			// Si el dia es mayor que 31 o menor que 1
			if (dia > 31 || dia < 1) {
				// La fecha no es correcta
				correcta = false;
			}
		}

		// Si mes es 2
		case 2 -> {

			// Si el año es bisiesto y esl dia es mayor 29 o menor que 1
			if (!esBisiesto() && (dia > 29 || dia < 1)) {

				// La fecha no es correcta
				correcta = false;
			} else if (esBisiesto() && (dia > 28 || dia < 1)) {
				correcta = false;
			}
		}

		// Si mes es 3
		case 3 -> {

			// Si el dia es mayor que 31 o menor que 1
			if (dia > 31 || dia < 1) {
				// La fecha no es correcta
				correcta = false;
			}

		}

		// Si mes es 4
		case 4 -> {

			// Si el dia es mayor que 30 o menor que 1
			if (dia > 30 || dia < 1) {
				// La fecha no es correcta
				correcta = false;
			}
		}

		// Si mes es 5
		case 5 -> {

			// Si el dia es mayor que 31 o menor que 1
			if (dia > 31 || dia < 1) {
				// La fecha no es correcta
				correcta = false;
			}
		}

		// Si mes es 6
		case 6 -> {

			// Si el dia es mayor que 30 o menor que 1
			if (dia > 30 || dia < 1) {
				// La fecha no es correcta
				correcta = false;
			}
		}

		// Si mes es 7
		case 7 -> {

			// Si el dia es mayor que 31 o menor que 1
			if (dia > 31 || dia < 1) {
				// La fecha no es correcta
				correcta = false;
			}
		}

		// Si mes es 8
		case 8 -> {

			// Si el dia es mayor que 31 o menor que 1
			if (dia > 31 || dia < 1) {
				// La fecha no es correcta
				correcta = false;
			}
		}

		// Si mes es 9
		case 9 -> {

			// Si el dia es mayor que 30 o menor que 1
			if (dia > 30 || dia < 1) {
				// La fecha no es correcta
				correcta = false;
			}
		}

		// Si mes es 10
		case 10 -> {

			// Si el dia es mayor que 31 o menor que 1
			if (dia > 31 || dia < 1) {
				// La fecha no es correcta
				correcta = false;
			}
		}

		// Si mes es 11
		case 11 -> {

			// Si el dia es mayor que 30 o menor que 1
			if (dia > 30 || dia < 1) {
				// La fecha no es correcta
				correcta = false;
			}
		}

		// Si mes es 12
		case 12 -> {

			// Si el dia es mayor que 31 o menor que 1
			if (dia > 31 || dia < 1) {
				// La fecha no es correcta
				correcta = false;
			}
		}

		// Si mes es otro
		default -> {

			// La fecha no es correcta
			correcta = false;
		}
		}

		// Si el año es menor que 0
		if (año < 0) {

			// La fecha no es correcta
			correcta = false;
		}

		// Devolvemos si la fecha es correcta o no
		return correcta;
	}

	public void diaSiguiente() {

		dia++;

		if (dia >= 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)) {
			dia = 1;
			mes++;
		}

		if (dia >= 30 && (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
			dia = 1;
			mes++;
		}
	}

	@Override
	public String toString() {
		return "Fecha [" + dia + "-" + mes + "-" + año + "]";
	}

}
