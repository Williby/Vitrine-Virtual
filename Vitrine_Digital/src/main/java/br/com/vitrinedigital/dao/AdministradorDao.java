package br.com.vitrinedigital.dao;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;
import br.com.vitrinedigital.modelo.Administrador;

@Component
public class AdministradorDao {
	
	private final Session session;
	public AdministradorDao(Session session) {
		this.session = session;
	}
	
	
	public void refresh(Administrador user) {
		session.refresh(user);
	}
	public Administrador carregar(Administrador adm){
		return (Administrador) session.createCriteria(Administrador.class)
				.add(Restrictions.eq("login", adm.getLogin()))
				.add(Restrictions.eq("senha", adm.getSenha()))
				.uniqueResult();
	}
	public Administrador carregar(long id) {
		return (Administrador) this.session.load(Administrador.class, id);
	}
	public void salvar(Administrador adm) {
		//Transaction tx =  session.beginTransaction();
		session.save(adm);
		//tx.commit();
	}
	public void deletar(Administrador adm) {
		session.delete(adm);
	}

}
