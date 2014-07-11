<%@ include file="../../../header.jsp" %>

<script type="text/javascript">
	function editar(){
		alert("redirecionar produto");
	}
<!--

//-->
</script>
<div class="row-fluid">
              
                        <div class="block">
                            <div class="navbar navbar-inner block-header">
                                <div class="muted pull-left">Tabela Produtos</div>
                            </div>
                            <div class="block-content collapse in">
                                <div class="span12">
                    <table class="table table-bordered">
                          <thead>
                            <tr>
                              <th>Nome</th>
                              <th>Preço</th>
                              <th>Categoria</th>
                                                                                      
                            </tr>
                            
                          </thead>
                          <tbody>
                          	<c:forEach items="${produtos}" var="produtos">
	                            <tr>
	                              <td>${produtos.nome}</td>
	                              <th>${produtos.preco}</th>
	                              <th>${produtos.categoria}</th>
	                              <th>
	                              		<form action="<c:url value="/produtos/${produtos.id}"/>" method="POST">
											
											<a><button name="_method" value="DELETE"><i class="icon-remove" ></i></button></a>
										</form>
		                              	
		                              <a href="<c:url value="/produtos/${produtos.id}"/>"><button ><i class="icon-edit"></i></button> </a>
	                              </th>                          
	                            </tr>
                            </c:forEach>
                          </tbody>
                        </table>
                                </div>
                            </div>
                        </div>

                    </div>

