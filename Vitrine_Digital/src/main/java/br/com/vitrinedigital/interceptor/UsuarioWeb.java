package br.com.vitrinedigital.interceptor;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;
import br.com.modelo.Usuario;

@Component
@SessionScoped
public class UsuarioWeb {
	
	private static Usuario logado;
	
	public Usuario getUser(){
		return logado;
	}
	
	public void login(Usuario usuario){
		logado = usuario;
		
	}
	public String getNome(){
		return logado.getNome();
	}
	
	public boolean isLogado(){
		return logado!=null;
	}
	public static void logout(){
		logado = null;
	}
	

}
