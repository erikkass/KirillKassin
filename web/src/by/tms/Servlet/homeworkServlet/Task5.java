package by.tms.Servlet.homeworkServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

@WebServlet(urlPatterns = "/counterUnique")
public class Task5 extends HttpServlet {

    public static final String CUSTOM_COOKIE_NAME = "customCookie";
    private AtomicInteger counter;
    private Integer num = 0;

    @Override
    public void init() throws ServletException {
        counter = new AtomicInteger(0);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding(StandardCharsets.UTF_8.name());
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        if (req.getCookies() != null && Arrays.stream(req.getCookies()).anyMatch(cookie -> CUSTOM_COOKIE_NAME.equals(cookie.getName()))) {
            writer.println("Ты уже здесь был!");
        } else {
            num = counter.incrementAndGet();
            Cookie cookie = new Cookie(CUSTOM_COOKIE_NAME, "1234");
            resp.addCookie(cookie);
        }
        writer.println("Счётчик уникальных посещений: " + num);
    }
}
