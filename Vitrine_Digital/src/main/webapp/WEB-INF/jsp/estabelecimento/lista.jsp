<%@ include file="../../../cabecalho.jsp" %>
<div class="row-fluid">
              
                        <div class="block">
                            <div class="navbar navbar-inner block-header">
                                <div class="muted pull-left">Tabela Estabelecimentos</div>
                            </div>
                            <div class="block-content collapse in">
                                <div class="span12">
                    <table class="table table-bordered">
                          <thead>
                            <tr>
                              <th>Nome</th>
                                                           
                            </tr>
                          </thead>
                          <tbody>
                          <c:forEach items="${estabelecimentos}" var="estabelecimentos">
                            <tr>
                              <td>${estabelecimentos.nome}</td>
                              <th>
                              	<a href="<c:url value="/estabelecimentos/${estabelecimentos.cnpj}"/>"><button ><i class="icon-edit"></i></button> </a>
                              
                              </th>                            
                            </tr>
                           </c:forEach>
                          </tbody>
                        </table>
                                </div>
                            </div>
                        </div>

                    </div>

