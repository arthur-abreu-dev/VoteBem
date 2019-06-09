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
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import votebem.application.connection.Conexao;
import votebem.domain.entities.Usuario;

/**
 *
 * @author Aluno
 */
@WebServlet(name = "CadastroUsuario", urlPatterns = {"/CadastroUsuario"})
public class CadastroUsuario extends HttpServlet {
    private String nome;
    private String senha;
    private String email;
    private String sexo;
    private Conexao conn = new Conexao();
    private int erroCadastro = 0;

    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		nome = request.getParameter("nome");
		senha = request.getParameter("senha");
                email = request.getParameter("email");
                sexo =  request.getParameter("sexo");
                cadastrarUsuario(request, response);


	}
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            nome = request.getParameter("nome");
//            out.print(nome);
//        }
    }
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
       void cadastrarUsuario(HttpServletRequest request, HttpServletResponse response) {
     try{   
        
        Usuario usuario = new Usuario();
         usuario.setSexo(sexo);
           if(email != ""){  
             if(email.toLowerCase().contains("@") & email.contains(".com")){  
             usuario.setEmail(email.toLowerCase());
             }else{
                erroCadastro = 1;   
                //Alert alert = new Alert(Alert.AlertType.ERROR);      

             }
           }else{
            erroCadastro = 1;   
            //Alert alert = new Alert(Alert.AlertType.ERROR);      

           }  
           if(!"".equals(senha)){  
             usuario.setSenha(senha);
           }else{
            erroCadastro = 1;   
            //Alert alert = new Alert(Alert.AlertType.ERROR);      

           }
         usuario.setNomeUsu(nome);
         if(erroCadastro == 0){
             conn.Salvar(usuario);  
//             Inicio inicio = new Inicio();          <=======================
//             fecharAplicacao();
            request.getRequestDispatcher("principal.jsp").forward(request,response);
            
          } 
     }catch(Exception e){

//            Alert alert = new Alert(Alert.AlertType.ERROR);

     }
    }

}
