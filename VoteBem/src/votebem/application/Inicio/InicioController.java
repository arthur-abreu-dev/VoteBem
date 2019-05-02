package votebem.application.Inicio;


import java.io.File;
import java.net.URL;
import java.util.Formatter;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import votebem.application.cadastro.CadastroController;
import votebem.application.connection.Conexao;
import votebem.application.main.Cadastro;
import votebem.application.main.Inicio;
import votebem.application.main.Principal;
import votebem.application.principal.PrincipalController;

public class InicioController implements Initializable{

    @FXML
    private TextField tfEmail;

    @FXML
    private PasswordField pwSenha;

    @FXML
    private Button btnEntrar;

    @FXML
    private Label lblLogin;

    @FXML
    private Button btnCadastrar;
    
    @FXML
    private Label lblImagemLogin;
    
    @FXML
    private ImageView ivLogin;
    
    @FXML
    private CheckBox cbLembrarSenha;
    
    private Conexao conn = new Conexao();
    
    
     public void fecharAplicacao() {
        try{
          Stage st = Inicio.getStage();
          st.close();
        }catch(Exception e){
            System.out.println("erro ao fechar tela :"+e.getMessage()); 
       }
   
    }
     
         @FXML
    void fazerLoginEnter(KeyEvent event) {
         if(event.getCode() == KeyCode.ENTER)
        {
            logIn();
        }
    }
     


     
    @Override
    public void initialize(URL url, ResourceBundle rb) {   
    } 
    @FXML
    public void fazerLogin(ActionEvent actionEvent){  
     logIn();
    }  
    
    private void logIn(){
    try{
      if(!"".equals(tfEmail.getText()) && tfEmail.getText() != null && !"".equals(pwSenha.getText()) && pwSenha.getText() != null){ 
        String usu = conn.findFieldValue("idUsuario", "Usuario", " email = '"+tfEmail.getText().toLowerCase()+"' and senha = '"+pwSenha.getText()+"'");
          if( usu != null && !"".equals(usu)){ 
           Principal principal= new Principal();
           fecharAplicacao();
                        try {
                            principal.start(new Stage());
                            PrincipalController.CurrentController.setLblNomeUser(conn.findFieldValue("nomeUsu", "Usuario", "idUsuario = '"+usu+"'"));
                            PrincipalController.CurrentController.setLblNome(conn.findFieldValue("nomeUsu", "Usuario", "idUsuario = '"+usu+"'"));
                            PrincipalController.CurrentController.setLblPontuacao(conn.findFieldValue("pontos", "Usuario", "idUsuario = '"+usu+"'"));

                        } catch (Exception ex) {
                            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
                           }
                    } else{     
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                         alert.setTitle("Erro");
                         alert.setHeaderText("Erro ao Logar no Sistema");
                         alert.setContentText("Verifique seu Nome de Usuário e Senha. Confira também se o CAPS LOCK está ativado");
                         alert.showAndWait();
                 }
           }else{
             Alert alert = new Alert(Alert.AlertType.ERROR);
             alert.setTitle("Erro");
             alert.setHeaderText("Erro ao Logar no Sistema");
             alert.setContentText("Preencha seu Nome de Usuário e Senha!");
             alert.showAndWait();
        }   
      }catch(Exception e){
          
           Alert alert = new Alert(Alert.AlertType.ERROR);
             alert.setTitle("Erro");
             alert.setHeaderText("Erro ao Logar no Sistema");
             alert.setContentText("Não foi possivel Logar no sistema, verifique seu dados e tente no!");
             alert.showAndWait();
          
            System.out.println("___________");
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getSuppressed());
            

     }    
    }
    
    public void fazerCadastro(ActionEvent event) {
             Cadastro cadastro = new Cadastro();
          
           fecharAplicacao();
            try {
                cadastro.start(new Stage());
               
            } catch (Exception ex) {
                Logger.getLogger(CadastroController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

}
