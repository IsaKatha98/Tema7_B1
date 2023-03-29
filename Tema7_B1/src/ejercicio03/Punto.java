package ejercicio03;

public class Punto {
	/**
	 * 
	 */
	int x;

	/**
	 * Atributo y, que hace referencia a un punto en el eje Y
	 */
	int y;

	/**
	 * Constructor de la clase Punto con parámetros
	 * 
	 * @param x
	 * @param y
	 */
	public Punto(int x, int y) {

		this.x = x;
		this.y = y;

	}

	public String toString() {

		String result = "";

		result = "[x = " + this.x + ", y = " + this.y + " ]";

		return result;

	}

	// Aquí va la función del set.

	/**
	 * Método que desplaza las coordenadas iniciales, sumándole los valores pasado
	 * por parámetros.
	 * 
	 * @param dx distancia que desplaza la coordenada x
	 * @param dy distancia que desplaza la coordenada y
	 * @return coordenadas desplazadas
	 */
	public int desplaza(int dx, int dy) {

		int desplaza;

		x += dx;

		y += dy;

		desplaza = x + y;

		return desplaza;
	}

	/**
	 * Método que calcula la distancia entre dos puntos.
	 * 
	 * @param p
	 * @return la distancia entre dos puntos.
	 */
	public double distancia(Punto p) {

		double distancia;

		distancia = Math.sqrt(Math.pow((p.x - x), 2) + Math.pow((p.y - y), 2));

		return distancia;

	}
}
