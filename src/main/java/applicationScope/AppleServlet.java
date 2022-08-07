package applicationScope;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/appleServ")
public class AppleServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h3 >Working with Apple Servlet</h3>");
        // ServletContext is an interface through which we get reference of Application Scope
        ServletContext ctx=getServletContext();
        ctx.setAttribute("name", "Putin");
        out.println("<a href=mangoServ > Mango Servlet </a>");
    }


}
