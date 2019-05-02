/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votebem.application.principal;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author arthu
 */
public class PrincipalController implements Initializable {

    @FXML
    private StackPane spPrincipal;

    @FXML
    private AnchorPane apResponderQuestoes;

    @FXML
    private Label lblQuestaoNumero;

    @FXML
    private Label lblQuestao;

    @FXML
    private Button btnOpcaoA;

    @FXML
    private Button btnOpcaoB;

    @FXML
    private Button btnOpcaoC;

    @FXML
    private Button btnOpcaoD;

    @FXML
    private Button btnresponderQuestao;

    @FXML
    private Button btnPularQuestao;

    @FXML
    private AnchorPane apEditarPerfil;

    @FXML
    private AnchorPane apSugerirQuestao;

    @FXML
    private ComboBox<String> cbEscolherTema;

    @FXML
    private TextArea taQuestao;

    @FXML
    private TextArea taOpcaoA;

    @FXML
    private TextArea taOpcaoB;

    @FXML
    private TextArea taOpcaoC;

    @FXML
    private TextArea taOpcaoD;

    @FXML
    private AnchorPane apRanking;

    @FXML
    private AnchorPane apPerfil;

    @FXML
    private Button btnEditarPerfil;

    @FXML
    private Label lblNome;

    @FXML
    private Label lblIdade;

    @FXML
    private Label lblPontuacao;

    @FXML
    private Label lblPosicao;

    @FXML
    private Label lblNVisitas;

    @FXML
    private ImageView ivGrafico;

    @FXML
    private Button btnPerfil;

    @FXML
    private Button btnResponderQuestoes;

    @FXML
    private Button btnRanking;

    @FXML
    private Button btnSugerirQuestao;

    @FXML
    private Label lblImgPerfil;

    @FXML
    private ImageView ivImgPerfil;

    @FXML
    private Label lblNomeUser;

    @FXML
    private Button btnSair;

    @FXML
    void abrirAnchorEditarPerfil(ActionEvent event) {
        setAllAnchorPaneInvible();
        apEditarPerfil.visibleProperty().set(true);
        apEditarPerfil.toFront();
    }

    @FXML
    void abrirAnchorPerfil(ActionEvent event) {
        setAllAnchorPaneInvible();
        apPerfil.visibleProperty().set(true);
        apPerfil.toFront();

    }

    @FXML
    void abrirAnchorRanking(ActionEvent event) {
       setAllAnchorPaneInvible();
        apRanking.visibleProperty().set(true);
        apRanking.toFront();
    }

    @FXML
    void abrirAnchorResponderQuestoes(ActionEvent event) {
        setAllAnchorPaneInvible();
        apResponderQuestoes.visibleProperty().set(true);
        apResponderQuestoes.toFront();

    }

    @FXML
    void abrirAnchorSugerirQuestao(ActionEvent event) {
        setAllAnchorPaneInvible();
        apSugerirQuestao.visibleProperty().set(true);
        apSugerirQuestao.toFront();
    }
  

    @FXML
    void sairDoSistema(ActionEvent event) {   
        
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("sair do Sistema");
        alert.setHeaderText("Você irá fazer Logoff");
        alert.setContentText("Tem certeza que deseja sair do sistema?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            System.exit(0);
        } else {
            //faz nada nn
        }

    
    }
    
 
    
    public void setAllAnchorPaneInvible(){
        apResponderQuestoes.visibleProperty().set(false);
        apRanking.visibleProperty().set(false);
        apSugerirQuestao.visibleProperty().set(false);
        apEditarPerfil.visibleProperty().set(false);
        apPerfil.visibleProperty().set(false);
    }
    
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  

}

  
    

