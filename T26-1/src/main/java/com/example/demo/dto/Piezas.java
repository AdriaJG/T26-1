/**
 * 
 */
package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Fenrir
 *
 */
@Entity
@Table(name="piezas")
public class Piezas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(name="nombre")
	String nombre;

	public Piezas(Long dNI, String nomApels) {
		super();
		codigo = dNI;
		this.nombre = nomApels;
	}

	public Piezas() {
		super();
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nomApels) {
		this.nombre = nomApels;
	}

	@Override
	public String toString() {
		return "Piezas [codigo=" + codigo + ", nombre=" + nombre + "]";
	}

}
