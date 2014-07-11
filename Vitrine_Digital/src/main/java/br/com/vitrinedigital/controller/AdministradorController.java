package br.com.vitrinedigital.controller;

import java.util.List;

import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.ValidationMessage;
import br.com.modelo.Usuario;
import br.com.vitrinedigital.facade.VDigitalException;
import br.com.vitrinedigital.facade.VDigitalFacade;
import br.com.vitrinedigital.interceptor.Restrito;

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
	
	@Restrito
	public void home(){}
	@Restrito
	@Get("/usuarios/novo")
	public void formulario(){}
	
	@Restrito
	@Get("/usuarios/{id}")
	public Usuario editar(int id){
		return facade.carregarUsr(id);
	}
	
	@Restrito
	@Put("/usuarios/{usuario.id}")
	public void alterar(Usuario usuario){
		facade.update(usuario);
		result.redirectTo(this).lista();
	}
	
	@Restrito	
	@Post("/usuarios")
	public void adicionar(Usuario usuario) {
		try{
			facade.cadastrarUsr(usuario);
		}catch(VDigitalException vde){
			validator.add(new ValidationMessage(vde.getMessage(), "usuario"));

		}
		 this.result.redirectTo(this).lista();
	}
	@Restrito
	@Delete("/usuarios/{id}")
	public void remove(int id){
		//Metodo para deletar um  Usuario!!!

		try {
			facade.deletarUsr(facade.carregarUsr(id));
		} catch (VDigitalException e) {
			// TODO Auto-generated catch block
			validator.add(new ValidationMessage(e.getMessage(), "usuario"));
			
		}finally{
			result.redirectTo(this).lista();
		}
		
	}
	
	@Restrito
	@Get("/usuarios")
	public void lista(){
		//Metodo que retorna uma lista de Estabelecimento!!!
		List<Usuario> usuarios = facade.listaUsuario();
		result.include("usuarios", usuarios);
		//	result.use(Results.json()).from(listusuario).recursive().serialize();
	}
	
	
	
	
	
	

}

	
	
	
	


