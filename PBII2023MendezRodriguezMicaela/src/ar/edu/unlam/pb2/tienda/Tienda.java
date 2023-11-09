package ar.edu.unlam.pb2.tienda;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Tienda {

	private String codigo;
	private String descripcion;
	private Set<Producto> productos;
	private Set<Servicio> servicios;
	private Set<Cliente> clientes;
	private Set<Vendedor> vendedores;
	private Set<Venta> ventas;
	
	
	public Tienda(String codigo, String descripcion) {
		this.codigo=codigo;
		this.descripcion=descripcion;
		this.productos=new HashSet<>();
		this.servicios=new HashSet<>();
		this.clientes=new HashSet<>();
		this.vendedores=new HashSet<>();
		this.ventas=new HashSet<>();
	}

	public void agregarProducto(Producto nuevo) {
		productos.add(nuevo);
	}

	public Producto buscarProducto(String codigo) {
		Producto nuevo = null;
		for (Producto c : productos) {
			if(c.getCodigo().equals(codigo)) {
				nuevo = c;
			}
		}
		return nuevo;
	}
	
	public Cliente buscarCliente(String cuit) {
		Cliente nuevo = null;
		for (Cliente c : clientes) {
			if(c.getCuit().equals(cuit)) {
				nuevo = c;
			}
		}
		return nuevo;
	}
	
	public Vendedor buscarVendedor(String dni) {
		Vendedor nuevo = null;
		for (Vendedor v : vendedores) {
			if(v.getDni().equals(dni)) {
				nuevo = v;
			}
		}
		return nuevo;
	}
	
	public Venta buscarVenta(String codigoTicket) {
		Venta nueva = null;
		for (Venta v : ventas) {
			if(v.getCodigo().equals(codigoTicket)) {
				nueva = v;
			}
		}
		return nueva;
	}
	
	public Vendible getVendible(String codigo) throws VendibleInexistenteException{
		Vendible v = this.buscarProducto(codigo);
		if(v==null) {
			VendibleInexistenteException e = new VendibleInexistenteException();
			throw e;
		} else {
			return v;
		}
	}

	public void agregarProducto(Producto nuevo, Integer cantidad) {
		nuevo.setStock(cantidad);
		productos.add(nuevo);
	}
	
	public Integer getStock(Producto producto) {
		Producto p = this.buscarProducto(producto.getCodigo());
		return  p.getStock();
	}

	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public Cliente getCliente(String cuit) throws ClienteInexistenteException {
		Cliente c = this.buscarCliente(cuit);
		if(c==null) {
			ClienteInexistenteException e = new ClienteInexistenteException();
			throw e;
		} else {
			return c;
		}
	}

	public void agregarVendedor(Vendedor vendedor) {
		vendedores.add(vendedor);
	}

	public Vendedor getVendedor(String dni) throws VendedorInexistenteException{
		Vendedor v = this.buscarVendedor(dni);
		if(v == null) {
			VendedorInexistenteException e = new VendedorInexistenteException();
			throw e;
		} else {
			return v;
		}
	}

	public void agregarVenta(Venta nueva) {
		ventas.add(nueva);
	}

	public void agregarProductoAVenta(String codigoTicket, Producto producto, Integer cantidadVendida) throws VentaInexistenteException, VendibleInexistenteException, StockInsuficienteException {
		Producto p = this.buscarProducto(producto.getCodigo());
		
		if(this.buscarVenta(codigoTicket)==null) {
			VentaInexistenteException e = new VentaInexistenteException();
			throw e;
		} else if (p==null){
			VendibleInexistenteException e2 = new VendibleInexistenteException();
			throw e2;
		} else if (p.getStock()>cantidadVendida) {
			StockInsuficienteException e3 = new StockInsuficienteException();
			throw e3;
		} else {
			//this.buscarVenta(codigoTicket).setProductosVendidos(Map<producto, (String)cantidadVendida>);
		}
	}

	public void agregarServicio(Servicio vendible) {
		servicios.add(vendible);
	}

	public void agregarServicioAVenta(String codigo2, Servicio vendible) {
		
	}

}