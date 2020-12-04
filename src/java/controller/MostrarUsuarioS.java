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
import java.util.List;

@WebServlet(urlPatterns = "/allUsers")
public class MostrarUsuarioS extends HttpServlet {
    private final ServicioUsuario servicioUsuario = new ServicioUsuario();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List <Usuario> userList = servicioUsuario.getAllUsers();
        req.setAttribute("users", userList);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("allUsers.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
