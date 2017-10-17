<%-- 
    Document   : index
    Created on : 16 oct. 2017, 16:04:35
    Author     : formation
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="inc/Head.jsp" %>
<main class="row">
    <%@include file="inc/menu.jsp" %>
    
    <div class="col-md-8" style="padding: 0;">
        <h1 class="col-md-12" style="text-align: center; border-bottom: 1px solid activecaption">Tous les films</h1>
        <p>Tous les films</p>
        
        
<c:forEach items="${datas}" var="element">
    <p>${element.status}</p>
</c:forEach>        
        
    </div>    
    
</main>
<%@include file="inc/Foot.jsp" %>