package br.com.vitrinedigital.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;
import br.com.modelo.Estabelecimento;
import br.com.modelo.Usuario;

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
	public Estabelecimento carregar(Usuario usuario){
			
		String hql = "From Estabelecimento e where e.usuario= :usuario";
		Query query = session.createQuery(hql)
			.setParameter("usuario", usuario);
		
		return (Estabelecimento) query.uniqueResult();
		
	}
	
	public Estabelecimento carregar(String cnpj) {
		return (Estabelecimento) this.session.load(Estabelecimento.class, cnpj);
	}
	public void salvar(Estabelecimento adm) {
		//Transaction tx =  session.beginTransaction();
		session.save(adm);
		//tx.commit();
	}
	public void update(Estabelecimento est){
		this.session.update(est);
	}
	public void deletar(Estabelecimento estabelecimento) {
		session.delete(estabelecimento);
	}
	public List<Estabelecimento> listarTudo() {
		return session.createCriteria(Estabelecimento.class).list();
	}
}
