/***
 * Copyright (c) 2009 Caelum - www.caelum.com.br/opensource
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.vitrinedigital.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.ValidationMessage;
import br.com.vitrinedigital.facade.VDigitalFacade;
import br.com.vitrinedigital.interceptor.UsuarioWeb;
import br.com.vitrinedigital.modelo.Administrador;

/**
 * This class will be responsible to login/logout users.
 * We will use VRaptor URI conventions for this class.
 *
 * For accessing the method doStuff of the class SomethingController,
 * the URI is: /something/doStuff
 *
 */
@Resource
public class HomeController {


	private Result result;
	private Validator validator;
	private VDigitalFacade facade;
	private final UsuarioWeb userinfo;
	
	public HomeController(VDigitalFacade facade,Result result,Validator validator,UsuarioWeb userinfo) {
		this.facade = facade;
		this.validator = validator;
		this.result = result;
		this.userinfo = userinfo;
		
	}

	@Path("/loginForm")
	@Get
	public void loginForm(){
	}
	
	@Post("/login")
	public void login(Administrador adm){
		
		try{
			facade.logarADM(adm);
		}catch(Exception e){
			validator.add(new ValidationMessage(e.getMessage(), "usuario"));
		}
		validator.onErrorUsePageOf(this).loginForm();
		//this.userinfo.login(adm);
		result.redirectTo(AdministradorController.class).home();
	
	}
	
	@Path("/logout")
	public void logout(){
		UsuarioWeb.logout();
		result.redirectTo(this).loginForm();
	}

}
