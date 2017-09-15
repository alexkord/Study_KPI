package ua.kpi.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/Servlet", name = "Servlet")
public class Servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        response.getWriter().println(firstName + " " + lastName);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        System.out.println(firstName + " " + lastName);
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("First name: " + firstName + "; Last Name: " + lastName);
        out.println("</body></html>");
        out.close();
    }
}
