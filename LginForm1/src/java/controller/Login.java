
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {


    protected void doget(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String username=request.getParameter("username");
           String password=request.getParameter("password");
           if(username!=null&&password!=null){
            if(username.equals("Ranjeet")&&password.equals("12345")){
                response.sendRedirect("welcome.jsp");
            }
        else{
               out.println("invalid User Name And Password");
           }
           }else{
                out.println("Enter User Name And Password Here");
               }
        }
    }

    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doget(request, response);
    }

   

}
