/**
 * 
 */
package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * @author Fenrir
 *
 */
@Entity
@Table(name="suministra")
@IdClass(SuministroID.class)
public class Suministros {
	@Id
	Piezas codigopieza;
	
	@Id
	Proveedores idproveedor;
	
	@Column(name="precio")
	int precio;

	public Suministros() {
		super();
	}

	public Suministros(Piezas codigopieza, Proveedores idproveedor, int precio) {
		super();
		this.codigopieza = codigopieza;
		this.idproveedor = idproveedor;
		this.precio = precio;
	}

	public Piezas getCodigopieza() {
		return codigopieza;
	}

	public void setCodigopieza(Piezas codigopieza) {
		this.codigopieza = codigopieza;
	}

	public Proveedores getIdproveedor() {
		return idproveedor;
	}

	public void setIdproveedor(Proveedores idproveedor) {
		this.idproveedor = idproveedor;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	
	
}
