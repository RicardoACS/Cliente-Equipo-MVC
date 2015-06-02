<%-- 
    Document   : index
    Created on : 26-05-2015, 07:41:53 PM
    Author     : Ricardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Ingrese sus Datos</h2>
        <form action="procesar_usuario" method="POST">
            <table border="0">
                <tbody>
                    <tr>
                        <td>
                            Usuario
                        </td>
                        <td>
                            <input type="text" name="txt_usuario" value="" size="5" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Clave
                        </td>
                        <td>
                            <input type="password" name="txt_password" value="" size="5" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            
                        </td>
                        <td>
                            <input type="submit" value="Entrar" name="btn_entrar" />
                        </td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
