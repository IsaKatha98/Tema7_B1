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
		
		this.x=x;
		this.y=y;
		
	}
	
	public String toString () {
		
		String result="";
		
		result+= x+y;
		
		return result;
		
	}
	
	//Aquí va la función del set.
	
	
	/**
	 * 
	 * @param dx
	 * @param dy
	 * @return
	 */
	public int desplaza (int dx, int dy) {
		
		int desplaza;
		
		x+=dx;
		
		y+=dy;
		
		desplaza=x+y;
							
		return desplaza;
	}
	
	/*public int distancia (Punto p) {
		
		int distancia;
		
		
		
	
	}*/
}
