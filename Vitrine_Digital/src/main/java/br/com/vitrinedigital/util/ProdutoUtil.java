package br.com.vitrinedigital.util;

import java.util.ArrayList;

import br.com.modelo.ImagemProduto;
import br.com.modelo.Produto;

public class ProdutoUtil {
	
	private Produto produto;
	
	private ArrayList<ImagemProduto> listImagem ;
	public ProdutoUtil() {
		// TODO Auto-generated constructor stub
	}
	public ProdutoUtil(Produto produto) {
		this.produto = produto;
	}
	public void addImadem(ImagemProduto imgprod){
		listImagem.add(imgprod);
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public ArrayList<ImagemProduto> getListImagem() {
		return listImagem;
	}
	public void setListImagem(ArrayList<ImagemProduto> listImagem) {
		this.listImagem = listImagem;
	}
	
	

}
