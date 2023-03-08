package Electrodomesticos;

import java.util.Scanner;


public class MainApp {

		// TODO Auto-generated constructor stub
		static Scanner teclado = new Scanner(System.in);
		public static void main(String[] args) {
			
			// TODO Auto-generated method stub
			Menu menu1= new Menu(new String []
{"Generar datos aleatoriamente","Modificar el valor de un determinado electrodoméstico","Listar electrodomesticos","Resumen de precios"},
"Electrodomesticos");
			
			String[] elecion;
			elecion = menu1.getOpciones();
		      Scanner sn = new Scanner(System.in);
		       boolean salir = false;
		       int opcion; //Guardaremos la opcion del usuario
		      
		       while(!salir){
		    	 
		    	  
		    	   menu1.mostrarMenu();
		    	   menu1.eligeopcion();
		           opcion = sn.nextInt();
		           
		           switch(opcion){
		           
		               case 1:
		            	   System.out.println(Aleatorio());
		                   break;
		               case 2:
		                   System.out.println("Modificar el valor de un determinado electrodoméstico, solicitando la posición del array y en función de su tipo, solicitar sus atributos específicos.");
		                   break;
		               case 3:
		                   System.out.println("Listado de electrodoméstico indicando su tipo, color y precio final");
		                   break;
		               case 4:
		                   System.out.println(mostrarPreciosFinales());
		                   break;
		                case 0:
		                   salir=true;
		                   System.out.println("Saliendo del programa");
		                   break;
		                default:
		                   System.out.println("Número incorrecto, ingrese número de nuevo");
		           }    
		       }
		      
		}
		

			public static Electrodomestico[] Aleatorio() {

		        Electrodomestico[] lista = new Electrodomestico[10];
		        

		        return lista;
		    }
			
			
			  public static int mostrarPreciosFinales() {

			        int precioFinalElectrodomesticos = 0;
			        int precioFinalLavadoras = 0;
			        int precioFinalTelevisores = 0;

			        Electrodomestico[] lista = e;
					for (Electrodomestico e : lista) {

			            if (e instanceof Television)
			                precioFinalTelevisores += e.preciofinal();
			            else if (e instanceof Lavadora)
			                precioFinalLavadoras += e.preciofinal();

			            precioFinalElectrodomesticos += e.preciofinal();
			        }

			        System.out.println("Precio Final Lavadora" +precioFinalLavadoras);
			        System.out.println("Precio Final Televisor"+ precioFinalTelevisores);
			        System.out.println("Precio Final Electrodomesticos"+ precioFinalElectrodomesticos);
			        return precioFinalElectrodomesticos;
			      
			    }

		}

