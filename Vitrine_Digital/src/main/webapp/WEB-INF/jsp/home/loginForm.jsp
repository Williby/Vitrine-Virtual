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
