import base.Animal;

public class Pajaro extends Animal {

	
	private double alturaMaxima;
	
	
	
	public Pajaro(double alturaMaxima, int edad) {
		
		
		this.alturaMaxima = alturaMaxima;
		this.edad = edad;
		
	}

	
	public void comer() {
		
		System.out.println("El pajaro esta comiendo");
		
	}

	
	public void dormir() {
		
		System.out.println("El pajaro esta durmiendo");
		
	}

	@Override
	public Integer getEdad() {
		
		return edad;
	}
	
	public double getAlturaMaxima() {
		
		return alturaMaxima;
		
	}

	

	

}
