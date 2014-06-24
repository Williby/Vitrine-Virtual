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

	public void logarUsr(Usuario adm) throws VDigitalException {
		Usuario ad = usrDao.carregar(adm);
		if (ad == null) {
			throw new VDigitalException("Login ou senha invalidos");
		}
		this.userinfo.login(ad);
	}

	public void cadastrarUsr(Usuario usr) throws VDigitalException {
		if (usrDao.carregar(usr) != null) {
			throw new VDigitalException("Administrador ja Cadastrado com esse Login!!");
		}
		usrDao.salvar(usr);
	}
	public void deletarUsr(Usuario usr){
		usrDao.deletar(usr);
	}
	public Usuario carregarUsr(int id){
		return usrDao.carregar(id);
	}
	
	public List<Usuario> listaUsuario() {
		// TODO Auto-generated method stub
		return usrDao.listarTudo();
	}
	
	
	// Metodos do Estabelecimento
	public void existeEstabelecimento(){
		
	}
	public void cadastrarEstabelecimento(Estabelecimento estab) throws VDigitalException {
		if (estabDao.carregar(estab) != null) {
			throw new VDigitalException("Estabelecimento ja esta regitrado em nosso Sistema com esse CNPJ!");
		}
		estabDao.salvar(estab);
	}
	public Estabelecimento carregarEstab(int id){
		return estabDao.carregar(id);
	}
	public void deletarEstabelecimento(Estabelecimento estab){
		estabDao.deletar(estab);
	}
	public List<Estabelecimento> listaEstabelecimento(){
		return estabDao.listarTudo();
	}

	
	
	
	
	
	
}