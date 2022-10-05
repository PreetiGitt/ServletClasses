package urlRewriting;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/* As we disable the cookies, each time we get the New session
but URL rewriting will help in maintaining the same session in redirected servlet,
despite disabled cookies

 */
@WebServlet("/urlRewriting")
public class EncodeUrlServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h3 >Working with Session</h3>");
        HttpSession httpSession= request.getSession();
        //out.println("<a href="+response.encodeURL("servletLink1")+"> Servlet 5</a>");
        out.println("<a href="+response.encodeRedirectURL("servletLink1")+"> Servlet 5</a>");
       if( httpSession.isNew()){
           out.println("<h3 >New session</h3>");
       }
      else{
           out.println("<h3 >Old session</h3>");
       }

    }
}
