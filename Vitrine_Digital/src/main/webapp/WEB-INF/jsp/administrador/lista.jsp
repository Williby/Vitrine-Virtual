<%@ include file="../../../cabecalho.jsp" %>
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
                              <th>Nome</th>
                              <th>Login</th>
                              <th>Nivel Acesso</th>
                                                            
                            </tr>
                          </thead>
                          <tbody>
                          <c:forEach items="${usuarios}" var="usuarios">
                            <tr>
                              <td>${usuarios.nome}</td>
                              <td>${usuarios.login}</td>
                              <td>${usuarios.nivel}</td>
                              <th>
                              	<form action="<c:url value="/usuarios/${usuarios.id}"/>" method="POST">
											
											<a><button name="_method" value="DELETE"><i class="icon-remove" ></i></button></a>
										</form>
		                              	
		                              <a href="<c:url value="/usuarios/${usuarios.id}"/>"><button ><i class="icon-edit"></i></button> </a>
                              	
                              
                              </th>
                              
                            </tr>
                           </c:forEach>
                          </tbody>
                        </table>
                                </div>
                            </div>
                        </div>

                    </div>