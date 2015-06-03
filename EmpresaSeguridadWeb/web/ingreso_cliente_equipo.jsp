<%-- 
    Document   : ingreso_cliente_equipo
    Created on : 02-06-2015, 07:58:24 PM
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
        <h2>Ingrese</h2>
        <form action="proceso_guardar.do" method="POST">
            <table border="0">
                <tbody>
                    <tr>
                        <td>
                           
                        </td>
                        <td>
                           Cliente
                        </td>
                    </tr>
                    <tr>
                        <td>
                            RUT
                        </td>
                        <td>
                            <input type="text" name="txt_rut" value="" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Nombre
                        </td>
                        <td>
                            <input type="text" name="txt_nombre" value="" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Dirección
                        </td>
                        <td>
                            <input type="text" name="txt_direccion" value="" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Comuna
                        </td>
                        <td>
                            <input type="text" name="txt_comuna" value="" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            
                        </td>
                        <td>
                            Equipo
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Marca
                        </td>
                        <td>
                            <input type="text" name="txt_marca" value="" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Modelo
                        </td>
                        <td>
                            <input type="text" name="txt_modelo" value="" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Clave
                        </td>
                        <td>
                            <input type="text" name="txt_clave" value="" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Entrada
                        </td>
                        <td>
                            <select name="dll_entrada">
                                <option>Seleccione</option>
                                <option>teclado</option>
                                <option>tarjeta</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            
                        </td>
                        <td>
                            <input type="submit" value="Guardar" name="btn_guardar" />
                        </td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
