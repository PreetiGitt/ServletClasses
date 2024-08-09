package assg;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/DBUpdate")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // appended to th URL as it is a Get request

       String getId = request.getParameter("id");
         int id=Integer.valueOf(getId);
          boolean flag=false;
        String fname= request.getParameter("first_name");
        String lname= request.getParameter("last_name");
        String sql = "insert into loginTable values(?,?)";

        try (Connection conn = ConnectionClass.getConnected();
            Statement stmt = conn.createStatement();
            PreparedStatement preparedStatement=conn.prepareStatement(sql))
        {
            String query="Select * from loginTable";
            ResultSet resultSet= stmt.executeQuery(query);
            while(resultSet.next()){
                int i= resultSet.getInt(1);
                if(i==id) {
                    flag = true;
                    break;
                }
            }
            if (flag){



                preparedStatement.setString(1, fname);
                preparedStatement.setString(2, lname);
                    int rows = preparedStatement.executeUpdate();
                    if (rows >= 1) {
                        out.println("Data is updated");
                    }
                    else
                        out.println("No update");
            }
            else
                out.println("No Such record exists");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
