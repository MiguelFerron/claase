package biblioteca;

public class mainBiblioteca {

public static void main(String[] args) {
		
		String titulo = "Biblioteca";
		String[] opciones = {
				"Añadir libro",
				"Añadir periodico",
				"Listar libros en la biblioteca",
				"Listar periodicos en la biblioteca",
				"Borrar"};
		
		menu menu = new menu(opciones,titulo);
		biblioteca biblioteca = new biblioteca("hola");
		
		biblioteca.inicializar();
		
		while (true) {
			switch(menu.iniciarMenu()) {
			case 0:
				System.out.println("Has cerrado el juego");
				break;
			case 1:
				if(biblioteca.AddLibro()==true) {
					System.out.println("Se ha añadido tu libro!");
					System.out.println("libros en biblioteca: " + biblioteca.totalLibros());
				} else{
					System.out.println("No se ha podido añadir tu libro, ha habido un problema");
				};
				break;
			case 2:
				biblioteca.AddPeriodico();
				break;
			case 3:
				biblioteca.ListaLibros();
				break;
			case 4:
				biblioteca.ListaPeriodico();
				break;
			case 5:
				biblioteca.borrar();
				break;
			default:
				System.out.println("Escribe una opcion, crack");
				break;
				
			}
			
		}
		
	}

}
