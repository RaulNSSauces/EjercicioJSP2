package maven.ejercicioServletsDos.model;

import javax.persistence.*;

@Entity
@Table(name="roles")
public class Rol {
	
	//Declaración de variables y mapeo con los campos de la BD
	@Id
	@Column(name="id")
	private int id;

	@Column(name="rol")
	private String rol;

	//Constructor sin parametrizar
	public Rol() {
		
	}

	//Constructor que recibe todos los parámetros
	public Rol(String rol) {
		this.rol = rol;
	}

	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	//Método toString()
	@Override
	public String toString() {
		return "Rol [id=" + id + ", rol=" + rol + "]";
	}
}