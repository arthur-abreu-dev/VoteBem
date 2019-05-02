package votebem.application.Inicio;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import votebem.application.connection.Conexao;

public class InicioController {

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
    void fazerLogin(ActionEvent event) {
        System.out.println("entra");
     Conexao conn = new Conexao();
        System.out.println("sai");
    }

}
