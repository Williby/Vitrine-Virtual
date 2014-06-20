package br.com.vitrinedigital.facade;

import br.com.caelum.vraptor.Resource;
import br.com.vitrinedigital.dao.AdministradorDao;
import br.com.vitrinedigital.interceptor.UsuarioWeb;
import br.com.vitrinedigital.modelo.Administrador;

@Resource
// @SessionScoped
public class VDigitalFacade {

	private final AdministradorDao admDao;
	private final UsuarioWeb userinfo;

	public VDigitalFacade(AdministradorDao admDao,UsuarioWeb userinfo) {
		this.admDao = admDao;
		this.userinfo = userinfo;

	}

	public void logarADM(Administrador adm) throws Exception {
		Administrador ad = admDao.carregar(adm);
		if (ad == null) {
			throw new Exception("Login ou senha invalidos");
		}
		this.userinfo.login(ad);
	}

	public void cadastrarADM(Administrador adm) throws Exception {
		if (admDao.carregar(adm) != null) {
			throw new Exception("Administrador ja Cadastrado com esse Login!!");
		}
		admDao.salvar(adm);
	}

}