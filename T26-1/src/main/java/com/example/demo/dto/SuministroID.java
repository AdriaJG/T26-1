/**
 * 
 */
package com.example.demo.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Fenrir
 *
 */
public class SuministroID implements Serializable{
	@ManyToOne
	@JoinColumn(name="codigopieza")
	Piezas pieza;

	@ManyToOne
	@JoinColumn(name="idproveedor")
	Proveedores proveedores;

	public SuministroID(Piezas pieza, Proveedores proveedores) {
		super();
		this.pieza = pieza;
		this.proveedores = proveedores;
	}

	public SuministroID() {
		super();
	}

}
