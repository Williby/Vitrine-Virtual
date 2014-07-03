package br.com.teste;

import java.io.File;
import java.util.ArrayList;

import javax.persistence.Temporal;
import javax.swing.JOptionPane;

import junit.framework.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.modelo.ImagemProduto;
import br.com.modelo.Produto;
import br.com.vitrinedigital.dao.ImagemProdutoDao;
import br.com.vitrinedigital.dao.ProdutoDao;
import br.com.vitrinedigital.util.ProdutoUtil;

public class Teste {
	
	
	
//	private TweetsDao tweetsDao;
//	private MidiaDao videoDao;
	private ImagemProdutoDao imgpDao;
	private ProdutoDao prodDao;
	private AnnotationConfiguration configuration;
	private SessionFactory factory;
	private Session session ;

	
	public Teste() {
		this.configuration = new AnnotationConfiguration();
		//this.validador = new Validador();
		configuration.configure();
		 this.factory = configuration.buildSessionFactory();
		 this.session = factory.openSession();
		 this.imgpDao = new ImagemProdutoDao(session);
		 this.prodDao = new ProdutoDao(session);
		//twitterUtil = new TwitterUtil();
//		youtubeUtil = new YoutubeUtil();
//		soundcloudUtil = new SoundcloudUtil();
//		this.videoDao = new MidiaDao(session);
//		this.tweetsDao = new TweetsDao(session);
		//inicio();
		 
	}
	
	public void inicio(){
		Produto produto = prodDao.carregar(1);
		ArrayList<ImagemProduto> imgemprod = (ArrayList<ImagemProduto>) imgpDao.listaImag(produto);
		ProdutoUtil produtoUtil = new ProdutoUtil(produto);
		produtoUtil.setListImagem(imgemprod);
		
		for(ImagemProduto img:produtoUtil.getListImagem()){
			System.out.println("Imagem: "+img.getNome());
		}
		
		// UserTwitterDao dao = new UserTwitterDao(session);
		 
		 
		
	}
	public void cadastrarImagProduto(File file,Produto produto){
//		new JOptionPane().showi
		
		ImagemProduto img = new  ImagemProduto();
		
		img.setNome(file.getName());
		img.setLocation("/imgens");
		img.setProduto(produto);
		
		imgpDao.salvar(img);
		
		
		
	}
	public void cadastrarProduto(){
		Produto produto = new Produto();
		produto.setNome("Geladeira");
		produto.setPreco(200.00);
		produto.setDescricao("O Melhor do Mercado");
		
		prodDao.salvar(produto);
	}
	
			 
			 
		 
		 
	
	
	public static void main(String[] args) {
		Teste t= new Teste();
		//t.cadastrarProduto();
	
		t.cadastrarImagProduto(new File("ArquivoNovo2"),t.prodDao.carregar(1));
		t.inicio();
		
	}

}
