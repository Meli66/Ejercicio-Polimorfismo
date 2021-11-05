
import base.Animal;

public class Elefante extends Animal{

	
	private double tamanioTrompa;
	
	
	
	public Elefante( double tamanioTrompa, int edad) {
		
		
		this.tamanioTrompa = tamanioTrompa;
		this.edad = edad;
		
	}


	public void dormir() {
		
		System.out.println("El elefante esta durmiendo");
		
		
	}
	
	
	public void comer() {
		
		
		System.out.println("El elefante esta comiendo");
		
	}
	
	@Override
	public Integer getEdad() {
		
		return edad;
	}
	
	public double getTamanioTrompa() {
		
		return tamanioTrompa;
		
	}



	

	
  
	
	

}
