package br.com.vitrinedigital.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;
import br.com.modelo.Estabelecimento;

@Component
public class EstabelecimentoDao {
	
	private final Session session;
	public EstabelecimentoDao(Session session) {
		this.session = session;
	}
	public Estabelecimento carregar(Estabelecimento estab){
		return (Estabelecimento) session.createCriteria(Estabelecimento.class)
				.add(Restrictions.eq("cnpj", estab.getCnpj()))
				.uniqueResult();
	}
	
	public Estabelecimento carregar(long id) {
		return (Estabelecimento) this.session.load(Estabelecimento.class, id);
	}
	public void salvar(Estabelecimento adm) {
		//Transaction tx =  session.beginTransaction();
		session.save(adm);
		//tx.commit();
	}
	public void deletar(Estabelecimento estabelecimento) {
		session.delete(estabelecimento);
	}
	public List<Estabelecimento> listarTudo() {
		return session.createCriteria(Estabelecimento.class).list();
	}
}
