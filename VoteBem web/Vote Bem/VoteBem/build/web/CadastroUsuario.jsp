<%-- 
    Document   : index
    Created on : 05/06/2019, 20:39:13
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Vote Bem</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <!-- MAIN SOURCE-->
    <link rel="stylesheet" href="CSS/cadastrousuariocss.css">
    
        <link href="source_files/bootstrap.min.css" rel="stylesheet">
    <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    <!-- Our Custom CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">

    <!-- Font Awesome JS -->
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        
        <script type="text/javascript" src="C:\Users\arthu\js_inicial.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="C:\Users\arthu\Documents\tmssoftware\projJsWeb\css_inicial.css"></link>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
   

  </head>
  <body>

    <div class="container-fluid">
	<div class="row" style="margin-top: 10px;">
		<div class="col-md-12">
			<nav class="navbar navbar-expand-lg navbar-light bg-light navbar-dark bg-dark static-top">
				 <a class="navbar-brand" href="index.jsp"><h1>Vote Bem</h1></a><img src="Icones/votebemlogo.svg" widh="28px" height="35px" style="margin-right:10px;">

				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					
	
					<ul class="navbar-nav ml-md-auto">
						<li class="nav-item">
                                                    <a class="nav-link" href="index.jsp"><h4>Inicio</h4></a>
                                                 
                                                </li><a class="nav-link" href="index.jsp"><img src="Icones/home.svg" widh="24px" height="24px" style="margin-top:10px;margin-right:10px;"></a>
                                                
                                                 <li class="nav-item">
                                                <a class="nav-link" href="login.jsp"><h4>Fazer Login</h4></a>
                                                </li><a class="nav-link" href="login.jsp"><img src="Icones/login.svg" widh="28px" height="28px" style="margin-top:10px;margin-right:10px;"></a>
  
						
					</ul>
				</div>
			</nav>
                    <h1 align="center" style="font-size: 50px">Cadastre-se!</h1>
			<div class="row" >
				<div class="col-md-4">
				</div>
				<div class="col-md-4">
					<form role="form"  action="CadastroUsuario" method="post">
						<div class="form-group">
							 
							<label for="InputNome">
                                                            <h3>Nome</h3>
							</label>
                                                    <input name="nome" required="true"  type="text" class="form-control">
                                                </div>
                                                <div class=" form-group">
                                                    <label for="InputSexo">
                                                        <h3>Sexo</h3>
							</label>
                                                    <select class="form-control" name="sexo">
                                                      <option value="nao Definido">Não Definido</option>  
                                                      <option value="masculino">Masculino</option>
                                                      <option value="feminino">Feminino</option>
                                                      
                                                    </select>
                                                </div>
                                                <div class="form-group">
							 
							<label for="InputEmail1">
                                                            <h3>Email</h3>
							</label>
							<input name="email" type="email" required="true" class="form-control" id="exampleInputEmail1">
						</div>
						<div class="form-group">
							 
							<label for="exampleInputPassword1">
                                                            <h3>Senha</h3>
							</label>
                                                    <input name="senha" type="password" required="true" class="form-control" id="exampleInputPassword1">
						</div>
				       		  <button type="submit" id="cadastrar" class="btn btn-primary col-md-4">
							Cadastrar
						  </button>
                                                                                        
					</form><br><br><br><br>
                                    
                                    
				</div>
                                
				<div class="col-md-4">
				</div>
			</div>
                        <div class="row">
                            <div class="col-md-4"></div>    
                            <div class="col-md-4" style="margin-top: 5%;">
                                <h2>Já tem cadastro? Faça login!</h2>
                                <a href="login.jsp" <button class="btn btn-primary col-md-4 " >
                                    <h3 style="text-decoration: none;color:white;">
                                                Entrar   
                                        </h3>
                                    </button></a>
                            
                        </div>   
                            <div class="col-md-4"></div>    
		   </div>
	</div>
</div>
  </body>
</html>
