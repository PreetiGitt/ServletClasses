package cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/persistentCookie")
public class PersistentCookie extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h3 >Working with  Persistent Cookie </h3>");

        Cookie cookie1=new Cookie("actor","SRK");
        cookie1.setMaxAge(120); // 120 seconds


        response.addCookie(cookie1);


    }

}
