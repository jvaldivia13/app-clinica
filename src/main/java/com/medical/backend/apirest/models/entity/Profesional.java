package com.medical.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name ="adm_profesional_mae")
public class Profesional implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "cod_cmp")
	private String cmp;
	
	@Column(name = "des_nombres")
	private String nombre;
	
	@Column(name = "des_apellidos")
	private String apellidos;
	
	@Column(name = "tipo_profesion")
	private String tipoprofesional;
	
	@Column(name = "estado")
	private String estado;
	
	@NotNull(message = "la especialidad no puede ser vacia")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "especialid_id")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Especialidad especialidad;
	
	@Column(name ="usuario_id")
	private int iduser;
		
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

	public String getCmp() {
		return cmp;
	}

	public void setCmp(String cmp) {
		this.cmp = cmp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTipoprofesional() {
		return tipoprofesional;
	}

	public void setTipoprofesional(String tipoprofesional) {
		this.tipoprofesional = tipoprofesional;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public int getIduser() {
		return iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
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
