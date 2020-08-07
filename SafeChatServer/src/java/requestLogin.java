import java.io.*;
import java.text.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
public class requestLogin extends HttpServlet {
     

     
    public void doPost(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, 
            IOException {
         PrintWriter out=response.getWriter();
         String username=request.getParameter("username");
         try{
         Operations o=new Operations();
         o.requestLogin(username);
     
         }
         catch(Exception e)
         {
       
           
         }


    }
  
 

}