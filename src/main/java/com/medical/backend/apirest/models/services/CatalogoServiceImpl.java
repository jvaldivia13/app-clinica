package com.medical.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medical.backend.apirest.models.dao.ICatalogoDao;
import com.medical.backend.apirest.models.dao.IDiagnosticoDao;
import com.medical.backend.apirest.models.dao.IEspecialidadDao;
import com.medical.backend.apirest.models.dao.IProfesionalDao;
import com.medical.backend.apirest.models.entity.Catalogo;
import com.medical.backend.apirest.models.entity.Diagnostico;
import com.medical.backend.apirest.models.entity.Especialidad;
import com.medical.backend.apirest.models.entity.Profesional;


@Service
public class CatalogoServiceImpl implements ICatalogoService{
	
	@Autowired
	private ICatalogoDao catalogoDao;
	
	@Autowired
	private IProfesionalDao profesionalDao;
	
	@Autowired
	private IDiagnosticoDao diagnosticoDao;
	
	@Autowired
	private IEspecialidadDao especialidadDao;

	@Override
	@Transactional(readOnly = true)
	public List<Catalogo> findCatalogoByNombre(String term) {
		return catalogoDao.findByNombreContainingIgnoreCase(term);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Catalogo> findCatalogoByElemento(String stabla, String selemento) {
		return catalogoDao.findByElementoCatalogo(stabla, selemento);
	}

	@Override
	@Transactional(readOnly = true)
	public Profesional findCatalogoByMedico(String cmp) {
		return profesionalDao.findByMedico(cmp);
	}

	@Override
	@Transactional(readOnly = true)
	public Profesional findCatalogoByMedicoxIdUser(int iduser) {
		return profesionalDao.findByIdUser(iduser);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Diagnostico> findCatalogoByDiagnostico(String slemento) {
		return diagnosticoDao.findByNombre(slemento);
	}
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Especialidad> findCatalogoByEspecialidad(String slemento) {
		return especialidadDao.findByNombre(slemento);
	}
		
}
