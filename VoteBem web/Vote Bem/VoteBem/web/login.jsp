<%-- 
    Document   : login
    Created on : 06/06/2019, 20:51:47
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
    <link rel="stylesheet" href="CSS/logincss.css">
    
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
						<ul class="navbar-nav ml-md-auto">
                                                    
						<li class="nav-item">
                                                <a class="nav-link" href="CadastroUsuario.jsp"><h4>Cadastrar-se</h4></a>
                                                </li><a class="nav-link" href="CadastroUsuario.jsp"><img src="Icones/cadastrar.svg" widh="28px" height="28px" style="margin-top:10px;margin-right:10px;"></a>
                                                
                                                <li class="nav-item">
                                                    <a class="nav-link" href="index.jsp"><h4>Inicio</h4></a>
                                                 
                                                </li><a class="nav-link" href="index.jsp"><img src="Icones/home.svg" widh="24px" height="24px" style="margin-top:10px;margin-right:10px;"></a>
  
						
					</ul>
				</div>
			</nav>
                    
                    
                  
                    <div class="alert alert-danger">
                    <h3>${mensagem}</h3>
                </div>
                    
                    
                    <h1 align="center" style="font-size: 60px">Entrar</h1>
			<div class="row" >
				<div class="col-md-4">
				</div>
				<div class="col-md-4">
					<form role="form"  action="Login" method="post" style="margin-top: 10%">
                                                <div class="form-group">
							 
							<label for="InputEmail1">
                                                            <h3>Email</h3>
							</label>
							<input name="email" required="true" type="email" class="form-control" id="exampleInputEmail1">
						</div>
						<div class="form-group">
							 
							<label for="InputPassword1">
                                                            <h3>Senha</h3>
							</label>
							<input name="senha" required="true" type="password" class="form-control" id="exampleInputPassword1">
						</div>
				       		  <button type="submit" id="cadastrar" style="margin-top: 5%" class="btn btn-primary col-md-4">
							Entrar
						  </button>
                                                
					</form>
				</div>
				<div class="col-md-4">
				</div>
			</div>
		</div>
	</div>
</div>
  </body>
</html>

