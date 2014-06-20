package br.com.vitrinedigital.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.ValidationMessage;

import br.com.vitrinedigital.dao.AdministradorDao;
import br.com.vitrinedigital.facade.VDigitalFacade;
import br.com.vitrinedigital.interceptor.UsuarioWeb;
import br.com.vitrinedigital.modelo.Administrador;

@Resource
public class AdministradorController {
	
	
	private Result result;
	private Validator validator;
	private VDigitalFacade facade;
	
	
	public AdministradorController(VDigitalFacade facade,Result result,Validator validator) {
		this.facade = facade;
		this.validator = validator;
		this.result = result;
		
	}
	
	@Path("/")
	@Get
	public void home(){
		
	}
	
	
	
	

}
