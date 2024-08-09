package databaseConnectivity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/DBConnection")
public class DatabaseServlet1 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn = null;
        Statement stmt = null;
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<h3 >Working with database</h3>");
        out.println("<table>");
        out.println("<tr> " +
                "<th>First Name  </th>" +
                "<th>Last Name  </th>  " +
                "</tr>");
        try {


            conn = ConnectionClass.getConnected();
            stmt= conn.createStatement();
            String sql = "SELECT * from actor";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                out.println("<tr>" +
                        "<td>");
                String first = rs.getString("first_name");
                String last = rs.getString("last_name");
                 out.println("First Name is " +first);
                out.println("</td>");
                out.println("<td>");
                out.println("Last Name is " +last);
                out.println("</td>" +
                        " </tr>");
            }
            out.println("</table>");
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
