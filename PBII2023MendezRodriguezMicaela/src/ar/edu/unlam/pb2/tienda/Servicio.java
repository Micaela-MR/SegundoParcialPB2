package ar.edu.unlam.pb2.tienda;

public class Servicio implements Vendible{

	private String codigo;
	private String nombre;
	private double precio;
	private String fechaInicio;
	private String fechaFin;
	
	public Servicio(String codigo, String nombre, double precio, String fechaInicio, String fechaFin) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.precio=precio;
		this.fechaInicio=fechaInicio;
		this.fechaFin=fechaFin;
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

	public String getFechaInicio() {
		return fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

}
