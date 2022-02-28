/**
 * 
 */
package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.SuministroID;
import com.example.demo.dto.Suministros;

/**
 * @author Fenrir
 *
 */
public interface ISuministrosDAO extends JpaRepository<Suministros, SuministroID> {

}
