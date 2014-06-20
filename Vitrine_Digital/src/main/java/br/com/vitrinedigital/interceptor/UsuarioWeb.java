package br.com.vitrinedigital.interceptor;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;
import br.com.vitrinedigital.modelo.Administrador;

@Component
@SessionScoped
public class UsuarioWeb {
	
	private static Administrador logado;
	
	public Administrador getUser(){
		return logado;
	}
	
	public void login(Administrador usuario){
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
