/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPiezasDAO;
import com.example.demo.dto.Piezas;

/**
 * @author Fenrir
 *
 */
@Service
public class PiezasServiceImpl implements IPiezasServices{
	
	@Autowired
	
	IPiezasDAO iPiezasDAO;
	
	@Override
	public List<Piezas> obtenerPiezas() {
		// TODO Auto-generated method stub
		return iPiezasDAO.findAll();
	}

	@Override
	public Piezas obtenerPiezasID(Long id) {
		// TODO Auto-generated method stub
		return iPiezasDAO.findById(id).get();
	}

	@Override
	public Piezas guardarPiezas(Piezas pieza) {
		// TODO Auto-generated method stub
		return iPiezasDAO.save(pieza);
	}

	@Override
	public Piezas modificarPiezas(Piezas pieza, Long id) {
		// TODO Auto-generated method stub
		return iPiezasDAO.save(pieza);
	}

	@Override
	public void eliminarPiezas(Long id) {
		// TODO Auto-generated method stub
		iPiezasDAO.deleteById(id);
	}

}
