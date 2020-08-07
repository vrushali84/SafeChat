import java.io.*;
import java.text.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
public class userRegistration extends HttpServlet {
     

     
    public void doPost(HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, 
            IOException {
         PrintWriter out=response.getWriter();
         String username=request.getParameter("username");
         String firstname=request.getParameter("firstname");
         String lastname=request.getParameter("lastname");
         String password=request.getParameter("password");
       
         try{
         Operations o=new Operations();
         String status=o.insert(username,firstname,lastname,password);
         if(status.equals("Success")){
         out.write("Registration Success");
         }
         else{
             out.write(""+status);
         }
         
         }
         catch(Exception e)
         {
          out.println("Error: "+e);
           
         }


    }
  
 

}