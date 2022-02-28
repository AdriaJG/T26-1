/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.SuministroID;
import com.example.demo.dto.Suministros;
import com.example.demo.services.SuministrosServiceImpl;
import com.example.demo.services.ISuministrosServices;

/**
 * @author Fenrir
 *
 */
@Controller
@RequestMapping("/api")
public class SuministrosController {
	
	@Autowired
	
	SuministrosServiceImpl suministrosServiceImpl;
	
	@GetMapping("/suministroes")
	public List<Suministros> obtenerSuministros(){
		return suministrosServiceImpl.obtenerSuministros();
	}
	
	@GetMapping("/suministroes/{id}")
	public Suministros obtenerSuministrosID(@PathVariable(name="id") SuministroID id) {
		return suministrosServiceImpl.obtenerSuministrosID(id);
	}
	
	@PostMapping("/suministroes")
	public Suministros guardarCajero(@RequestBody Suministros suministro) {
		return suministrosServiceImpl.guardarSuministros(suministro);
	}
	
	@PutMapping("/suministroes/{id}")
	public Suministros modificarSuministros(@RequestBody Suministros suministro, @PathVariable(name="id") SuministroID id) {
		Suministros suministroSeleccionado = new Suministros();
		Suministros suministroModificado = new Suministros();
		suministroSeleccionado = suministrosServiceImpl.obtenerSuministrosID(id);
		suministroSeleccionado.setCodigopieza(suministro.getCodigopieza());
		suministroSeleccionado.setIdproveedor(suministro.getIdproveedor());
		suministroSeleccionado.setPrecio(suministro.getPrecio());
		return suministroModificado = suministrosServiceImpl.guardarSuministros(suministroModificado);
	}
	
	@DeleteMapping("/suministroes/{id}")
	public void eliminarSuministros(@PathVariable(name="id") SuministroID id) {
		suministrosServiceImpl.eliminarSuministros(id);
	}


}
