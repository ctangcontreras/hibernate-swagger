package com.javatechie.crud.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "persona", schema = "persona")
public class Persona {

	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SEQUENCE_PERSONA")
    @SequenceGenerator(name = "SEQUENCE_PERSONA", sequenceName = "PERSONA.SEQUENCE_PERSONA", allocationSize=1)
	@Column(name = "PERSONA_ID")
	private Long idPersona;

	@Column(name = "NUMERO_DNI")
	private String dni;

	@Column(name = "APELLIDO_PATERNO")
	private String apellidoPaterno;

	@Column(name = "APELLIDO_MATERNO")
	private String apellidoMaterno;

	@Column(name = "DIRECCION")
	private String direccion;

	@Column(name = "NOMBRE")
	private String nombre;

 
	public Long getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}    

	 
}
