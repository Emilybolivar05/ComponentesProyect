package controller;

import model.Usuario;
import servicio.ServicioUsuario;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (urlPatterns = "/modificarUsuario")
public class ModificarUsuarioS extends HttpServlet {

    private final ServicioUsuario servicioUsuario = new ServicioUsuario();
    private static long idUsuario;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        idUsuario = Long.parseLong(req.getParameter("id"));
        Usuario user = servicioUsuario.getUsuarioById((int) idUsuario);

        req.setAttribute("user", user);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/modificarUsuario.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nuevoNombre");
        String correo = req.getParameter("nuevoCorreo");
        String contrasena = req.getParameter("nuevaContrasena");
        

   

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/allUsuarios");
        requestDispatcher.forward(req,resp);
    }
}
