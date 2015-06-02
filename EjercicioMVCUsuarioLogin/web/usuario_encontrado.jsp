<%-- 
    Document   : usuario_encontrado
    Created on : 26-05-2015, 08:33:13 PM
    Author     : Ricardo
--%>

<%@page import="modelo.BuscarUsuario"%>
<%@page import="modelo.Login"%>
<%@page import="modelo.ListadoUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            HttpSession sesion = request.getSession();
            Login login = (Login) sesion.getAttribute("miSesion");
        %>
        <h1>Bienvenido  <%=login.getUsuario()%> ¿Cómo estás? </h1>
        <br>
        <a href="index.jsp">Volver</a>
    </body>
</html>
