package br.com.vitrinedigital.facade;

import java.util.List;

import br.com.caelum.vraptor.ioc.Component;
import br.com.modelo.Estabelecimento;
import br.com.modelo.ImagemProduto;
import br.com.modelo.Produto;
import br.com.modelo.Usuario;
import br.com.vitrinedigital.dao.ImagemProdutoDao;
import br.com.vitrinedigital.dao.ProdutoDao;
import br.com.vitrinedigital.dao.UsuarioDao;
import br.com.vitrinedigital.dao.EstabelecimentoDao;
import br.com.vitrinedigital.interceptor.UsuarioWeb;

@Component
public class VDigitalFacade {

	private final UsuarioDao usrDao;
	private final UsuarioWeb userinfo;
	private final EstabelecimentoDao estabDao;
	private final ProdutoDao prodDao;
	private final ImagemProdutoDao imgprofDao;

	public VDigitalFacade(UsuarioDao admDao,ImagemProdutoDao imgprofDao,EstabelecimentoDao estabDao,ProdutoDao prodDao,UsuarioWeb userinfo) {
		this.usrDao = admDao;
		this.userinfo = userinfo;
		this.estabDao =estabDao;
		this.prodDao = prodDao;
		this.imgprofDao = imgprofDao;

	}

	public Usuario logarUsr(Usuario adm) throws VDigitalException {
		Usuario ad = usrDao.carregar(adm);
		if (ad == null) {
			throw new VDigitalException("Login ou senha invalidos");
		}
		this.userinfo.login(ad);
		return ad;
	}

	public void cadastrarUsr(Usuario usr) throws VDigitalException {
		if (usrDao.carregar(usr) != null) {
			throw new VDigitalException("Administrador ja Cadastrado com esse Login!!");
		}
		usrDao.salvar(usr);
	}
	public void deletarUsr(Usuario usr) throws VDigitalException{
		System.out.println("Usuario é Null?? "+carregarEstabelecimento(usr));
		if(carregarEstabelecimento(usr)==null){
			usrDao.deletar(usr);
			return;
		}
		throw new VDigitalException("Este Usuario estar cadastrado em um Estabelecimento, ele nao Pode ser excluido.");

		
		
	}
	public Usuario carregarUsr(int id){
		return usrDao.carregar(id);
	}
	
	public List<Usuario> listaUsuario() {
		// TODO Auto-generated method stub
		return usrDao.listarTudo();
	}
	public void update(Usuario usr){
		usrDao.update(usr);
	}
	
	
	// Metodos do Estabelecimento
	public void existeEstabelecimento(){
		
	}
	private Estabelecimento carregarEstabelecimento(Usuario usr){
		return estabDao.carregar(usr);
	}
	public void cadastrarEstabelecimento(Estabelecimento estab) throws VDigitalException {
		if (estabDao.carregar(estab) != null) {
			throw new VDigitalException("Estabelecimento ja esta regitrado em nosso Sistema com esse CNPJ!");
		}
		estabDao.salvar(estab);
	}
	public Estabelecimento carregarEstab(String cnpj){
		return estabDao.carregar(cnpj);
	}
	public void deletarEstabelecimento(Estabelecimento estab){
		estabDao.deletar(estab);
	}
	public void update(Estabelecimento est){
		estabDao.update(est);
	}
	public List<Estabelecimento> listaEstabelecimento(){
		return estabDao.listarTudo();
	}
	
	
	
	//Medotos Produtos
	
	public void cadastrarProduto(Produto produto) throws VDigitalException {
		prodDao.salvar(produto);
	}
	public Produto carregarProduto(int id){
		return prodDao.carregar(id);
	}
	public void deletarProduto(Produto produto){
		imgprofDao.deletar(produto);
		prodDao.deletar(produto);
	}
	public List<Produto> listaProduto(){
		return prodDao.listarTudo();
	}
	public void update(Produto prod){
		prodDao.update(prod);
	}
	
	
	// Metodos ImagemProduto
	
	public void cadastrarImgProd(ImagemProduto produto) throws VDigitalException {
		imgprofDao.salvar(produto);
	}
	public ImagemProduto carregarImgProd(int id){
		return imgprofDao.carregar(id);
	}
	public void deletarImgProd(ImagemProduto produto){
		imgprofDao.deletar(produto);
	}
	public List<ImagemProduto> listaImgProd(Produto produto){
		return imgprofDao.listaImag(produto);
	}

	
	
	
	
	
	
}