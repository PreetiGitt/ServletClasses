package assg;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/DBSave")
public class DBSaveServlet extends HttpServlet {
        int count=1;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // appended to th URL as it is a Get request

        String fname= request.getParameter("first_name");
        String lname= request.getParameter("last_name");
        String sql = "insert into loginTable values(?,?,?)";
        try( Connection  conn = ConnectionClass.getConnected();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1,count);
            stmt.setString(2, fname);
            stmt.setString(3, lname);
            int rows = stmt.executeUpdate();
            if (rows >= 1) {
                 count++;
                out.println("Data is saved");
            }
            else
                out.println("No update");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
