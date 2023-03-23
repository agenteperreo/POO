package ejercicio21;

public class Hora {

	private int hora;
	private int minutos;
	private int segundos;

	public Hora(int hora, int minutos, int segundos) {
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public Hora() {
	}

	public Hora(Hora h) {
		this.hora = h.hora;
		this.minutos = h.minutos;
		this.segundos = h.segundos;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public void incrementarSegundos(int incremento) {

		for (int i = 1; i <= incremento; i++) {
			segundos++;

			if (segundos == 60) {
				segundos = 0;
				minutos++;
			}

			if (minutos == 60) {
				minutos = 0;
				hora++;
			}

			if (hora == 24) {
				hora = 0;
			}
		}

	}

}
