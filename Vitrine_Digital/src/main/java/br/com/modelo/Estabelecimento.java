package br.com.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;

@Entity

public class Estabelecimento {

	
	@Id	
	private String cnpj;
	
	private String nome;
	private String rua;
	private String compemento;
	private String bairro;
	private String cidade;
	private String email;
	
	// Usuario que vai fazer as operacoes no estabelecimento
	@ManyToOne
    @JoinColumn(name = "usuario")
	private Usuario usuario;
	
	public Estabelecimento() {
		// TODO Auto-generated constructor stub
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCompemento() {
		return compemento;
	}
	public void setCompemento(String compemento) {
		this.compemento = compemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	

}
