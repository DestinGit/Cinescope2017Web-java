<%-- 
    Document   : index
    Created on : 16 oct. 2017, 16:04:35
    Author     : formation
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    </head>
    <body class="container-fluid">
        <header class="col-md-10 col-md-offset-1 well">
            <%@ include file="Header.jsp" %>
        </header>
        <main class="row">
            <aside class="col-md-3 col-md-offset-1">
                MENU ICI
            </aside>
            <article class="col-md-7 ">
                BODY ICI
            </article>
        </main>    
        
        <footer class="col-md-10 col-md-offset-1 well">
            <%@ include file="Footer.jsp" %>
        </footer>
        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>        
    </body>
</html>
