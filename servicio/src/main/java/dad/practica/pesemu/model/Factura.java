package dad.practica.pesemu.model;

public class Factura {

	private String titulo;
	private String nombreUsuario;
	private String correo;
	private String fecha;
	private String informacion;

	public Factura() {
		
	}
	
	public Factura(CarritoCompra compra) {
		StringBuilder sb = new StringBuilder();
		titulo = "------- Compra PeSeMu ------\n";
		nombreUsuario = "Usuario: " + compra.getUsuario().getNombre() + "\n";
		correo = "Correo: " + compra.getUsuario().getCorreo() + "\n";
		fecha = "Fecha: " + compra.getFecha() + "\n";
		sb.append("Productos: \n");
		for (Producto producto : compra.getProductos()) {
			sb.append("\t" + producto.getNombre() + ":\t" + producto.getPrecio() + "\n");
		}
		sb.append("Precio total: " + compra.getCosteTotal() + "\n");
		informacion = sb.toString();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getInformacion() {
		return informacion;
	}

	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}

	@Override
	public String toString() {
		return titulo + nombreUsuario + correo + fecha + informacion;
	}

}
