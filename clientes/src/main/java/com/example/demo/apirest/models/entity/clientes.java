package com.example.demo.apirest.models.entity;

import java.io.Serializable;
import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name	="clientes")
public class clientes implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
	private String nombre;
		private String apellido;
			private String email;
			   private String area;
			      private String curso;
			
			
			
			//@Column(name="create_at")
		//@Temporal(TemporalType.DATE)
			private Date createAT;
			public long getId() {
				return id;
			}
			public void setId(long id) {
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
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public Date getCreateAT() {
				return createAT;
			}
			public void setCreateAT(Date createAT) {
				this.createAT = createAT;
			}
			public String getArea() {
				return area;
			}
			public void setArea(String area) {
				this.area = area;
			}
			public String getCurso() {
				return curso;
			}
			public void setCurso(String curso) {
				this.curso = curso;
			}

}
