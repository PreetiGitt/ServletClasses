package cookies;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/writeCookie")
public class cookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h3 >Working with Cookie Servlet</h3>");
          // set the cookie
        Cookie cookie1=new Cookie("Subject","java");
        Cookie cookie2=new Cookie("batch","evening");
        Cookie cookie3=new Cookie("country","India");


        response.addCookie(cookie1);
        response.addCookie(cookie2);
        response.addCookie(cookie3);

    }

}
