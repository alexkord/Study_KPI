package ua.kpi.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@WebServlet(urlPatterns = "/UserServlet", name = "UserServlet")
public class UserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Map<Integer, String> users = new ConcurrentHashMap<>();
    private AtomicInteger counter;

    @Override
    public void init() throws ServletException {
        super.init();
        users.put(1, "Sergey");
        users.put(2, "Denchik");
        users.put(3, "Potap");
        users.put(4, "Alex");
        counter = new AtomicInteger(4);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        Integer id = 0;
        if (!users.containsValue(name)) {
            id = counter.incrementAndGet();
            users.put(id, name);
        }

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        if (id == null) {
            out.println("<h3>user " + name + " already exits</h3>");
        } else {
            out.println("<h3>user created " + name + "; id = " + counter.get() + "</h3>");
        }
        out.print("<br>");
        out.println("<a href='http://localhost:8080/web/user.html'>Main</a>");
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        String user = users.get(id);

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<h3>user: " + user + "</h3><br>");
        out.println("<a href='http://localhost:8080/web/user.html'>Back</a>");
        out.close();
    }
}
