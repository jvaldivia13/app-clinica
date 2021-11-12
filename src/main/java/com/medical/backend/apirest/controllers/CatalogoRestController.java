package com.medical.backend.apirest.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.medical.backend.apirest.models.entity.Catalogo;
import com.medical.backend.apirest.models.entity.Diagnostico;
import com.medical.backend.apirest.models.entity.Especialidad;
import com.medical.backend.apirest.models.entity.Profesional;
import com.medical.backend.apirest.models.services.ICatalogoService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class CatalogoRestController {
	
	
	@Autowired
	private ICatalogoService catalogoservice;
	
		
	@Secured({"ROLE_ADMIN"})
	@GetMapping("/catalogo/filtrar-catalogo/{term}")
	@ResponseStatus(HttpStatus.OK)
	public List<Catalogo> filtrarProductos(@PathVariable String term){
		return catalogoservice.findCatalogoByNombre(term);
	}
	
			
	@Secured({"ROLE_ADMIN"})
	@GetMapping("/catalogo/filtrar-elemento")
	@ResponseStatus(HttpStatus.OK)
	public List<Catalogo> filtrarElemento(@RequestParam(required=false) String stabla, 
										  @RequestParam(required=false) String selemento ){
		return catalogoservice.findCatalogoByElemento(stabla,selemento);
	}
	
	
	@Secured({"ROLE_ADMIN"})
	@GetMapping("/catalogo/filtrar-medico")
	@ResponseStatus(HttpStatus.OK)
	public Profesional filtrarMedico(@RequestParam(required=false) String cmp ){
		return catalogoservice.findCatalogoByMedico(cmp);
	}
	
	
	@Secured({"ROLE_ADMIN"})
	@GetMapping("/catalogo/filtrar-medicoid")
	@ResponseStatus(HttpStatus.OK)
	public Profesional filtrarMedicoId(@RequestParam(required=false) int iduser ){
		return catalogoservice.findCatalogoByMedicoxIdUser(iduser);
	}
	
	
	
	
	
	@Secured({"ROLE_ADMIN"})
	@GetMapping("/catalogo/filtrar-diagnostico")
	@ResponseStatus(HttpStatus.OK)
	public List<Diagnostico> filtrarDiagnostico(@RequestParam(required=false) String selemento ){
		return catalogoservice.findCatalogoByDiagnostico(selemento);
	}
	
	@Secured({"ROLE_ADMIN"})
	@GetMapping("/catalogo/filtrar-especialidad")
	@ResponseStatus(HttpStatus.OK)
	public List<Especialidad> filtrarEspecialidad(@RequestParam(required=false) String selemento ){
		return catalogoservice.findCatalogoByEspecialidad(selemento);
	}
		

}
