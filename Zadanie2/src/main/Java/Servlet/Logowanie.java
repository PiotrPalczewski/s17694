package Servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Uzytkownik.Uzytkownik;
import Repo.DummyRepo;
import Repo.UserRepo;

@WebServlet("/login")
public class Logowanie extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private UserRepo repository;

    public void init (ServletConfig config) throws ServletException {
        repository = new DummyRepo();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        Uzytkownik uzytkownik = repository.getUserByName(request.getParameter("name"));

        if (uzytkownik != null && Uzytkownik.getPassword().equals(request.getParameter("password"))) {
            session.setAttribute("uzytkownik", uzytkownik);
            session.setAttribute("conf", null);
            response.sendRedirect("profil.jsp");
        }
        else {
            response.getWriter().println("Cos poszlo nie tak - nieprawdilowe dane logowania.");
        }

    }
}
