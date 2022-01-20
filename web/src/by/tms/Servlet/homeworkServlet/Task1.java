package by.tms.Servlet.homeworkServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;

@WebServlet(urlPatterns = "/counter")
public class Task1 extends HttpServlet {

    private AtomicInteger counter;

    @Override
    public void init() throws ServletException {
        counter = new AtomicInteger(0);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
        resp.setContentType("text/html");
        int num = counter.incrementAndGet();
        resp.getWriter().println("<h1>" + num + "</h1>");
    }
}
