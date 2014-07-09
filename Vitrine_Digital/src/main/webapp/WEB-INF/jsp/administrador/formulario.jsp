<%@ include file="../../../cabecalho.jsp" %>
<!--
<form action="<c:url value="/usuarios"/>" method="POST">
 View ainda sem integracao com backbones 


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
 -->
 <body>
 <div class="span9" id="content">
                      <!-- morris stacked chart -->
                    <div class="cadastro">
                        <!-- block -->
                        <div class="block">
                            <div class="navbar navbar-inner block-header">
                                <div class="muted pull-left">Cadastro Usuário</div>
                            </div>
                            <div class="block-content collapse in">
                                <div class="span12">
                                     <form class="form-horizontal" action="<c:url value="/usuarios"/>" method="POST">
                                      <fieldset>
                                        <legend>Dados do Usuário</legend>
                                        <div class="control-group">
                                          <label class="control-label" for="focusedInput">Nome:</label>
                                          <div class="controls">
                                            <input class="input-xlarge focused" id="focusedInput" type="text" name="usuario.nome">
                                          </div>
                                        </div>
                                        <div class="control-group">
                                          <label class="control-label" for="focusedInput">Login:</label>
                                          <div class="controls">
                                            <input class="input-xlarge focused" id="focusedInput" type="text" name="usuario.login">
                                          </div>
                                        </div>
                                        <div class="control-group">
                                          <label class="control-label" for="focusedInput">Senha:</label>
                                          <div class="controls">
                                            <input class="input-xlarge focused" id="focusedInput" type="password" name="usuario.senha" >
                                          </div>
                                        </div>
                                        <div class="control-group">
                                          <label class="control-label" for="select01">Nível de acesso:</label>
                                          <div class="controls">
                                              <select id="select01" class="chzn-select" name="usuario.nivel">
                                              <option></option>
                                              <option>1</option>
                                              <option>2</option>                                              
                                            </select>                                          
                                          </div>                                      
                                        </div>
                                        
                                        <div class="form-actions">
                                          <button type="submit" class="btn btn-primary">Salvar</button>
                                          <button type="reset" class="btn">Cancel</button>
                                        </div> 
                                      </fieldset>
                                    </form>

                                </div>
                            </div>
                        </div>
                       
                    </div>                     