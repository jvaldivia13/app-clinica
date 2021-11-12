package com.medical.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.medical.backend.apirest.models.entity.Diagnostico;

public interface IDiagnosticoDao extends CrudRepository<Diagnostico, Long>{
	
	@Query("select p from Diagnostico p where p.nombre like %?1%")
	public List<Diagnostico> findByNombre(String term);
	
	public List<Diagnostico> findByNombreContainingIgnoreCase(String term);
	
	public List<Diagnostico> findByNombreStartingWithIgnoreCase(String term);

}
