import javax.servlet.*;
import javax.servlet.http.*;
import java.nio.file.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends HttpServlet{

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("form.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login = req.getParameter("login");
        String password = System.lineSeparator() + req.getParameter("password");
        Path file = Paths.get("C:\\Users\\spelin\\IdeaProjects\\EEProject\\web\\data.txt");
        Files.write(file, login.getBytes());
        Files.write(file, "\n".getBytes(), StandardOpenOption.APPEND);
        Files.write(file, password.getBytes(), StandardOpenOption.APPEND);

    }

}
