/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.BuscarUsuario;
import modelo.ListadoUsuario;
import modelo.Login;

/**
 *
 * @author Ricardo
 */
public class ProcesarUsuario extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) 
        {
            //Se llama a la clase que tiene guardados los datos
            modelo.ListadoUsuario listado = new ListadoUsuario();
            //Se llama a la clase que tiene el metodo para buscar al usuario
            BuscarUsuario bu = new BuscarUsuario();
            //Se reciben los parametros desde la pagina web
            String usuario = request.getParameter("txt_usuario");
            String password = request.getParameter("txt_password");
            //Se crea el Objeto Login
            Login login = new Login(usuario,password);
            
            //Se pregunta si los parametros recibidos anteriormente están con valores            
            if(usuario.trim().length() > 0 && password.trim().length() > 0)
            {    
                //Se pregunta si es login es diferente a vacio.
                    if(bu.buscarUser(login) != null)
                    {                 
                        //Al ser correcto los datos se creá la variable sesion
                        //y tambien llevará a la pagina de usuario encontrado
                        request.getSession().setAttribute("miSesion", login);
                        request.getRequestDispatcher("usuario_encontrado.jsp").forward(request, response);
                    }
                    else
                    {
                        //Al ser incorrecto la pagina redireccionará a la pagina de error de usuario
                       request.getRequestDispatcher("acceso_incorrecto.jsp").forward(request, response);  
                    }
                
            }
            
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
