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
    
        <!-- Bootstrap CSS CDN -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    <!-- Our Custom CSS -->
    <link rel="stylesheet" href="CSS/style3.css">
    <!-- Scrollbar Custom CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css">

    <!-- Font Awesome JS -->
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js" integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY" crossorigin="anonymous"></script>

  </head>
  <body>
      <div class="wrapper">
          <nav id="sidebar">
            <div id="dismiss">
                <i class="fas fa-arrow-left"></i>
            </div>
            <ul class="list-unstyled components">
                <h1 align="center">Menu</h1>
                <li >
                    <a href="Perfil.jsp" ><h3>Perfil</h3> </a>
                   
                </li>
                <li>
                    <a href="ResponderQuestoes.jsp"><h3>Responder Questões</h3></a>
                    
                </li>
                <li>
                    <a href="SugerirQuestoes.jsp"><h3>Sugerir Questões</h3></a>
                </li>
                <li>
                    <a href="Ranking.jsp"><h3>Ranking</h3></a>
                </li>
                <li>
                    <a href="Ajuda.jsp"><h3>Ajuda</h3></a>
                </li>
                <li>
                    <a href="Info.jsp"><h3>Info</h3></a>
                </li>
            </ul>

            <ul class="list-unstyled CTAs">
                <li>
                    <a href="https://bootstrapious.com/tutorial/files/sidebar.zip" class="download">Download para Desktop</a>
                </li>
            </ul>
        </nav>
    <div class="container-fluid">
	<div class="row" style="margin-top: 10px;">	
            <div class="col-md-12">
			<nav class="navbar navbar-expand-lg navbar-light bg-light navbar-dark bg-dark static-top">
			<img src="Icones/menu.svg" widh="24px" height="35px" style="cursor:pointer;margin-right: 20px;" id="sidebarCollapse"/>

			 <a class="navbar-brand" href="index.jsp"><h1>Vote Bem</h1></a><img src="Icones/votebemlogo.svg" widh="28px" height="35px" style="margin-right:10px;">
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					
	
					<ul class="navbar-nav ml-md-auto">
						<li class="nav-item">
                                                    <a class="nav-link" href="index.jsp"><h4>Inicio</h4></a>
                                                 
                                                </li><a class="nav-link" href="index.jsp"><img src="Icones/home.svg" widh="24px" height="24px" style="margin-top:10px;margin-right:10px;"></a>
  
						<li class="nav-item">
                                                    <a class="nav-link" href="login.jsp"><h4>Sair</h4></a>
                                                </li><a class="nav-link" href="login.jsp"><img src="Icones/logout.svg" widh="28px" height="28px" style="margin-top:10px;margin-right:10px;"></a>
                                                
					</ul>
				</div>
			</nav>

		</div>
	</div>
</div>
      </div>
    <script src="JavaScript/jquery.min.js"></script>
    <script src="JavaScript/bootstrap.min.js"></script>
    <script src="JavaScript/scripts.js"></script>
    <div class="overlay"></div>

    <!-- jQuery CDN - Slim version (=without AJAX) -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <!-- Popper.JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
    <!-- Bootstrap JS -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
    <!-- jQuery Custom Scroller CDN -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js"></script>

    <script type="text/javascript">
        $(document).ready(function () {
            $("#sidebar").mCustomScrollbar({
                theme: "minimal"
            });

            $('#dismiss, .overlay').on('click', function () {
                $('#sidebar').removeClass('active');
                $('.overlay').removeClass('active');
            });

            $('#sidebarCollapse').on('click', function () {
                $('#sidebar').addClass('active');
                $('.overlay').addClass('active');
                $('.collapse.in').toggleClass('in');
                $('a[aria-expanded=true]').attr('aria-expanded', 'false');
            });
        });
    </script>
  </body>
</html>
