package ejercicio3;

public class Punto {

	int x, y;

	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void imprime() {
		System.out.println("("+x+", "+y+")");
	}
	
	void setXY(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	void desplaza(int dx, int dy) {
		x+=dx;
		y+=dy;
	}
	
	int distacia(Punto p) {
		int d;
		
		d=(int)(Math.sqrt((p.x-x)+(p.y-y)));
		
		return d;
	}
}

