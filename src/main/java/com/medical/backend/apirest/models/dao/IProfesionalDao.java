package com.medical.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.medical.backend.apirest.models.entity.Profesional;

public interface IProfesionalDao extends CrudRepository<Profesional, Long> {
	
	@Query("select p from Profesional p where p.cmp =?1")
	public Profesional findByMedico(String cmp);
	
	@Query("select p from Profesional p where p.iduser =?1")
	public Profesional findByIdUser(int iduser);
	
}
