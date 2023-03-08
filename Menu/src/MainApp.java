public class MainApp {

	public MainApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Menu menuPrincipal;
		String[] opciones = {"Seleccionar juego","Créditos"};
		boolean finSesion = false;
		int result;
		menuPrincipal = new Menu(opciones);
		menuPrincipal.setTitulo("JUEGOS DE TABLERO");
		while (!finSesion) {
			menuPrincipal.mostrarMenu();
			result = menuPrincipal.eligeOpcion();
			switch(result) {
				
				case 1:	// iniciar partida
					System.out.println("\nLanzamos selección de juego\n");					
					break;
				case 2: // Creditos
					System.out.println("\n1wet : 0486 Programación 2023\n");
					break;
				case 0: // salir aplicación
					finSesion= true;
				
			} // switch
		} // while !finSesion
		System.out.println("\nAplicación terminada");

	}

}
