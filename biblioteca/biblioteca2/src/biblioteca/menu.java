package biblioteca;
import java.util.Scanner;

public class menu {
	private String[] opciones;
	private int eleccion;
	private String titulo;
	
	public menu (String[] opciones, String titulo) {		
		this.titulo = titulo;
		this.opciones = new String[opciones.length+1];
		
		for(int i = 1; i<opciones.length+1; i++) {
			this.opciones[i] = opciones[i-1];
		}
		this.opciones[0] = "Salir";

	}
	
	public int iniciarMenu() {
		imprimeTitulo();
		muestraMenu();
		return eligeOpcion();
	}
	
	private void muestraMenu() {
		for(int i=0; i<opciones.length; i++) {
			System.out.println(i+". "+this.opciones[i]);
		}
		
		System.out.println("");
		
		for(int i = 0; i < titulo.length()+4; i++) {
			System.out.print("-");
		}
		System.out.println("\n");
	}
	
	
	
	private void salir () {
		System.out.println("Salir del juego");
	}
	
	
	
	
	private int eligeOpcion() {
		Scanner sc = new Scanner(System.in);
		int numero;
		do {
			System.out.print("Escribe la opción que quieras del 0 al " + (opciones.length-1) + ": " );
			numero = sc.nextInt();
			if(numero >= 0 && numero < opciones.length) {
				break;
			} else {
				System.out.println("Error, vuelve a intentarlo\n");
				continue;
			}
		} while (true);
		
		return numero;
	}
	
	
	
	private void imprimeTitulo() {
		System.out.println("");
		for(int i = 0; i < titulo.length()+4; i++) {
			System.out.print("-");
		}
		
		System.out.print("\n| ");
		System.out.print(titulo);
		System.out.print(" |\n");
		
		for(int i = 0; i < titulo.length()+4; i++) {
			System.out.print("-");
		}
		
		System.out.println("\n");
	}
	
	
	
//getters y setters
	
	

	public String[] getOpciones() {
		return opciones;
	}

	public void setOpciones(String[] opciones) {
		this.opciones = opciones;
	}

	public int getEleccion() {
		return eleccion;
	}

	public void setEleccion(int eleccion) {
		this.eleccion = eleccion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	
	
	
}