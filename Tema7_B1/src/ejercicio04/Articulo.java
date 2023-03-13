package ejercicio04;

public class Articulo {
	
	String nombre;
	double precio;
	static final double IVA=0.21;
	int cuantosQuedan;
	
	public Articulo (String nombre, double precio, int cuantosQuedan) {
		
		this.nombre=nombre;
		
		if (precio>0) {
			
			this.precio=precio;
			 
		} else {
			
			System.out.println("El precio no puede ser negativo.");
		}
		
		if (cuantosQuedan>0) {
			
			this.cuantosQuedan=cuantosQuedan;
			
		} else {
			
			//(String)this.cuantosQuedan="El precio no puede ser negativo.";
			
		}
		
		
		
	}
	
	public String toString () {
		
		String result="";
		
		result+="Nombre: "+nombre+"\n";
		result+="Precio: "+precio+"\n";
		result+="IVA: "+IVA+"\n";
		result+="Cantidades en stock: "+cuantosQuedan+"\n";
		
		return result;
		
	}
	
	public double getPVP() {
		
		double PVP;
		
		PVP=precio+(precio*IVA);
		
		return PVP;
	}
	
	public double getPVPDescuento (double descuento) {
		
		double precioDescuento; 
		
		precioDescuento=getPVP()-(getPVP()-descuento);
		
		return precioDescuento;
		
	}

	public boolean vender (int cantidad) {
		
		boolean venta=false;
		
		if (cuantosQuedan>0&&cuantosQuedan>=cantidad) {
			
			cuantosQuedan-=cantidad;
			venta=true;
		}
	
		return venta;
	}
	
	public void almacenar (int cantidad) {
		
		cuantosQuedan+=cantidad;
	}
	
}
