<%@ include file="../../../cabecalho.jspf" %>

<form action="<c:url value="/estabelecimentos"/>" method="POST">


	<!-- View ainda sem integracao com backbones -->


 <fieldset>
	 <legend>Adicionar Estabelecimento</legend>
	
	<label for="nome">CNPJ:</label>
	 <input id="nome" type="text" name="estabelecimento.cnpj" />
	 <label for="nome">Nome:</label>
	 <input id="nome" type="text" name="estabelecimento.nome" />
	 <label for="nome">Rua:</label>
	 <input id="nome" type="text" name="estabelecimento.rua" />
	 <label for="nome">Complemento:</label>
	 <input id="nome" type="text" name="estabelecimento.complemento" />
	 <label for="nome">Bairro:</label>
	 <input id="nome" type="text" name="estabelecimento.bairro" />
	 <label for="nome">Cidade:</label>
	 <input id="nome" type="text" name="estabelecimento.cidade" />
	 <label for="nome">Email:</label>
	 <input id="nome" type="text" name="estabelecimento.email" />
	 
	<label for="nome">Usuario:</label>
	 <input id="nome" type="number" name="id" />
	
	 <button id="btCadastrar"type="submit">Cadastrar</button>
	 </fieldset>
 </form>
 
 