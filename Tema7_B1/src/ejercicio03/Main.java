package ejercicio03;

public class Main {

	public static void main(String[] args) {
		
		Punto p= new Punto (7, -5);
		
		System.out.println(p);

		p.desplaza(4, 6);
		
		System.out.println(p);
		
		Punto p2= new Punto (3,4);
		
		
		
		System.out.println(p.distancia(p2));
	}

}
