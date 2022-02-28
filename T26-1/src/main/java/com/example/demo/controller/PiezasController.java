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
import com.example.demo.dto.Piezas;
import com.example.demo.services.PiezasServiceImpl;
import com.example.demo.services.IPiezasServices;

/**
 * @author Fenrir
 *
 */
@Controller
@RequestMapping("/api")
public class PiezasController {
	
	@Autowired
	
	PiezasServiceImpl piezasServiceImpl;
	
	@GetMapping("/piezas")
	public List<Piezas> obtenerPiezas(){
		return piezasServiceImpl.obtenerPiezas();
	}
	
	@GetMapping("/piezas/{id}")
	public Piezas obtenerPiezasID(@PathVariable(name="id") Long id) {
		return piezasServiceImpl.obtenerPiezasID(id);
	}
	
	@PostMapping("/piezas")
	public Piezas guardarCajero(@RequestBody Piezas pieza) {
		return piezasServiceImpl.guardarPiezas(pieza);
	}
	
	@PutMapping("/piezas/{id}")
	public Piezas modificarPiezas(@RequestBody Piezas pieza, @PathVariable(name="id") Long id) {
		Piezas piezaSeleccionado = new Piezas();
		Piezas piezaModificado = new Piezas();
		piezaSeleccionado = piezasServiceImpl.obtenerPiezasID(id);
		piezaSeleccionado.setCodigo(pieza.getCodigo());
		piezaSeleccionado.setNombre(pieza.getNombre());
		return piezaModificado = piezasServiceImpl.guardarPiezas(piezaModificado);
	}
	
	@DeleteMapping("/piezas/{id}")
	public void eliminarPiezas(@PathVariable(name="id") Long id) {
		piezasServiceImpl.eliminarPiezas(id);
	}


}
