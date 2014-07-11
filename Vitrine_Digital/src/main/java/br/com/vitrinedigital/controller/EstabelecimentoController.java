package br.com.vitrinedigital.controller;

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
import br.com.vitrinedigital.interceptor.Restrito;

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
	@Restrito
	public void home(){}
	
	@Restrito
	@Get("/estabelecimentos/novo/formulario")
	public void formulario(){}
	
	
	@Restrito
	@Get("/estabelecimentos/{cnpj}")
	public Estabelecimento editar(String cnpj){
		return facade.carregarEstab(cnpj);
	}
	
	@Restrito
	@Put("/estabelecimentos/{estabelecimento.cnpj}")
	public void alterar(Estabelecimento estabelecimento,int id){
		Usuario usr = facade.carregarUsr(id);
		estabelecimento.setUsuario(usr);
		facade.update(estabelecimento);
		result.redirectTo(this).lista();
	}
	
	@Restrito
	@Post("/estabelecimentos")
	public void adciona(final Estabelecimento estabelecimento,int id){
		
		//Metodo para Cadastrar um Novo Estabelecimento!!!
		try{
			Usuario usr = facade.carregarUsr(id);
			estabelecimento.setUsuario(usr);
			facade.cadastrarEstabelecimento(estabelecimento);
		}catch(VDigitalException vde){
			validator.add(new ValidationMessage(vde.getMessage(), "estabelecimento"));

		}
		 this.result.redirectTo(this).lista();
	}
	
	@Restrito
	@Delete("/estabelecimentos/{cnpj}")
	public void remove(String cnpj){
		facade.deletarEstabelecimento(facade.carregarEstab(cnpj));
	}
	
	@Restrito
	@Get("/estabelecimentos")
	public void lista(){
		List<Estabelecimento> estabelecimentos = facade.listaEstabelecimento();
		result.include("estabelecimentos", estabelecimentos);
		//result.use(Results.json()).from(listestab).serialize();
	}
	
	

}
