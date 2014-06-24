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
import br.com.vitrinedigital.facade.VDigitalException;
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
	
	public void home(){}
	
	@Get("/estabelecimentos/novo")
	public void formulario(){}
	
	@Get("/estabelecimentos/{cnpj}")
	public Estabelecimento editar(int cnpj){return null;}
	
	@Put("/estabelecimentos/{estabelecimento.cnpj}")
	public void alterar(){}
	
	@Post("/estabelecimentos")
	public void adciona(final Estabelecimento estabelecimento){
		//Metodo para Cadastrar um Novo Estabelecimento!!!
		try{
			facade.cadastrarEstabelecimento(estabelecimento);
		}catch(VDigitalException vde){
			validator.add(new ValidationMessage(vde.getMessage(), "estabelecimento"));

		}
		 this.result.redirectTo(this).lista();
	}
	
	@Delete("/estabelecimentos/{cnpj}")
	public void remove(int cnpj){
		facade.deletarEstabelecimento(facade.carregarEstab(cnpj));
	}
	
	
	@Get("/estabelecimentos")
	public void lista(){
		List<Estabelecimento> listestab = facade.listaEstabelecimento();
		result.use(Results.json()).from(listestab).serialize();
	}
	
	

}
