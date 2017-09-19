package ua.kpi.servlet;

import lesson4.controller.NoteBookController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/Servlet", name = "Servlet", loadOnStartup = 0)
public class Servlet extends HttpServlet {


    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("Init servlet");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        HttpSession session = request.getSession(true);
        session.setMaxInactiveInterval(1800);
//        if (firstName.equals(null) && lastName.equals(null))) {
            session.setAttribute("firstName", firstName);
//            session.setAttribute("lastName", lastName);
//        }
        response.getWriter().println("<html><body>" +
                "First name: " + firstName + "; Last Name: " + lastName + "<br>" +
                "Session parameter: " + session.getAttribute("firstName") + "<br>" +
                "<a href='http://localhost:8080/web/index.html'>Back</a>" +
        "</body></html>");
    }
}
