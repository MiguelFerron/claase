package Electrodomesticos;

public class Lavadora extends Electrodomestico{
	private int carga; // kg


    public Lavadora(int precio, String[] color, char ConsumoElectrico, int peso) {
		super(precio, color, ConsumoElectrico, peso);
		// TODO Auto-generated constructor stub
	}


	public int getCarga() {
		return carga;
	}


	public void setCarga(int carga) {
		this.carga = carga;
	}


	public double obtenerPrecioFinal() {
        double suma = super.preciofinal();
        if(carga > 30){
            suma += 50;
        }
        return suma;
     }



}
