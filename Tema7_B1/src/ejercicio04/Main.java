package ejercicio04;

public class Main {

	public static void main(String[] args) {
		
		//Creamos el objeto.
		Articulo art= new Articulo ("Colonia", 10.5, 7);
		
		double precio=art.getPVP();
		double precioDescuento=art.getPVPDescuento(0.25);
		
		
		System.out.println(art);
		
		System.out.println(precio);		
		System.out.println(precioDescuento);
		
		art.vender(5);
		
	
		
		
	}

}
