package urlRewriting;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servletLink1")
public class ServletLink1 extends HttpServlet {


        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html");

            PrintWriter out = response.getWriter();
            HttpSession httpSession= request.getSession(true);
        if( httpSession.isNew()){
            out.println("<h3 >New session</h3>");
        }
        else{
            out.println("<h3 >Old session</h3>");
        }

        }
    }

