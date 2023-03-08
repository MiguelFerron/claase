package Electrodomesticos;

public class Electrodomestico {
	final String[] colordefault = {"BLANCO"};
	final int pesodefaul = 5; // Kg
	final int preciobase = 100;
	final char[] clasificaciondefault = {'F'};
    
    private int precio; // euros
    private String[] color;
    private char consumoElectrico;
    private int peso; // Kg
	
	public Electrodomestico(int precio, String[] color, char ConsumoElectrico, int peso) {
		super();
		this.precio = precio;
		this.color = color;
		this.consumoElectrico = ConsumoElectrico;
		this.peso = peso;
	}

	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String[] getColor() {
		return color;
	}
	public void setColor(String[] color) {
		this.color = color;
	}
	public char getConsumoElectrico() {
		return consumoElectrico;
	}
	public void setConsumoElectrico(char consumoElectrico) {
		this.consumoElectrico = consumoElectrico;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	  private void comprobarColor(String[] color) {
	        String colores[] = {"blanco", "azul", "negro", "rojo", "gris"};
	        boolean encontrado = false;

	        for (int i = 0; i < colores.length && !encontrado; i++) {
	            if (colores[i].equals(color)) {
	                encontrado = true;
	            }
	        }

	        if (encontrado) {
	            this.color = color;
	        } else {
	            this.color = colordefault;
	        }
	 
	  }
	  


	

	public char comprobarConsumoEnergetico(char letra) {
		return letra;
		
	}
	public double preciofinal() {
		double suma=0;
		double preciofinal =suma + preciobase;
		if (peso >= 0 && peso <= 19) {
            suma += 10;
        } else if (peso >= 20 && peso <= 49) {
            suma += 50;
        } else if (peso >= 50 && peso <= 79) {
            suma += 80;
        } else if (peso >= 80) {
            suma += 100;
        }

        
    return preciofinal;
}
}