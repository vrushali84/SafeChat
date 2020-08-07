import java.io.*;
import java.text.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
public class getDetails extends HttpServlet {
     

     
    public void doPost(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, 
            IOException {
         PrintWriter out=response.getWriter();
         String username=request.getParameter("username");
         String password=request.getParameter("password");
       
         try{
         Operations o=new Operations();
         
         out.write(o.getAuthenticatedUserDetails(username,password));

         }
         catch(Exception e)
         {
       
           
         }


    }
  
 

}