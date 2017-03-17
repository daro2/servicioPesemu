package dad.practica.pesemu.model;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {

	private List<Producto> productos = new ArrayList<>();
	private Usuario usuario;
	private float costeTotal;
	private String fecha;

	public List<Producto> getProductos() {
		return productos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public float getCosteTotal() {
		return costeTotal;
	}

	public String getFecha() {
		return fecha;
	}

}
