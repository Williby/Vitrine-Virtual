package br.com.vitrinedigital.controller;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.vitrinedigital.facade.VDigitalFacade;

@Resource
public class EstabelecimentoController {
	
	private Result result;
	private Validator validator;
	private VDigitalFacade facade;
	
	
	public EstabelecimentoController(VDigitalFacade facade,Result result,Validator validator) {
		this.facade = facade;
		this.validator = validator;
		this.result = result;
		
	}
	
	public void home(){
		
	}

}
