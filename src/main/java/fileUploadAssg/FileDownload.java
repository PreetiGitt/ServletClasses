package fileUploadAssg;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

@WebServlet("/fileDownload")
public class FileDownload extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String path="D:\\Practice\\Pic.png";
        InputStream is=request.getInputStream();
        byte[] fileData= new byte[is.available()];
        is.read(fileData);
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        fileOutputStream.write(fileData);
        out.println("uploaded successfully");
        response.getOutputStream();

    }
}
