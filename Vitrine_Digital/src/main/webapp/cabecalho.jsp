<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<fmt:setLocale value="${locale}"/>
<!DOCTYPE html">
<html class="no-js">
    
    <head>
        <title>Admin Home Page</title>
        
		<meta charset="UTF-8">
        <!-- <link href="css/bootstrap.min.css" rel="stylesheet" media="screen"> 
        <link href="css/bootstrap-responsive.min.css" rel="stylesheet" media="screen">
        <link href="css/jquery.easy-pie-chart.css" rel="stylesheet" media="screen">
        <link href="css/styles.css" rel="stylesheet" media="screen">
        -->
        <link href="<c:url value="/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css" media="screen" />
        <link href="<c:url value="/css/jquery.easy-pie-chart.css"/>" rel="stylesheet" type="text/css" media="screen" />
        
        <link href="<c:url value="/css/bootstrap-responsive.min.css"/>" rel="stylesheet" type="text/css" media="screen" />
        <link href="<c:url value="/css/styles.css"/>" rel="stylesheet" type="text/css" media="screen" />
        
        <style type="text/css">
        	.row-fluid{width:80%;*zoom:1;margin-left: 140px;}
        	#errors {
				background-color: red;	
			}
			
			
			#errors li {
				width: 750px;
				color: white;
				text-align: left;
				list-style: none;
				margin: 0 auto;
			}
        </style>
       
      </head>
    
    <body>
    <c:if test="${not empty errors}">
		<div id="errors">
			<ul>
				<c:forEach items="${errors }" var="error">
					<li>${error.category } - ${error.message }</li>
				</c:forEach>
			</ul>
		</div>
	</c:if>
	
    <c:if test="${usuarioWeb.logado}">
    <div class="navbar navbar-fixed-top cabecalho">
            <div class="navbar-inner">
                <div class="container-fluid">
                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> <span class="icon-bar"></span>
                     <span class="icon-bar"></span>
                     <span class="icon-bar"></span>
                    </a>
                    <a class="brand" href="#">Vitrine Digital - Administração</a>
                    <div class="nav-collapse collapse">
                        <ul class="nav pull-right">
                            <li class="dropdown">
                                <a href="#" role="button" class="dropdown-toggle" data-toggle="dropdown"> <i class="icon-user"></i> ${usuarioWeb.nome} <i class="caret"></i>
 <i class="caret"></i>

                                </a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <a tabindex="-1" href="#">Perfil</a>
                                    </li>
                                    <li class="divider"></li>
                                    <li>
                                        <a tabindex="-1" href="<c:url value="/logout"/>">Logout</a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                        <ul class="nav">
                           
                            <li class="dropdown">
                                <a href="#" role="button" class="dropdown-toggle" data-toggle="dropdown">Estabelecimento <i class="caret"></i>

                                </a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <a href="<c:url value="/estabelecimentos"/>">Listar</a>
                                    </li>
                                    <li>
                                        <a tabindex="-1" href="<c:url value="/estabelecimentos/novo/formulario"/>">Cadastrar</a>
                                        
                                    </li>
                                    <li>
                                        <a tabindex="-1" href="#">Pesquisar</a>
                                    </li>
                                    
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" role="button" class="dropdown-toggle" data-toggle="dropdown">Usuários <i class="caret"></i>

                                </a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <a tabindex="-1" href="<c:url value="/usuarios"/>">Lista de Usuários</a>
                                    </li>
                                    <li>
                                        <a tabindex="-1" href="#">Pesquisar</a>
                                    </li>
                                    <li>
                                        <a tabindex="-1" href="<c:url value="/usuarios/novo"/>">Cadastrar</a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                    
                </div>
            </div>
        </div>
        </c:if>
        <script type="text/javascript" src="<c:url value="/js/jquery-1.9.1.min.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/js/bootstrap.min.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/js/easypiechart/jquery.easy-pie-chart.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/js/scripts.js"/>"></script>
        <!--  
        <script src="js/jquery-1.9.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/easypiechart/jquery.easy-pie-chart.js"></script>
        <script src="js/scripts.js"></script>
        -->
        <script>
        $(function() {
            $('.chart').easyPieChart({animate: 1000});
        });
        </script>
  

</html>