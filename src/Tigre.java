import base.Animal;

public class Tigre extends Animal {
	
	
	private String color;
	
	
	
	
	public Tigre( String color, int edad) {
		
		
		this.color = color;
		this.edad = edad;
		
	}

 public void dormir() {
	 
	 System.out.println("El tigre esta durmiendo");
	 
 }

 
 public void comer() {
	 
	 System.out.println("El tigre esta comiendo");
	 
 }

	@Override
	public Integer getEdad() {
		
		return edad;
	}

 public String getColor() {
	 
	 return color;
	 
 }
	
   
	
	
}
