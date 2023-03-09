package ejercicio02;

/**
 * Clase que guarda la información de cada libro de una biblioteca.
 * 
 * @author isabelkatharinaloerzer
 *
 */

public class Libro {

	/**
	 * Atributo título del libro.
	 */
	String titulo;
	
	/**
	 * Atributo autor del libro.
	 */
	String autor;
	
	/**
	 * Atributo referente a la cantidad de ejemplares de ese libro.
	 */
	int numEjemplares;
	
	/**
	 * Atributo referente a la cantidad de ejemplares prestados de un libro.
	 */
	int numEjemplaresPrestados;
	
	/**
	 * Constructor de la clase Libro sin parámetros. Tampoco devuelve nada.
	 */
	public Libro() {
		
	}
	
	/**
	 * Método constructor de la clase Libro.
	 * 
	 * @param titulo
	 * @param autor
	 * @param numEjemplares
	 * @param numEjemplaresPrestados
	 */
	public Libro (String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
		
		this.titulo=titulo;
		this.autor=autor;
		this.numEjemplares=numEjemplares;
		this.numEjemplaresPrestados=numEjemplaresPrestados;
		
		
	}
	
	/**
	 * Método que presta libros. En caso de que el número de ejemplares prestados sea
	 * menor que la cantidad de ejemplares que hay, significa que todavía hay libros 
	 * que se pueden prestar. Si eso ocurre, incrementa el numEjemplaresPrestados en 1
	 * y prestamo es true.
	 * 
	 * @return Devuelve un booleano que si es true es que ha habido un préstamo y si es
	 * false, no ha ocurrido nada.
	 */
	public boolean prestamo() {
		
		boolean prestamo=false;
		
		if (numEjemplares>numEjemplaresPrestados) {
			
			numEjemplaresPrestados++;
			prestamo=true;
			
		}
		
		return prestamo;
	}
	
	/**
	 * Método que devuelve un libro. En el caso en el que haya libros prestados 
	 *(cuando numEjemplaresPrestados es mayor que 0) puede ocurrir una devolución.
	 *En este caso, decrementa numEjemplaresprestados y devolución es true.
	 * 
	 * @return Devuelve un booleano que si es true es que ha habido una devolución y si es
	 * false, no ha ocurrido nada.
	 */
	public boolean devolucion () {
		
		boolean devolucion=false;
		
		if (numEjemplares>=numEjemplaresPrestados&&numEjemplaresPrestados>0) {
			
			numEjemplaresPrestados--;
			devolucion=true;
		}
		
		return devolucion;
	}
}
