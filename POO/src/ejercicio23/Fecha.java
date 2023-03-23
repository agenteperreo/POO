package ejercicio23;

public class Fecha {

	private int dia;
	
	private int mes;
	
	private int año;

	public Fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public Fecha() {
		super();
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	
	public boolean esBisiesto() {
		 
		boolean bisiesto=false;
		
		if(año%4 == 0) {
			 bisiesto=true;
		 }
		
		return bisiesto;
	}
}
