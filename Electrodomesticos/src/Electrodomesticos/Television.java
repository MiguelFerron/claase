package Electrodomesticos;

public class Television extends Electrodomestico{
	private int resolucion; // pulgadas
    private boolean sintonizadorTDT; // Si incluye TDT: Televisión Digital Terrestre
	public Television(int precio, String[] color, char ConsumoElectrico, int peso, int resolucion,
			boolean sintonizadorTDT) {
		super(precio, color, ConsumoElectrico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}
	public int getResolucion() {
		return resolucion;
	}
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}
	public boolean SintonizadorTDT() {
		return sintonizadorTDT;
	}
	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
	 public double obtenerPrecioFinal() {
	       double suma = super.preciofinal();
	       if(resolucion > 40){
	           suma += preciobase * 0.3;
	       }
	       if(SintonizadorTDT()){
	           suma += 50;
	       }
	       return suma;
	    }

	    

	    
	}

