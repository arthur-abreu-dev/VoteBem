<%-- 
    Document   : index
    Created on : 05/06/2019, 21:38:10
    Author     : Aluno
--%>

<%@page import="votebem.application.connection.Conexao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Vote Bem</title>
    
    <!-- MAIN SOURCE-->
    <link rel="stylesheet" href="CSS/indexCss.css">
    <link href="CSS/bootstrap.min.css" rel="stylesheet">
    <link href="CSS/style.css" rel="stylesheet">
    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <!-- Font Awesome JS -->
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>        
  </head>
  <body>
      <% Conexao conn = new Conexao();%>
    <div class="container-fluid">
	<div class="row" style="margin-top: 10px;">
		<div class="col-md-12">
			<nav class="navbar navbar-expand-lg navbar-light bg-light navbar-dark bg-dark static-top">
				 
			 <a class="navbar-brand" href="index.jsp"><h1>Vote Bem</h1></a><img src="Icones/votebemlogo.svg" widh="28px" height="35px" style="margin-right:10px;">
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					
	
					<ul class="navbar-nav ml-md-auto">
						<li class="nav-item">
                                                <a class="nav-link" href="CadastroUsuario.jsp"><h4>Cadastrar-se</h4></a>
                                                </li><a class="nav-link" href="CadastroUsuario.jsp"><img src="Icones/cadastrar.svg" widh="28px" height="28px" style="margin-top:10px;margin-right:10px;"></a>
                                                
                                                <li class="nav-item">
                                                <a class="nav-link" href="login.jsp"><h4>Fazer Login</h4></a>
                                                </li><a class="nav-link" href="login.jsp"><img src="Icones/login.svg" widh="28px" height="28px" style="margin-top:10px;margin-right:10px;"></a>
  
  
						
						
					</ul>
				</div>
			</nav>
			<div class="carousel slide" id="carousel-793286">
				<ol class="carousel-indicators">
					<li data-slide-to="1" data-target="#carousel-793286" class="active">
					</li>
					<li data-slide-to="2" data-target="#carousel-793286">
					</li>
					<li data-slide-to="3" data-target="#carousel-793286" >
					</li>
				</ol>
				<div class="carousel-inner">
					<div class="carousel-item active">
						<img class="d-block w-100" alt="Carousel Bootstrap First" src="https://www.layoutit.com/img/sports-q-c-1600-500-1.jpg">
						<div class="carousel-caption">
							<h1 style="font-size:100px;" >
								Vote Bem
							</h1>
							<p>
                                                        <h2>Um quiz eleitoral para exercitar seu conhecimento politico e historico</h2>
							</p>
						</div>
					</div>
					<div class="carousel-item">
						<img class="d-block w-100" alt="Carousel Bootstrap Second" src="https://www.layoutit.com/img/sports-q-c-1600-500-2.jpg">
						<div class="carousel-caption">
							<h1 style="font-size:100px;" >
								Sugira perguntas para outros jogadores
							<p>
                                                        <h2>
                                                            No quiz do vote bem você tem total liberdade para sugerir perguntas para outros jogadores responderem
                                                        </h2>
							</p>
						</div>
					</div>
					<div class="carousel-item ">
						<img class="d-block w-100" alt="Carousel Bootstrap Third" src="https://www.layoutit.com/img/sports-q-c-1600-500-3.jpg">
						<div class="carousel-caption">
							<h1 style="font-size:100px;" >
								Totalmente Gratuito
							</h1>
							<h2>
								Apenas crie uma conta e comece agora mesmo! ou baixe o app para notebooks e desktops
							</h2>
						</div>
					</div>
				</div> <a class="carousel-control-prev" href="#carousel-793286" data-slide="prev"><span class="carousel-control-prev-icon"></span> <span class="sr-only">Previous</span></a> <a class="carousel-control-next" href="#carousel-793286" data-slide="next"><span class="carousel-control-next-icon"></span> <span class="sr-only">Next</span></a>
			</div>
			<div class="row floatPane">
				<div class="col-md-4 floatPane">
					<div class="card" >
						<img class="card-img-top" alt="Bootstrap Thumbnail First" src="https://www.layoutit.com/img/people-q-c-600-200-1.jpg">
						<div class="card-block">
							<h2 class="card-title" align="center">
								Simples e Interativo
							</h2>
							<p class="card-text" align="center">
                                                        <h4 align="center">O Votem bem tem uma interface simplificada para todo mundo usar!<br><br></h4>
							</p>
							<p class="card-text">
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4 floatPane">
					<div class="card">
						<img class="card-img-top" alt="Bootstrap Thumbnail Second" src="https://www.layoutit.com/img/city-q-c-600-200-1.jpg">
						<div class="card-block">
							<h2 class="card-title" align="center">
								É de Graça!
							</h2>
							<p class="card-text" align="center">
                                                        <h4 align="center">Use e abuse desse sistema incrível para testar seu conhecimento totalmente de graça na hora que quiser</h4>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4 floatPane">
					<div class="card">
						<img class="card-img-top" alt="Bootstrap Thumbnail Third" src="https://www.layoutit.com/img/sports-q-c-600-200-1.jpg">
						<div class="card-block">
							<h2 class="card-title" align="center">
								Compartilhe conhecimento
							</h2>
							<p class="card-text" align="center">
                                                        <h4>Aprenda mais e mais respondendo e sugerindo perguntas de diversos temas sobre a politica brasileira</h4>
							</p>
							
						</div>
					</div>
				</div>
			</div>
                        <div class="jumbotron floatPane">
				<h2 align="center">
					Comece hoje mesmo a participar deste quiz incrivel! 
				</h2>
				<p align="center">
					É totalmente gratuito, apenas cadastre-se e participe
				</p>
				<p align="center">
					<a class="btn btn-primary btn-large" href="CadastroUsuario.jsp">Começar</a>
				</p>
			</div>
			<div class="jumbotron floatPane">
				<h2 align="center">
					Baixe agora mesmo!
				</h2>
				<p align="center">
					O app do Votem bem para computadores e notebooks é leve e simples de instalar, é só baixar e abrir!
				</p>
				<p align="center">
					<a class="btn btn-primary btn-large" href="#">Download</a>
				</p>
			</div>
		</div>
	</div>
</div>

    <script src="JavaScript/jquery.min.js"></script>
    <script src="JavaScript/bootstrap.min.js"></script>
    <script src="JavaScript/scripts.js"></script>
  </body>
</html>
