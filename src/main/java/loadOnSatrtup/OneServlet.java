package loadOnSatrtup;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(value = "/loadOne", loadOnStartup = 4)

public class OneServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        // Not displayed as response is forwarded to other servlet
        out.println("<h3 >Working with OneServlet</h3>");
    }
    @Override
   public void init() throws ServletException
    {
        System.out.println("Init of One Servlet called");
    }
}
