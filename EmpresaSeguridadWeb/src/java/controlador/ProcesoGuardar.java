package controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Cliente;

/**
 *
 * @author Ricardo
 */
@WebServlet(urlPatterns = {"/proceso_guardar.do"})
public class ProcesoGuardar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  
        {
            Cliente cliente = new Cliente();
            cliente.setRut(request.getParameter("txt_rut"));
            cliente.setNombre(request.getParameter("txt_nombre"));
            cliente.setDireccion(request.getParameter("txt_direccion"));
            cliente.setComuna(request.getParameter("txt_comuna"));
            cliente.getEquipo().setMarca(request.getParameter("txt_marca"));
            cliente.getEquipo().setModelo(request.getParameter("txt_modelo"));
            cliente.getEquipo().setClave(request.getParameter("txt_clave"));
            cliente.getEquipo().setEntrada(request.getParameter("dll_entrada"));
            request.getSession().setAttribute("cliente", cliente);
            request.getRequestDispatcher("ingreso_correcto.jsp").forward(request, response);
        }
        catch(Exception e)
        {
            request.getRequestDispatcher("ingreso_error.jsp").forward(request, response);
            
            //out.println("Error: "+e);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
