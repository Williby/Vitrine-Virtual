<%@ include file="../../../inicio.jsp" %>

<body>

<div class="auth-form" id="login">

    <form accept-charset="UTF-8" action="" method="post">

    <div class="auth-form-header">
        <h1 class="dados">Forneça seus dados:</h1>
      </div>
      <div class="auth-form-body">
        <label for="login_field">
        <i class="icon-user"></i>
          Login
        </label>
        <input autocapitalize="off" autocorrect="off" autofocus="autofocus" class="input-block" id="login_field" name="login" tabindex="1" type="text" />

        <label for="password">
        <i class="icon-lock"></i>
          Senha
        </label>
        <input class="input-block" id="password" name="password" tabindex="2" type="password" />

        <input class="btn" name="commit" tabindex="3" type="submit" value="Entrar" />
      </div>
</form>

</div>
<div class="container">
  <div class="site-footer">
    <ul class="site-footer-links">
      <li>© 2014 <span title="0.00812s from github-fe135-cp1-prd.iad.github.net">Vitrine-Digital</span></li>
        
    </ul>
  </div>
</div>
</body>



<!--
 
<div class="span9" id="content">
                      
                    <div class="cadastro">
                       
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
                                          <label class="control-label" for="focusedInput">Nível de acesso:</label>
                                          <div class="controls">
                                            <input class="input-xlarge focused" id="focusedInput" type="text" name="usuario.nivel" >
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








<div class="row-fluid">
              
                        <div class="block">
                            <div class="navbar navbar-inner block-header">
                                <div class="muted pull-left">Tabela Usuários</div>
                            </div>
                            <div class="block-content collapse in">
                                <div class="span12">
                    <table class="table table-bordered">
                          <thead>
                            <tr>
                              <th>#</th>
                              <th>Nome</th>
                              <th>Login</th>
                              
                            </tr>
                          </thead>
                          <tbody>
                            <tr>
                              <td>1</td>
                              <td>Jabes Bonfim</td>
                              <td>Jbonfim</td>
                              
                            </tr>
                            <tr>
                              <td>2</td>
                              <td>Laís Soares</td>
                              <td>Lsoares</td>
                            </tr>
                            <tr>
                              <td>3</td>
                              <td>Rivaldo Junior</td>
                              <td>RJunior</td>
                            </tr>
                          </tbody>
                        </table>
                                </div>
                            </div>
                        </div>

                    </div>                  
-->



