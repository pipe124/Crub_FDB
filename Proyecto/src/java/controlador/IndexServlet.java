/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;
import modelo.Administrador;
import modelo.AdministradorDAO;

public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        AdministradorDAO dao = new AdministradorDAO();
        List<Administrador> lista = dao.obtenerAdministradores();

        request.setAttribute("listaadministrador", lista);
        RequestDispatcher dispatcher = request.getRequestDispatcher("listas.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Leer parámetros del formulario
        String nombre = request.getParameter("nombre");
        String correo = request.getParameter("correo");
        String contraseña = request.getParameter("contraseña");

        // Crear objeto Administrador
        Administrador admin = new Administrador();
        admin.setNombre(nombre);
        admin.setCorreo(correo);
        admin.setContraseña(contraseña);

        // Insertar en la base de datos
        AdministradorDAO dao = new AdministradorDAO();
        dao.insertarAdministrador(admin);

        // Redirigir para actualizar la lista
        response.sendRedirect("IndexServlet");
    }
}