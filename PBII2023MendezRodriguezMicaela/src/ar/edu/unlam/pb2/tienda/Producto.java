package ar.edu.unlam.pb2.tienda;

public class Producto implements Vendible{

	private String codigo;
	private String nombre;
	private double precio;
	private Integer stock;
	
	public Producto(String codigo, String nombre, double precio) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.precio=precio;
		this.stock=0;
	}

	@Override
	public String getCodigo() {
		return this.codigo;
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public Double getPrecio() {
		return this.precio;
	}

	
	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	
}
