package ar.edu.unlam.pb2.tienda;

import java.util.HashMap;
import java.util.Map;

public class Venta {

	private String codigo;
	private Cliente cliente;
	private Vendedor vendedor;
	private Map<Producto, String> productosVendidos;
	
	public Venta(String codigo, Cliente cliente, Vendedor vendedor) {
		this.codigo=codigo;
		this.cliente=cliente;
		this.vendedor=vendedor;
		productosVendidos = new HashMap<>();
	}

	public String getCodigo() {
		return codigo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public Map<Producto, String> getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(Map<Producto, String> productosVendidos) {
		this.productosVendidos = (Map<Producto, String>) productosVendidos;
	}

	public Double getTotal() {
		return null;
	}

	
}
