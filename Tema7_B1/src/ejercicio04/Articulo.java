package ejercicio04;

public class Articulo {
	
	private String nombre;
	private double precio;
	public static final double IVA=0.21;
	private int cuantosQuedan;
	
	public Articulo (String nombre, double precio, int cuantosQuedan) {
		
		if (!nombre.isEmpty()&&nombre!=null) {
			
			this.nombre=nombre;
		
		} else {
			
			System.out.println("El nombre introducido no es válido.");
		
		}
	
		if (precio>0) {
			
			this.precio=precio;
			 
		} else {
			
			System.out.println("El precio no puede ser negativo.");
		}
		
		if (cuantosQuedan>=0) {
			
			this.cuantosQuedan=cuantosQuedan;
			
		} else {
			
			System.out.println("El precio no puede ser negativo.");
			
		}
		
	}
	
	public String toString () {
		
		String result="";
		
		result+="Nombre: "+this.nombre+"\n";
		result+="Precio: "+this.precio+"\n";
		result+="IVA: "+IVA+"\n";
		result+="Cantidades en stock: "+this.cuantosQuedan+"\n";
		
		return result;
		
	}
	
	public double getPVP() {
		
		double PVP;
		
		PVP=this.precio+(this.precio*IVA);
		
		return PVP;
	}
	
	public double getPVPDescuento (double descuento) {
		
		double precioDescuento; 
		double precioPVP=getPVP();
		
		precioDescuento=precioPVP-(precioPVP*descuento);
		
		return precioDescuento;
		
	}

	public boolean vender (int cantidad) {
		
		boolean venta=false;
		
		if (this.cuantosQuedan>=cantidad) {
			
			this.cuantosQuedan-=cantidad;
			venta=true;
		}
	
		return venta;
	}
	
	public void almacenar (int cantidad) {
		
		this.cuantosQuedan+=cantidad;
	}
	
}
