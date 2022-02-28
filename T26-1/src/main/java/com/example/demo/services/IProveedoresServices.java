package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Proveedores;

public interface IProveedoresServices {
	
	public List<Proveedores> obtenerProveedores();
	
	public Proveedores obtenerProveedoresID(String id);
	
	public Proveedores guardarProveedores(Proveedores proveedor);
	
	public Proveedores modificarProveedores(Proveedores proveedor, String id);
	
	public void eliminarProveedores(String id);
}
