package controller;

import servicio.ServicioUsuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/addUser")
public class AgregarUsuarioS extends HttpServlet {

    private final ServicioUsuario servicioUsuario = new ServicioUsuario();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nombre");
        String correo = req.getParameter("correo");
        String contrasena = req.getParameter("contrasena");
       


        resp.sendRedirect("/allUsers");
    }
}
