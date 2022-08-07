package loadOnSatrtup;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/loadTwo", loadOnStartup = 2)
public class TwoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<h3 >Working with 2nd Servlet</h3>");
    }
    @Override
    public void init() throws ServletException
    {
        System.out.println("Init of 2nd Servlet called");
    }
}
