package br.com.vitrinedigital.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.vraptor.ioc.Component;
import br.com.modelo.Produto;

@Component
public class ProdutoDao {
	
	private final Session session;
	public ProdutoDao(Session session) {
		this.session = session;
	}
	
	public void salvar(Produto produto){
		//Transaction tx =  session.beginTransaction();
		session.save(produto);
		//tx.commit();
		
	}
	public Produto carregar(int id){
		return (Produto)this.session.load(Produto.class, id);
	}
	public void update(Produto prod){
		this.session.update(prod);
	}
	
	public void deletar(Produto produto) {
		session.delete(produto);
	}
	public List<Produto> listarTudo() {
		return session.createCriteria(Produto.class).list();
	}

}
