package ejercicio02;

public class Main {

	public static void main(String[] args) {
		
		//Creamos un objeto.
		Libro lib=new Libro("Frankestein","Mary Shelley",10, 0);
		
		
		lib.prestamo();
		lib.devolucion();
		System.out.println(lib);
		
		Libro lib2=new Libro ("Bersek 01", "Kentaro Miura", 5, 0);
		
		lib2.prestamo();
		
		System.out.println(lib2);

	}

}
