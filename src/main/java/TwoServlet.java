import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

;

@WebServlet("/Registration")
public class TwoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,  IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
       String fname= request.getParameter("first_name");
        String lname= request.getParameter("last_name");
        out.println("hello "+fname +" "+lname );
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,  IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String fname= request.getParameter("first_name");
        String lname= request.getParameter("last_name");
        out.println("hello "+fname +" "+lname );
    }

}
