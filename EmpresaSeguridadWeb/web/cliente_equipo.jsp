<%-- 
    Document   : cliente_equipo
    Created on : 02-06-2015, 08:30:13 PM
    Author     : Ricardo
--%>

<%@page import="modelo.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Listado</h2>
        <%
            try
            {
                HttpSession sesion = request.getSession();
            Cliente cliente = (Cliente) sesion.getAttribute("cliente");
         
            
            
        %>
        <table border="0">
            <thead>
                <tr>
                    <th>Rut</th>
                    <th>Nombre</th>
                    <th>Dirección</th>
                    <th>Comuna</th>
                    <th>Marca</th>
                    <th>Modelo</th>
                    <th>Clave</th>
                    <th>Entrada</th>                  
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                        <%=cliente.getRut()%>
                    </td>
                    <td>
                        <%=cliente.getNombre()%>
                    </td>
                    <td>
                        <%=cliente.getDireccion()%>
                    </td>
                    <td>
                       <%=cliente.getComuna()%> 
                    </td>
                    <td>
                        <%=cliente.getEquipo().getMarca()%>
                    </td>
                    <td>
                       <%=cliente.getEquipo().getModelo()%>
                    </td>
                    <td>
                       <%=cliente.getEquipo().getClave()%> 
                    </td>
                    <td>
                        <%=cliente.getEquipo().getEntrada()%>
                        <%
                        }
                        catch(Exception e)
                        {

                        }
                        %>
                    </td>
                </tr>
            </tbody>
        </table>
                    <br>
                    <a href="index.jsp">Menú</a>
    </body>
</html>
