/**
 * 
 */
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProveedoresDAO;
import com.example.demo.dto.Proveedores;

/**
 * @author Fenrir
 *
 */
@Service
public class ProveedoresServiceImpl implements IProveedoresServices{
	
	@Autowired
	
	IProveedoresDAO iProveedoresDAO;
	
	@Override
	public List<Proveedores> obtenerProveedores() {
		// TODO Auto-generated method stub
		return iProveedoresDAO.findAll();
	}

	@Override
	public Proveedores obtenerProveedoresID(String id) {
		// TODO Auto-generated method stub
		return iProveedoresDAO.findById(id).get();
	}

	@Override
	public Proveedores guardarProveedores(Proveedores proveedor) {
		// TODO Auto-generated method stub
		return iProveedoresDAO.save(proveedor);
	}

	@Override
	public Proveedores modificarProveedores(Proveedores proveedor, String id) {
		// TODO Auto-generated method stub
		return iProveedoresDAO.save(proveedor);
	}

	@Override
	public void eliminarProveedores(String id) {
		// TODO Auto-generated method stub
		iProveedoresDAO.deleteById(id);
	}

}
