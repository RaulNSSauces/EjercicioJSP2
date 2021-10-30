package maven.ejercicioServletsDos.model;

import javax.persistence.*;

@Entity
@Table(name="usuarios")
public class Usuario {
	
	//Declaración de variables y mapeo con los campos de la BD
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="id_rol")
	private int idRol;
	
	@Column(name="email")
	private String email;
	
	@Column(name="clave")
	private String clave;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido1")
	private String ape1;
	
	@Column(name="apellido2")
	private String ape2;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="localidad")
	private String localidad;
	
	@Column(name="provincia")
	private String provincia;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="dni")
	private String dni;
	
	//Constructor sin parametrizar
	public Usuario() {
		
	}
	
	//Constructor que recibe todos los parámetros
	public Usuario(int id, int idRol, String email, String clave, String nombre, String ape1, String ape2,
			String direccion, String localidad, String provincia, String telefono, String dni) {
		this.id = id;
		this.idRol = idRol;
		this.email = email;
		this.clave = clave;
		this.nombre = nombre;
		this.ape1 = ape1;
		this.ape2 = ape2;
		this.direccion = direccion;
		this.localidad = localidad;
		this.provincia = provincia;
		this.telefono = telefono;
		this.dni = dni;
	}
	
	//Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApe1() {
		return ape1;
	}

	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}

	public String getApe2() {
		return ape2;
	}

	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	//Método toString()
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", idRol=" + idRol + ", email=" + email + ", clave=" + clave + ", nombre=" + nombre
				+ ", ape1=" + ape1 + ", ape2=" + ape2 + ", direccion=" + direccion + ", localidad=" + localidad
				+ ", provincia=" + provincia + ", telefono=" + telefono + ", dni=" + dni + "]";
	}
}