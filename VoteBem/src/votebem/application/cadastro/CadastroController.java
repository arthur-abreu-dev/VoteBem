/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votebem.application.cadastro;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import votebem.application.Inicio.InicioController;
import votebem.application.connection.Conexao;
import votebem.application.main.Cadastro;
import votebem.application.main.Inicio;
import votebem.domain.entities.Usuario;

/**
 * FXML Controller class
 *
 * @author arthu
 */
public class CadastroController implements Initializable {

    @FXML
    private TextField tfNome;

    @FXML
    private ComboBox<String> cbSexo;

    @FXML
    private PasswordField pfSenha;

    @FXML
    private PasswordField pfconfirmaSenha;

    @FXML
    private TextField pfEmail;

    @FXML
    private TextField pfConfirmaEmail;

    @FXML
    private Button btnCadastrar;

    @FXML
    private Button btncancelar;
    
    private int erroCadastro = 0;
    
    Conexao conn = new Conexao();

    @FXML
    void cadastrarUsuario(ActionEvent event) {
     try{   
        
        Usuario usuario = new Usuario();
         usuario.setSexo(cbSexo.valueProperty().get());
         if(pfEmail.getText().equals(pfConfirmaEmail.getText())){ 
           if(pfEmail.getText() != ""){  
             if(pfEmail.getText().toLowerCase().contains("@") & pfEmail.getText().contains(".com")){  
             usuario.setEmail(pfEmail.getText().toLowerCase());
             }else{
                erroCadastro = 1;   
                Alert alert = new Alert(Alert.AlertType.ERROR);      
                alert.setTitle("Erro");
                alert.setHeaderText("Erro ao Cadastrar Usuário:");
                alert.setContentText("Email invalido, por favor corrija os dados inseridos antes de prosseguir!");
                alert.showAndWait();
             }
           }else{
            erroCadastro = 1;   
            Alert alert = new Alert(Alert.AlertType.ERROR);      
            alert.setTitle("Erro");
            alert.setHeaderText("Erro ao Cadastrar Usuário:");
            alert.setContentText("Nenhum email foi inserida, por favor corrija os dados inseridos antes de prosseguir!");
            alert.showAndWait();
           }  
         }else{
             erroCadastro = 1;
             Alert alert = new Alert(Alert.AlertType.ERROR);      
            alert.setTitle("Erro");
            alert.setHeaderText("Erro ao Cadastrar Usuário:");
            alert.setContentText("A comfirmação do email não corresponde com o email inserido, por favor corrija os dados inseridos antes de prosseguir!");
            alert.showAndWait();     
            
         }
         if(pfSenha.getText().equals(pfconfirmaSenha.getText())){
           if(pfSenha.getText() != ""){  
             usuario.setSenha(pfSenha.getText());
           }else{
            erroCadastro = 1;   
            Alert alert = new Alert(Alert.AlertType.ERROR);      
            alert.setTitle("Erro");
            alert.setHeaderText("Erro ao Cadastrar Usuário:");
            alert.setContentText("Nenhuma senha foi inserida, por favor corrija os dados inseridos antes de prosseguir!");
            alert.showAndWait();
           }
         }else{
            erroCadastro = 1;
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("Erro ao Cadastrar Usuário:");
            alert.setContentText("A comfirmação da senha não corresponde com a senha inserida, por favor corrija os dados inseridos antes de prosseguir!");
            alert.showAndWait();
         }
         usuario.setNomeUsu(tfNome.getText());
         if(erroCadastro == 0){
             conn.Salvar(usuario);  
             Inicio inicio = new Inicio();          
             fecharAplicacao();
            try {
                inicio.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(InicioController.class.getName()).log(Level.SEVERE, null, ex);
            }
          } 
     }catch(Exception e){
            System.out.println(e.getMessage());
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("Erro ao Cadastrar Usuário:");
            alert.setContentText("Usuário já existente ou Dados inválidos. Confira seus dados e tente novamente");
            alert.showAndWait();  
     }
    }

    @FXML
    void cancelarCadastro(ActionEvent event) {
        
         Inicio inicio = new Inicio();          
             fecharAplicacao();
            try {
                inicio.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(InicioController.class.getName()).log(Level.SEVERE, null, ex);
            }

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          cbSexo.getItems().add("Masculino");
          cbSexo.getItems().add("Feminino");
          cbSexo.getItems().add("Não Binario");
    } 

 public void fecharAplicacao() {
        try{
          Stage st = Cadastro.getStage();
          st.close();
        }catch(Exception e){
            System.out.println("erro ao fechar tela :"+e.getMessage()); 
       }
   
    }
    
}
