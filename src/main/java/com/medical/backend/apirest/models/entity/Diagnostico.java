package com.medical.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name ="adm_diagnostico_mae")
public class Diagnostico implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "cod_dx")
	private String cie;
	
	@Column(name = "nom_dx")
	private String nombre;
	
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "fec_registro")
	@Temporal(TemporalType.DATE)
	private Date fcreacion;
	
	@Column(name = "user_registro")
	private String user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCie() {
		return cie;
	}

	public void setCie(String cie) {
		this.cie = cie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFcreacion() {
		return fcreacion;
	}

	public void setFcreacion(Date fcreacion) {
		this.fcreacion = fcreacion;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	private static final long serialVersionUID = 1L;

}
