package br.com.vitrinedigital.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;
import br.com.modelo.Estabelecimento;
import br.com.modelo.Usuario;

@Component
public class UsuarioDao {
	
	private final Session session;
	public UsuarioDao(Session session) {
		this.session = session;
	}
	
	
	public void refresh(Usuario user) {
		session.refresh(user);
	}
	public Usuario carregar(Usuario usr){
		return (Usuario) session.createCriteria(Usuario.class)
				.add(Restrictions.eq("login", usr.getLogin()))
				.add(Restrictions.eq("senha", usr.getSenha()))
				.uniqueResult();
	}
	public Usuario carregar(int id) {
		return (Usuario) this.session.load(Usuario.class, id);
	}
	public void update(Usuario usr){
		this.session.update(usr);
	}
	public void salvar(Usuario usr) {
		//Transaction tx =  session.beginTransaction();
		session.save(usr);
		//tx.commit();
	}
	public void deletar(Usuario usr) {
		session.delete(usr);
	}
	public List<Usuario> listarTudo() {
		return session.createCriteria(Usuario.class).list();
	}

}
