package Biblioteca1;
import java.util.Scanner;
public class Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la altura \n"+"Si usas 0 el programa cerrará el array");
		int altura = sc.nextInt();
		while (!(altura <=0)) {
			funciones n1 = new funciones();
			n1.generaArrayInt();
		}
				}

}
