package com.medical.backend.apirest.models.services;

import java.util.List;

import com.medical.backend.apirest.models.entity.Catalogo;
import com.medical.backend.apirest.models.entity.Diagnostico;
import com.medical.backend.apirest.models.entity.Especialidad;
import com.medical.backend.apirest.models.entity.Profesional;

public interface ICatalogoService {
	
	public List<Catalogo> findCatalogoByNombre(String term);
	public List<Catalogo> findCatalogoByElemento(String stabla, String selemento);
	public Profesional findCatalogoByMedico(String cmp);
	public Profesional findCatalogoByMedicoxIdUser(int iduser);
	public List<Diagnostico>findCatalogoByDiagnostico(String slemento);
	public List<Especialidad>findCatalogoByEspecialidad(String slemento);

}
