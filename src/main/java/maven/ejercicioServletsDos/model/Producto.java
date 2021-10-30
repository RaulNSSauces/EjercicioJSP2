package maven.ejercicioServletsDos.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="productos")
public class Producto {
	
	//Declaración de variables y mapeo a los campos de la BD productos
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="id_categoria")
	private int idCategoria;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="precio")
	private double precio;
	
	@Column(name="stock")
	private int stock;
	
	@Column(name="fecha_alta")
	private Date fechaAlta;
	
	@Column(name="fecha_baja")
	private Date fechaBaja;
	
	@Column(name="impuesto")
	private float impuesto;
	
	//Constructor sin parametrizar
	public Producto() {
	}
	
	//Constructor que recibe todos los parámetros menos el ID que se autoincrementa
	public Producto(int id, int idCategoria, String nombre, String descripcion, double precio, int stock,
			Date fechaAlta, Date fechaBaja, float impuesto) {
		this.id = id;
		this.idCategoria = idCategoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.impuesto = impuesto;
	}
	
	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public float getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(float impuesto) {
		this.impuesto = impuesto;
	}

	//Método toString()
	@Override
	public String toString() {
		return "Producto [id=" + id + ", idCategoria=" + idCategoria + ", nombre=" + nombre + ", descripcion="
				+ descripcion + ", precio=" + precio + ", stock=" + stock + ", fechaAlta=" + fechaAlta + ", fechaBaja="
				+ fechaBaja + ", impuesto=" + impuesto + "]";
	}
}