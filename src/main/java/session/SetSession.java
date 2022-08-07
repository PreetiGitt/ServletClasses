package session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/setSession")
// line 22 and 23 gives same output
public class SetSession extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h3 >Working with Set Session</h3>");
       HttpSession httpSession= request.getSession();

       if( (httpSession!=null)&& httpSession.isNew()){
           httpSession.setAttribute("China", "Market");
           out.println("<a href=getterSession> link");
       }
      else{
           out.println("<h3 >Old session</h3>");
       }

    }
}
