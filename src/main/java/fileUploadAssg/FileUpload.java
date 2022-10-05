package fileUploadAssg;


import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet("/fileUpload")
public class FileUpload extends HttpServlet {
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

    }
}
