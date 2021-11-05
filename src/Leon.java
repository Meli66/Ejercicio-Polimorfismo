
import base.Animal;

public class Leon extends Animal{
    
	
	private double peso;
	
	
	
	
	public Leon(double peso, int edad) {
		
		
		this.edad = edad;
		this.peso = peso;
		
	}

	
	public void dormir () {
		
		System.out.println("El leon esta durmiendo");
		
	}

	
	public void comer() {
		
		
		System.out.println("El leon esta comiendo");
		
	}
	

	@Override
	public Integer getEdad() {
		
		return edad;
	}
	
	public double getPeso() {
		
		return peso;
		
	}
	
	
	
	

}
