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
import com.example.demo.dto.Proveedores;
import com.example.demo.services.ProveedoresServiceImpl;
import com.example.demo.services.IProveedoresServices;

/**
 * @author Fenrir
 *
 */
@Controller
@RequestMapping("/api")
public class ProveedoresController {
	
	@Autowired
	
	ProveedoresServiceImpl proveedoresServiceImpl;
	
	@GetMapping("/proveedors")
	public List<Proveedores> obtenerProveedores(){
		return proveedoresServiceImpl.obtenerProveedores();
	}
	
	@GetMapping("/proveedors/{id}")
	public Proveedores obtenerProveedoresID(@PathVariable(name="id") String id) {
		return proveedoresServiceImpl.obtenerProveedoresID(id);
	}
	
	@PostMapping("/proveedors")
	public Proveedores guardarCajero(@RequestBody Proveedores proveedor) {
		return proveedoresServiceImpl.guardarProveedores(proveedor);
	}
	
	@PutMapping("/proveedors/{id}")
	public Proveedores modificarProveedores(@RequestBody Proveedores proveedor, @PathVariable(name="id") String id) {
		Proveedores proveedorSeleccionado = new Proveedores();
		Proveedores proveedorModificado = new Proveedores();
		proveedorSeleccionado = proveedoresServiceImpl.obtenerProveedoresID(id);
		proveedorSeleccionado.setId(proveedor.getId());
		proveedorSeleccionado.setNombre(proveedor.getNombre());
		return proveedorModificado = proveedoresServiceImpl.guardarProveedores(proveedorModificado);
	}
	
	@DeleteMapping("/proveedors/{id}")
	public void eliminarProveedores(@PathVariable(name="id") String id) {
		proveedoresServiceImpl.eliminarProveedores(id);
	}


}
