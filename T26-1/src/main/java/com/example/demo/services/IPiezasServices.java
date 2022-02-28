package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Piezas;

public interface IPiezasServices {
	
	public List<Piezas> obtenerPiezas();
	
	public Piezas obtenerPiezasID(Long id);
	
	public Piezas guardarPiezas(Piezas pieza);
	
	public Piezas modificarPiezas(Piezas pieza, Long id);
	
	public void eliminarPiezas(Long id);
}
