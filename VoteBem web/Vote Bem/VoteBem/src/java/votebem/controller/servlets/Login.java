/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votebem.controller.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import votebem.application.connection.Conexao;

/**
 *
 * @author Aluno
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
    private String email;
    private String senha;
    private Conexao conn = new Conexao();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        senha = request.getParameter("senha");
        email = request.getParameter("email");
             try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
   
            out.print(senha);
            out.print(email);
        }
        //logIn(request,response);
    }

    private void logIn(HttpServletRequest request, HttpServletResponse response) throws ServletException{
        String usu= "";
        try{ usu = conn.findFieldValue("idUsuario", "Usuario", " email = '"+email.toLowerCase()+"' and senha = '"+senha+"'");
        }catch(Exception e){}
       try{
       
        
          if( usu != null && !"".equals(usu)){ 
                            request.getRequestDispatcher("index.jsp").forward(request,response);
          } else{     
                        request.setAttribute("mensagem", "Não foi possivel efetuar login");
                        RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                        rd.forward(request, response);
                       
          }
      }catch(Exception e){
          
           //Alert alert = new Alert(Alert.AlertType.ERROR);
           
     }   
    
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
