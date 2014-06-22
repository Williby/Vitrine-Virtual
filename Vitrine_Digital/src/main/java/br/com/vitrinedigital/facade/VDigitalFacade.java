package br.com.vitrinedigital.facade;

import java.util.List;

import br.com.caelum.vraptor.ioc.Component;
import br.com.modelo.Estabelecimento;
import br.com.modelo.Usuario;
import br.com.vitrinedigital.dao.UsuarioDao;
import br.com.vitrinedigital.dao.EstabelecimentoDao;
import br.com.vitrinedigital.interceptor.UsuarioWeb;

@Component
public class VDigitalFacade {

	private final UsuarioDao usrDao;
	private final UsuarioWeb userinfo;
	private final EstabelecimentoDao estabDao;

	public VDigitalFacade(UsuarioDao admDao,EstabelecimentoDao estabDao,UsuarioWeb userinfo) {
		this.usrDao = admDao;
		this.userinfo = userinfo;
		this.estabDao =estabDao;

	}

	public void logarUsr(Usuario adm) throws Exception {
		Usuario ad = usrDao.carregar(adm);
		if (ad == null) {
			throw new Exception("Login ou senha invalidos");
		}
		this.userinfo.login(ad);
	}

	public void cadastrarUsr(Usuario adm) throws Exception {
		if (usrDao.carregar(adm) != null) {
			throw new Exception("Administrador ja Cadastrado com esse Login!!");
		}
		usrDao.salvar(adm);
	}
	public void deletarUsr(Usuario usr){
		usrDao.deletar(usr);
	}
	
	
	// Metodos do Estabelecimento
	
	public void cadastrarEstabelecimento(Estabelecimento estab) throws Exception {
		if (estabDao.carregar(estab) != null) {
			throw new Exception("Administrador ja Cadastrado com esse Login!!");
		}
		estabDao.salvar(estab);
	}
	public void deletarEstabelecimento(Estabelecimento estab){
		estabDao.deletar(estab);
	}
	public List<Estabelecimento> listaEstabelecimento(){
		return estabDao.listarTudo();
	}
	
	
	
	
	
}