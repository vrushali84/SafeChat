import java.io.*;
import java.text.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
public class login extends HttpServlet {
     

     
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
        PrintWriter out=response.getWriter();
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        try{
        Operations o=new Operations();
      

        if(o.Authenticate(username,password)){
         String status="Authenticated";
         out.write(status);
         System.out.println("Server Authentication completed");
          o.perform();
        }
        else{
           String status="Username or Password incorrect"; 
           out.write(status);
        }
    }
        catch(Exception e){}
 

}
}