package scope;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SecondServ")
public class TwoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<h3 >Working with 2nd Servlet</h3>");
      //  String s= (String) request.getAttribute("test");
        String fname= (String) request.getAttribute("FirstName");
        String lname= (String) request.getAttribute("2ndName");
       out.println(fname +"<br>"+ lname);

    }
}
