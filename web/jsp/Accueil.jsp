<%-- 
    Document   : index
    Created on : 16 oct. 2017, 16:04:35
    Author     : formation
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="inc/Head.jsp" %>
<main class="container">
    <div class="row">
        <c:forEach var="i" begin="0" end="5" step="1">
            <div class="col-md-4" style="margin-bottom: 5px">            
                <!--Card-->
                <div class="card">
                    <!--Card image-->
                    <div class="view overlay hm-white-slight">
                        <img src="img/jpg/img${i}.jpg" class="img-fluid" alt="">
                        <!--<img src="img/jpg/img${i}.jpg" width="354" height="236" alt="">-->
                        <!--<img src="img/jpg/img (72).jpg" class="img-fluid" alt="">-->
                            <div class="mask"></div>
                        </a>
                    </div>
                    <!--Card content-->
                    <div class="card-body">
                        <!--Title-->
                        <h4 class="card-title">Card title</h4>
                        <!--Text-->
                        <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                        <!--<a href="#" class="btn btn-primary">Button</a>-->
                    </div>
                </div>
                <!--/.Card-->            
            </div>
        </c:forEach>


        <!--                <div class="col-md-4">
                            <figure><img src="img/jpg/picto/133_354292.jpg" alt=""><figcaption>Titre 10</figcaption></figure> 
                            <div>Lorem ipsum dolor sit amet.</div>
                        </div>-->
    </div>

</main>
<%@include file="inc/Foot.jsp" %>