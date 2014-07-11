package br.com.vitrinedigital.controller;

import java.lang.ProcessBuilder.Redirect;
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
import br.com.modelo.Produto;
import br.com.modelo.Usuario;
import br.com.vitrinedigital.facade.VDigitalException;
import br.com.vitrinedigital.facade.VDigitalFacade;
import br.com.vitrinedigital.interceptor.Restrito;

@Resource
public class ProdutoController {
	
	private Result result;
	private Validator validator;
	private VDigitalFacade facade;
	
	
	public ProdutoController(VDigitalFacade facade,Result result,Validator validator) {
		this.facade = facade;
		this.validator = validator;
		this.result = result;
		
	}
	
	@Restrito
	@Path("/produtos/novo")
	public void formulario(){}
	
	@Restrito
	@Get("/produtos/{id}")
	public Produto editar(int id){
		return facade.carregarProduto(id);
	}
	
	@Restrito
	@Put("/produtos/{produto.id}")
	public void alterar(Produto produto){
		facade.update(produto);
		result.redirectTo(this).lista();
	}
	
	@Restrito
	@Post("/produtos")
	public void adciona(final Produto produto){
		
		//Metodo para Cadastrar um Novo Produto!!!
		try{
			
			facade.cadastrarProduto(produto);
		}catch(VDigitalException vde){
			validator.add(new ValidationMessage(vde.getMessage(), "produto"));

		}
		 this.result.redirectTo(this).lista();
	}
	
	@Restrito
	@Delete("/produtos/{id}")
	public void remove(int id){
		facade.deletarProduto(facade.carregarProduto(id));
		result.redirectTo(this).lista();
	}
	
	@Restrito
	@Get("/produtos")
	public void lista(){
		List<Produto> produtos = facade.listaProduto();
		result.include("produtos", produtos);
		//result.use(Results.json()).from(listProd).serialize();
	}
	
	

}



