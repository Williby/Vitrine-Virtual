package br.com.vitrinedigital.dao;

import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.vraptor.ioc.Component;
import br.com.modelo.ImagemProduto;
import br.com.modelo.Produto;

@Component
public class ImagemProdutoDao {
	
	private final Session session;
	public ImagemProdutoDao(Session session) {
		this.session = session;
	}
	public void salvar(ImagemProduto imgprod){
		//Transaction tx =  session.beginTransaction();
		session.save(imgprod);
		//tx.commit();
		
	}
	public ImagemProduto carregar(int id){
		return (ImagemProduto) this.session.load(ImagemProduto.class, id);
	}
	public void deletar(ImagemProduto imgprod){
		this.session.delete(imgprod);
	}
	public void deletar(Produto produto){
		List<ImagemProduto> list = listaImag(produto);
		System.out.println("Exist produto?? "+list);
		if(list!=null){
			for(ImagemProduto imgp:list){
				deletar(imgp);
			}
			
		}
		
		
	}
	public List<ImagemProduto> listaImag(Produto  produto){
//		String hql = "from User u where u.login = :login";
//		Query query = session.createQuery(hql).setParameter("login", login);
//		return (User) query.uniqueResult();
		String hql ="From ImagemProduto imp where imp.produto= :produto";
		Query q= (Query) session.createQuery(hql).setParameter("produto", produto);
		
		return q.list();
		

	}
//	@SuppressWarnings("unchecked")
//	public Collection<Tweets> carrega(UserTwitter userTwitter) {
//		
//        //Transaction tx = null;
//        Collection<Tweets> t = null;
//        try {
//            Query q;
//            //tx = session.beginTransaction();
//            q = session.createQuery("FROM Tweets as t where t.usertwitter=:userTwitter");
//            q.setParameter("userTwitter", userTwitter);
//            t = q.list();
//            //System.out.println("QuerySize: "+t.size());
//            return t;
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            return t;
//        }
//
//	}

}
