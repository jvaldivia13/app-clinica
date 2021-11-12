package com.medical.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.medical.backend.apirest.models.entity.Especialidad;

public interface IEspecialidadDao extends CrudRepository<Especialidad, Long>{
	
	@Query("select p from Especialidad p where p.nombre like %?1%")
	public List<Especialidad> findByNombre(String term);
	
	public List<Especialidad> findByNombreContainingIgnoreCase(String term);
	
	public List<Especialidad> findByNombreStartingWithIgnoreCase(String term);

}
