package ejercicio3;

public class Punto {

	/**
	 * Variables de los ejes cartesianos
	 */
	int x, y;

	/**
	 * Contructor con parametros
	 * 
	 * @param x Eje x cartesiano
	 * @param y Eje y cartesiano
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Función que imprime por pantalla el punto
	 */
	void imprime() {
		System.out.println("(" + x + ", " + y + ")");
	}

	/**
	 * Setter de ambos ejes
	 * 
	 * @param x Eje x cartesiano
	 * @param y Eje y cartesiano
	 */
	void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Función para mover un punto
	 * 
	 * @param dx Desplazamiento de x
	 * @param dy Desplazamiento de y
	 */
	void desplaza(int dx, int dy) {

		// Aumentamos x
		x += dx;

		// Aumentamos y
		y += dy;
	}

	/**
	 * Metodo para calcular la distancia entre 2 puntos
	 * 
	 * @param p Punto con el que calcular la distancia
	 * @return Distancia entre los puntos
	 */
	int distacia(Punto p) {

		// Variable de la distancia
		int d;

		// Calculamos la distancia
		d = (int) (Math.sqrt((p.x - x) + (p.y - y)));

		// Devolvemos la distancia
		return d;
	}

	/**
	 * Metodo toString para mostrar
	 */
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

}
