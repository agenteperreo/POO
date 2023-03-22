package ejercicio22;

public class Contador {

	private int cont;

	public Contador(int cont) {
		this.cont = cont;
		
		if(cont<0) {
			this.cont=0;
		}
	}

	public Contador() {
		super();
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
	public void incrementar() {
		cont++;
	}
	
	public void decrementar() {
		cont--;
		if(cont<0) {
			cont=0;
		}
	}
}
