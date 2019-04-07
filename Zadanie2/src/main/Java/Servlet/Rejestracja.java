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

@WebServlet("/rejestracja")
public class Rejestracja extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private Uzytkownik retriveUserRegistrationRequest(HttpServletRequest request) {
        Uzytkownik result = new Uzytkownik();
        result.setName(request.getParameter("name"));
        result.setPassword(request.getParameter("password"));
        result.setEmail(request.getParameter("email"));
        return result;
    }

    private UserRepo repository;

    public void init (ServletConfig config) throws ServletException {
        repository = new DummyRepo();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        Uzytkownik uzytkownik = retriveUserRegistrationRequest(request);

        session.setAttribute("conf", uzytkownik);

        repository.add(uzytkownik);
        response.sendRedirect("successRejestracja.jsp");

    }
}
