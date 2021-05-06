package com.example.demo.model;

import com.example.demo.util.TypeCliente;

public class Cliente {
	
	private String id;
	private String nombre;
	private String apellido;
	private String telefono;
	private String correo;
	private String direccion;
	private TypeCliente tipoCliente;
	
	public Cliente() {
	}
	
	public Cliente(String id, String nombre, String apellido, String telefono, String correo, String direccion,
			TypeCliente tipoCliente) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;
		this.tipoCliente = tipoCliente;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public TypeCliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(TypeCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	@Override
	public String toString() {
		return "Cliente [getId()=" + getId() + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido()
				+ ", getTelefono()=" + getTelefono() + ", getCorreo()=" + getCorreo() + ", getDireccion()="
				+ getDireccion() + ", getTipoCliente()=" + getTipoCliente() + "]";
	}
	
}
