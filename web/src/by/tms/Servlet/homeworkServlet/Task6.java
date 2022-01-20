package by.tms.Servlet.homeworkServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(urlPatterns = "/sendName")
public class Task6 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
        resp.setContentType("text/html");
        HttpSession session = req.getSession();
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        session.setAttribute("firstName", firstName);
        session.setAttribute("lastName", lastName);
    }
}
