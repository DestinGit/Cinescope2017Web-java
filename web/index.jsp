<%--
    Document : index.jsp
    Author : pascal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <!--        <meta http-equiv="refresh" content="0; URL=/ServletsJSPJSTLCours/ControleurPrincipal"> -->
        <title>Cinescope 2017</title>
        <!-- Font Awesome -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">-->

        <!-- Material Design Bootstrap -->
        <link href="css/mdb.min.css" rel="stylesheet">
        <!-- Your custom styles (optional) -->
        <link href="css/style.css" rel="stylesheet">
        <link href="css/personalStylesheet.css" rel="stylesheet">
    </head>
    <body>
        <!--Main Navigation-->
        <header>
            <!--Mask-->
            <div  id="intro" class="view hm-black-strong">

                <div class="container-fluid full-bg-img d-flex align-items-center justify-content-center">

                    <div class="row d-flex justify-content-center">

                        <div class="col-md-10 text-center">
                            <!-- Heading -->
                            <h2 class="display-3 font-bold white-text mb-2">Cinescope 2017</h2>

                            <!-- Divider -->
                            <hr class="hr-light">

                            <!-- Description -->
                            <h4 class="white-text my-4">Merci d'utiliser notre produit. Nous sommes heureux que vous soyez avec nous.</h4>
                            <!--<p class="animated fadeIn text-muted">Destiny's Team</p>-->
                            <!--<button type="button" class="btn btn-outline-white">Read more<i class="fa fa-book ml-2"></i></button>-->
                            <a href="/Cinescope2017Web/MainController" class="btn btn-info">cliquer pour acceder au site<i class="fa fa-book ml-2"></i></a>

                        </div>

                    </div>
                </div>

            </div>
            <!--/.Mask-->
        </header>
        <!--Main Navigation-->

        <!--Main layout-->
        <main>

        </main>
        <!--Main layout-->

        <!--Footer-->
        <footer>

        </footer>
        <!--Footer-->    

        <%
//            response.sendRedirect("/Cinescope2017Web/MainController");
        %>
        <!-- Start your project here-->
        <!--        <div style="height: 100vh">
                    <div class="flex-center flex-column">
                        <h2 class="animated fadeIn mb-4">Bienvenue sur Cinescope 2017</h2>
        
                        <h5 class="animated fadeIn mb-3">Merci d'utiliser notre produit. Nous sommes heureux que vous soyez avec nous.</h5>
        
                        <p class="animated fadeIn text-muted">Destiny's Team</p>
        
                        <a href="/Cinescope2017Web/MainController" class="btn btn-info">cliquer pour acceder au site</a>
                    </div>           
                </div>-->

        <!-- /Start your project here-->           

        <!-- SCRIPTS -->
        <!-- JQuery -->
        <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
        <!-- Bootstrap tooltips -->
        <script type="text/javascript" src="js/popper.min.js"></script>
        <!-- Bootstrap core JavaScript -->
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <!-- MDB core JavaScript -->
        <script type="text/javascript" src="js/mdb.min.js"></script>        
    </body>
</html>
