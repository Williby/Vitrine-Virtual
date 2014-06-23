package br.com.vitrinedigital.controller;

import java.util.ArrayList;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.modelo.Estabelecimento;
import br.com.vitrinedigital.facade.VDigitalFacade;

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
	@Path("/estabelecimento")
	
	public void cadastroEstabelecimento(){
		ArrayList<Estabelecimento> lit = (ArrayList<Estabelecimento>) facade.listaEstabelecimento();
		for(Estabelecimento e:lit){
			System.out.println("Estabelecimento: "+e.getNome()+
					"  Usuario: "+e.getUsuario().getNome());
		}
		
	}
	
	@Path("/formulario")
	
	public void formulario(){
		
	}
	@Path("/lista")
	
	public void lista(){
		
	}
	
	

}

	
	
	
	


