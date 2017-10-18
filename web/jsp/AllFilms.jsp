<%-- 
    Document   : index
    Created on : 16 oct. 2017, 16:04:35
    Author     : formation
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="inc/Head.jsp" %>
<main class="row">
    <div class="col-md-10 col-md-offset-1">
        <header>
            <ul>
                <li><span>Cinéma</span></li>
                <li>Tous les films</li>
            </ul>
        </header>
        <div>
            <div>
                <h2>Signification  des codes</h2>
                <ul style="column-count: 3;">
                    <c:forEach items="${rubriques}" var="item">
                        <li><span class="codeRub">${item.codeRubrique}</span> : ${item.intituleRubrique}</li>
                    </c:forEach>
                </ul>
            </div>
            <div style="border: 1px solid black">
                <%--<c:forEach items="${datas}" var="element">--%>
                    <!--<p class="alert alert-success">${element.titreFilm}</p>-->
                <%--</c:forEach>--%>  
                <ul class="list-unstyled">
                    <c:forEach items="${listMap}" var="element">
                        <li class="">
                            <span>${element.titreFilm}</span>
                            .................................
                            <c:if test="${!empty element.codeRubrique}">
                                <span class="codeRub">${element.codeRubrique}</span>
                            </c:if>
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div>            
    </div>  

    <!--<aside class="col-md-4">ASIDE</aside>-->
</main>
<%@include file="inc/Foot.jsp" %>