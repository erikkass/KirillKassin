package by.tms.Servlet.homeworkServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

@WebServlet(urlPatterns = "/fio")
public class Task2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
        resp.setContentType("text/html");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        if (Objects.nonNull(firstName) && Objects.nonNull(lastName)) {
            resp.getWriter().println(firstName + " " + lastName);
        } else {
            resp.getWriter().println("Имя либо фамилия не указаны!");
        }
    }
}
