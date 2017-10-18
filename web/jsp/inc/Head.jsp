<%-- 
    Document   : index
    Created on : 16 oct. 2017, 16:04:35
    Author     : formation
--%>

<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!--MATERIAL CSS-->
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">

        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <!-- FIN MATERIAL CSS-->

        <style>
            /*            body {
                            background: url("images/movie-2545676_1920.jpg") no-repeat center;
                        }
                        nav {
                            background: black;
                        }*/
            #column_gap {
                -webkit-column-count: 5;
                -moz-column-count: 5;
                column-count: 5;
                -moz-column-gap: 2em;
                -webkit-column-gap: 2em;
                column-gap: 2em;
            }

            .codeRub {
                background: black;
                padding: 4px;
            }
            /*ul#menu li{display: inline-block;}*/
        </style>
    </head>
    <body class="container-fluid">
        <header class="col-md-10 col-md-offset-1">
            <div>ENTETE</div>
        </header>
        <!--<nav class="col-md-10 col-md-offset-1" style="text-align: right;">-->
        <nav class="nav-extended">
            <%@include file="menus.jsp" %>
        </nav>

        <!--        <div class="col-md-10 col-md-offset-1">
        <%--<%@include file="menu.jsp" %>--%>
    </div>-->