package controller;

import servicio.ServicioUsuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (urlPatterns ="/eliminarUsuario")
public class EliminarUsuarioS extends HttpServlet {

    private final ServicioUsuario userService = new ServicioUsuario();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int idUsuario =(int) Long.parseLong(req.getParameter("id"));
        userService.eliminarUsuarioById(idUsuario);
        resp.sendRedirect("/allUsers");
    }
}