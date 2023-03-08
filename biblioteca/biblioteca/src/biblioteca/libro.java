package biblioteca;

public class libro {
	private String titulo;
	private String tipoPortada;
	private String ISBN;
	private String nombreAutor;
	private String Editorial;
	
	public libro() {
		this.titulo = "";
		this.tipoPortada = "";
		this.ISBN = "";
		this.nombreAutor = "";
		this.Editorial = "";
	}
	
	public libro(String titulo, String tipoPortada, String ISBN, String nombreAutor, String Editorial) {
		this.titulo = titulo;
		this.tipoPortada = tipoPortada;
		this.ISBN = ISBN;
		this.nombreAutor = nombreAutor;
		this.Editorial = Editorial;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTipoPortada() {
		return tipoPortada;
	}

	public void setTipoPortada(String tipoPortada) {
		this.tipoPortada = tipoPortada;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getNombreAutor() {
		return nombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	public String getEditorial() {
		return Editorial;
	}

	public void setEditorial(String editorial) {
		Editorial = editorial;
	}

	
}
