package maven.ejercicioServletsDos.model;

import javax.persistence.*;

@Entity
@Table(name="categorias")
public class Categoria {
	
	//Declaración de variables y mapeo a los campos de la BD categorias
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	//Constructor sin parametrizar
	public Categoria() {
	}
	
	//Constructor que recibe todos los parámetros menos el ID que se autoincrementa
	public Categoria(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	//Método toString()
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
}