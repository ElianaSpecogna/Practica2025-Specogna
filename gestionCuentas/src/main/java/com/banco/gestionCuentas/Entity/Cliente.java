package com.banco.gestionCuentas.Entity;



public class Cliente {
	
	
	private int id;
	private String nombre;
	private String apellido;
	private int dni;
	private String nombreUsuario;
	private String clave;
	private String direccion;
	private String mail;
	private Boolean estado;
	
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(int id, String nombre, String apellido, int dni, String nombreUsuario, String clave,
			String direccion, String mail, Boolean estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.nombreUsuario = nombreUsuario;
		this.clave = clave;
		this.direccion = direccion;
		this.mail = mail;
		this.estado = estado;
	}



	
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}



	public Boolean getEstado() {
		return estado;
	}



	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	
	

}
