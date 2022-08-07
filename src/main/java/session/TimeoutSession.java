package session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/sessionTimeout")
// line 22 and 23 gives same output
public class TimeoutSession extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h3 >Working with TimeOut Session</h3>");
        HttpSession httpSession= request.getSession();
         httpSession.setMaxInactiveInterval(50);// time in seconds
       if( httpSession.isNew()){
           out.println("<h3 >New session</h3>");
       }
      else{
           out.println("<h3 >Old session</h3>");
       }

    }
}
