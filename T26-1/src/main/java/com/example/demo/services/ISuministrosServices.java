package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.SuministroID;
import com.example.demo.dto.Suministros;

public interface ISuministrosServices {
	
	public List<Suministros> obtenerSuministros();
	
	public Suministros obtenerSuministrosID(SuministroID id);
	
	public Suministros guardarSuministros(Suministros suministro);
	
	public Suministros modificarSuministros(Suministros suministro, SuministroID id);
	
	public void eliminarSuministros(SuministroID id);
}
