package servletCommunication;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
// first Servlet will do the work of validation
@WebServlet("/OneServlet")
public class OneServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        // Not displayed as response is forwarded to other servlet
        out.println("<h3 >Working with OneServlet</h3>");
        RequestDispatcher rd= request.getRequestDispatcher("SecondServlet");
        rd.forward(request,response);


    }
}
