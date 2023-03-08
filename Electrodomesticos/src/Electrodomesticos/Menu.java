package Electrodomesticos;



import java.util.Scanner;

public class Menu {
	
	public String titulo; // El título del menú. 
	public String [] opciones; // Un array en el que se proyectarán las opciones. 


	
	public Menu (String [] opciones, String titulo) {
		int a=opciones.length;
		this.opciones = opciones;
		this.titulo= titulo;
	}
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String[] getOpciones() {
		return opciones;
	}

	public void setOpciones(String[] opciones) {
		this.opciones = opciones;
	}

	public void eligeopcion () {
	      Scanner sn = new Scanner(System.in);
	       int opcion; //Guardaremos la opcion del usuario
	        
	    
	            
	    	   
     System.out.println("Escribe una de las opciones");

	
	}
	public void mostrarMenu () {
			
			System.out.println ("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
			System.out.println ("♡♡"+titulo+"♡♡");
			System.out.println ("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
			for (int i=0; i<opciones.length; i++) {
				
				System.out.println ((i+1)+". "+opciones [i]+".");
				
			}
			
			System.out.println ("0. Salir del programa.");
			
		}

}
   
