import java.util.ArrayList;
import java.util.List;
import base.Animal;

public class Principal {
	
	
	public static void main(String[] args) {
	
		

	List<Animal> zoologico = new ArrayList<Animal>();
	
	
            zoologico.add(new Pajaro(150,12));
            zoologico.add(new Pajaro(210,36));
            zoologico.add(new Pajaro(230,38));
            zoologico.add(new Pajaro(250,7));
            
            zoologico.add(new Leon(210,10));
            zoologico.add(new Leon(220,7));
            zoologico.add(new Leon(110,4));
            
            zoologico.add(new Tigre("Claro",12));
            zoologico.add(new Tigre("Oscuro",9));
            
            zoologico.add(new Elefante(1.5,16));
            
            
            System.out.println("EJERCICIO 1: \n ");
              
            System.out.println("Ordenador de forma ascendente: ");
            zoologico.sort((a1,a2) -> a1.getEdad().compareTo(a2.getEdad()));
            
            for(Animal animal : zoologico) {
            	
            	System.out.println(animal.getEdad() + "\n" );
            	
            }
            
            
            System.out.println("Ordenados de forma desendiente: ");
            zoologico.sort((a1,a2 ) -> a2.getEdad().compareTo(a1.getEdad()));

	        for(Animal animal : zoologico) {
	        	
	        	System.out.println(animal.getEdad() + "\n");
	        	
	        }
	        
	        System.out.println(" \n EJERCICIO 2: \n ");
	        
	        int cantidadDeLeones = 0;
	        
	        for(Animal animal : zoologico) {
	        	
	        	if(animal instanceof Leon && ((Leon) animal).getPeso() > 200){
	        		
	        		cantidadDeLeones++;
	        		
	        		
	        	}
	        	
	        	
	        	
	        	
	        }
	        
	        System.out.println("La cantidad de leones con un peso mayor a 200 es de: " + cantidadDeLeones + "\n");
	
	        
	        System.out.println(" \n EJERCICIO 3: \n ");
	
	        
	        int tigresColorOscuro = 0;
	        
	        for(Animal animal : zoologico) {
	        	
	        	if(animal instanceof Tigre && ((Tigre) animal).getColor().equalsIgnoreCase("Oscuro")) {
	        		
	        		tigresColorOscuro++;
	        		
	        	}
	        		
	        	
	        }
	        
	        System.out.println("Los tigres con color de pelo oscuro son: " + tigresColorOscuro + "\n");
	

	        
	       
	        System.out.println(" \n EJERCICIO 4: \n ");
	        
	       
	        
	        long pajarosMayoresA200MetrosY35Age = zoologico.stream()
	        		.filter((a) -> a instanceof Pajaro && (((Pajaro) a).getAlturaMaxima() > 200) && ((Pajaro) a).getEdad() > 35).count();

	        
	        System.out.println("La cantidad de pajaros con vuelo mayor a 200 y edad mayor a 35 es de: " + pajarosMayoresA200MetrosY35Age + "\n");
	        
	        
	        System.out.println(" \n EJERCICIO 5: \n ");
	        
	        
	        
	        long elefantesConTrompaMayorA2Metros = zoologico.stream()
	        		.filter((a) -> a instanceof Elefante && ((Elefante) a).getTamanioTrompa() == 2).count();
	        
	        System.out.println("La cantidad de elefantes con trompa mayor a 2 metros es de: " + elefantesConTrompaMayorA2Metros);
	        
	        
	        
	        
	        
	        
	        
}

  }