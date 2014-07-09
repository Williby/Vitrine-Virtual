package br.com.vitrinedigital.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.ValidationMessage;
import br.com.caelum.vraptor.view.Results;
import br.com.modelo.Estabelecimento;
import br.com.modelo.Usuario;
import br.com.vitrinedigital.facade.VDigitalException;
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
	
	public void home(){}
	
	@Get("/usuarios/novo")
	public void formulario(){}
	
	@Get("/usuarios/{id}")
	public Usuario editar(int id){return null;}
	
	@Put("/usuarios/{usuario.id}")
	public void alterar(){}
	
		
	@Post("/usuarios")
	public void adicionar(Usuario usuario) {
		//Metodo para Cadastrar um Novo Estabelecimento!!!
		try{
			facade.cadastrarUsr(usuario);
		}catch(VDigitalException vde){
			validator.add(new ValidationMessage(vde.getMessage(), "usr"));

		}
		 this.result.redirectTo(this).lista();
	}
	
	@Get("/usuarios")
	public void lista(){
		//Metodo que retorna uma lista de Estabelecimento!!!

		List<Usuario> listusuario = facade.listaUsuario();
		//	result.use(Results.json()).from(listusuario).recursive().serialize();
	}
	
	
	
	@Delete("/usuarios/{id}")
	public void remove(int id){
		//Metodo para deletar um  Estabelecimento!!!

		facade.deletarUsr(facade.carregarUsr(id));
	}
	
	

}

	
	
	
	


