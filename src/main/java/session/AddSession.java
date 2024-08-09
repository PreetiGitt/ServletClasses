package session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/addSession")

public class AddSession extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h3 >Working with Session</h3>");
        // Not allowing any new session, only existing session is returned
        HttpSession httpSession= request.getSession(false);
        if( (httpSession!=null) &&httpSession.isNew()){
            out.println("<h3 >New Session</h3>");
        }
        else{
            out.println("<h3 >Null Session</h3>");// Null session
        }
    }
}
