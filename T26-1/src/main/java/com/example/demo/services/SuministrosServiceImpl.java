/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ISuministrosDAO;
import com.example.demo.dto.SuministroID;
import com.example.demo.dto.Suministros;

/**
 * @author Fenrir
 *
 */
@Service
public class SuministrosServiceImpl implements ISuministrosServices{
	
	@Autowired
	
	ISuministrosDAO iSuministrosDAO;
	
	@Override
	public List<Suministros> obtenerSuministros() {
		// TODO Auto-generated method stub
		return iSuministrosDAO.findAll();
	}

	@Override
	public Suministros obtenerSuministrosID(SuministroID id) {
		// TODO Auto-generated method stub
		return iSuministrosDAO.findById(id).get();
	}

	@Override
	public Suministros guardarSuministros(Suministros suministro) {
		// TODO Auto-generated method stub
		return iSuministrosDAO.save(suministro);
	}

	@Override
	public Suministros modificarSuministros(Suministros suministro, SuministroID id) {
		// TODO Auto-generated method stub
		return iSuministrosDAO.save(suministro);
	}

	@Override
	public void eliminarSuministros(SuministroID id) {
		// TODO Auto-generated method stub
		iSuministrosDAO.deleteById(id);
	}

}
