<%@ include file="../../../cabecalho.jspf" %>

<form action="<c:url value="/usuarios"/>" method="POST">


	<!-- View ainda sem integracao com backbones -->


 <fieldset>
	 <legend>Adicionar Usuario</legend>
	
	 <label for="nome">Nome:</label>
	 <input id="nome" type="text" name="usuario.nome" />
	 <label for="nome">Login:</label>
	 <input id="nome" type="text" name="usuario.login" />
	 <label for="nome">Senha:</label>
	 <input id="nome" type="password" name="usuario.senha" />
	 <label for="nome">Nivel de acesso:</label>
	 <input id="nome" type="text" name="usuario.nivel" />
	
	 <button id="btCadastrar"type="submit">Cadastrar</button>
	 </fieldset>
 </form>
 
 