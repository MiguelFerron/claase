package biblioteca;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class biblioteca {
	public String nombre;
	
	public String titulo, tipoPortada, ISBN, nombreAutor, Editorial;
	public String Nombre,Fecha;
	
	libro[] estanteLibros = new libro[10];
	periodico[] estantePeriodico = new periodico[10];
	
	public biblioteca (String nombre) {
		this.nombre = nombre;
		
	}
	
	public void inicializar() {
		for(int i=0; i<estanteLibros.length; i++) {
			estanteLibros[i] = new libro();
		}
		for(int i=0; i<estantePeriodico.length; i++) {
			estantePeriodico[i] = new periodico();
		}
	}
	
	Scanner sc = new Scanner(System.in);
	
	public boolean AddLibro () {
		for(int i=0; i<estanteLibros.length; i++) {
			if(estanteLibros[i].getTitulo().equals("")) {
				sc.nextLine();
				System.out.println("Introduce el titulo: ");
				titulo = sc.nextLine();
				System.out.println("Introduce el tipo de portada: ");
				tipoPortada = sc.nextLine();
				System.out.println("Introduce el ISBN: ");
				ISBN = sc.nextLine();
				System.out.println("Introduce el nombre del autor: ");
				nombreAutor = sc.nextLine();
				System.out.println("Introduce el Editorial: ");
				Editorial = sc.nextLine();

				estanteLibros[i] = new libro(titulo, tipoPortada, ISBN, nombreAutor, Editorial);
				return true;
			}
		}
		
		return false;
	}
	
	public boolean AddPeriodico () {
		String a;
		for(int i=0; i<estantePeriodico.length; i++) {
			if(estantePeriodico[i].getNombre().equals("")) {
				
				System.out.println("Introduce el nombre: ");
				Nombre = sc.nextLine();
				System.out.println("Introduce la fecha: ");
				Fecha = sc.nextLine();

				estantePeriodico[i] = new periodico(Nombre, Fecha);
				return true;
			}
		}

		return false;
	}
	
	public void ListaLibros() {
		for(int i=0; i<estanteLibros.length; i++) {
			if(estanteLibros[i].getTitulo().equals("")) {
				System.out.println();
				System.out.print(i+1 + ". -");
			} else {
				System.out.printf("\n%d. Titulo: %s. ISBN: %s",i+1, estanteLibros[i].getTitulo(), estanteLibros[i].getISBN());
			}
			
		}
	}
	
	public void ListaPeriodico() {
		for(int i=0; i<estantePeriodico.length; i++) {
			if(estantePeriodico[i].getNombre().equals("")){
				System.out.println(i+1 +". -");
			} else {
				System.out.printf("\n%d. Nombre: %s Fecha: %s",i+1, estantePeriodico[i].getNombre(), estantePeriodico[i].getFecha());
			}
			
		}
	}


 	public int totalLibros() {
		int c = 0;
		for(int i=0; i<estanteLibros.length; i++) {
			if(!estanteLibros[i].getTitulo().equals("")){
				c++;
			}
		}
		return c;
	}
	
	public int totalPeriodicos() {
		int c = 0;
		for(int i=0; i<estantePeriodico.length; i++) {
			if(estantePeriodico[i].getNombre().equals("")){
				continue;
			}
			c++;	
		}
		return c;
	}
	
	private void borrarLibro() {
		ListaLibros();
		System.out.println("\n\nIntroduce el número de libro que quieres borrar: ");
		int num = sc.nextInt()-1;
		
		if(num<0 || num>estanteLibros.length){
			System.out.println("Error, introduce un número del 1 al "+estanteLibros.length);
		
		} else if(!estanteLibros[num].getTitulo().equals("")) {
			estanteLibros[num] = new libro();
		
		} else {
			System.out.println("En esa posición no hay ningún libro.");
		}
	}
	
	private void borrarPeriodico() {
		ListaPeriodico();
		System.out.println("Introduce el número de periodico que quieres borrar: ");
		int num = sc.nextInt();
		estantePeriodico[num-1] = new periodico();
	}
	
	public void borrar() {
		System.out.println("¿Que quieres borrar? "
				+ "\n1-libro"
				+ "\n2-periodico\n" + ": ");
		int a = sc.nextInt();
		
		switch (a) {
		case 1:
			borrarLibro();
			break;
		case 2:
			borrarPeriodico();
			break;
		default:
			System.out.println("vuelve a intentarlo");
			borrar();
		}
		
		
	}
	
	
}

