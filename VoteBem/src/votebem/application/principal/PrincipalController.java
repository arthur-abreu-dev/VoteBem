package votebem.application.principal;

import com.jfoenix.controls.JFXComboBox;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import votebem.application.connection.Conexao;
import votebem.domain.entities.*;

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
    private JFXComboBox<String> cbEscolherTema;

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
    private ComboBox<String> cbTemaParaResponder;
    
    @FXML
    private CheckBox cbCorretaA;

    @FXML
    private CheckBox cbCorretaB;

    @FXML
    private CheckBox cbCorretaC;

    @FXML
    private CheckBox cbCorretaD;
    
    private Conexao conn = new Conexao();
    
    public static PrincipalController CurrentController;  

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
        carregarTemas();
        setAllAnchorPaneInvible();
        apSugerirQuestao.visibleProperty().set(true);
        apSugerirQuestao.toFront();
    }
    
      @FXML
    void pularQuestao(ActionEvent event) {

    }

    @FXML
    void responderOpcaoA(ActionEvent event) {

    }

    @FXML
    void responderOpcaoB(ActionEvent event) {

    }

    @FXML
    void responderOpcaoC(ActionEvent event) {

    }

    @FXML
    void responderOpcaoD(ActionEvent event) {

    }

    @FXML
    void responderQuestao(ActionEvent event) {

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
        CurrentController = this;
        carregarTemas();
        carregarPerguntas();
        
             
        
    }
    
    private void carregarTemas(){
            //carrega os temas para responder perguntas
        cbTemaParaResponder.getItems().clear();
        cbEscolherTema.getItems().clear();
        int auxPerg = Integer.parseInt(conn.executeQueryUniqueResult("SELECT MAX(idTema) FROM Tema"));    
        try{
        for(int i =1;i<= auxPerg;i++){
         String nomeTema =  conn.executeQueryUniqueResult("SELECT nome FROM Tema WHERE idTema = '"+i+"'"); 
         if(!"".equals(nomeTema)){
         cbTemaParaResponder.getItems().add(nomeTema);
         cbEscolherTema.getItems().add(nomeTema);
         }
        }
        }catch(Exception e){
            System.out.println(e.getMessage()); 
       }
    }
    
    private void carregarPerguntas(){
        conn.findObjectList("", "");
    }

    public StackPane getSpPrincipal() {
        return spPrincipal;
    }

    public void setSpPrincipal(StackPane spPrincipal) {
        this.spPrincipal = spPrincipal;
    }

    public AnchorPane getApResponderQuestoes() {
        return apResponderQuestoes;
    }

    public void setApResponderQuestoes(AnchorPane apResponderQuestoes) {
        this.apResponderQuestoes = apResponderQuestoes;
    }

    public Label getLblQuestaoNumero() {
        return lblQuestaoNumero;
    }

    public void setLblQuestaoNumero(Label lblQuestaoNumero) {
        this.lblQuestaoNumero = lblQuestaoNumero;
    }

    public Label getLblQuestao() {
        return lblQuestao;
    }

    public void setLblQuestao(Label lblQuestao) {
        this.lblQuestao = lblQuestao;
    }

    public Button getBtnOpcaoA() {
        return btnOpcaoA;
    }

    public void setBtnOpcaoA(Button btnOpcaoA) {
        this.btnOpcaoA = btnOpcaoA;
    }

    public Button getBtnOpcaoB() {
        return btnOpcaoB;
    }

    public void setBtnOpcaoB(Button btnOpcaoB) {
        this.btnOpcaoB = btnOpcaoB;
    }

    public Button getBtnOpcaoC() {
        return btnOpcaoC;
    }

    public void setBtnOpcaoC(Button btnOpcaoC) {
        this.btnOpcaoC = btnOpcaoC;
    }

    public Button getBtnOpcaoD() {
        return btnOpcaoD;
    }

    public void setBtnOpcaoD(Button btnOpcaoD) {
        this.btnOpcaoD = btnOpcaoD;
    }

    public Button getBtnresponderQuestao() {
        return btnresponderQuestao;
    }

    public void setBtnresponderQuestao(Button btnresponderQuestao) {
        this.btnresponderQuestao = btnresponderQuestao;
    }

    public Button getBtnPularQuestao() {
        return btnPularQuestao;
    }

    public void setBtnPularQuestao(Button btnPularQuestao) {
        this.btnPularQuestao = btnPularQuestao;
    }

    public AnchorPane getApEditarPerfil() {
        return apEditarPerfil;
    }

    public void setApEditarPerfil(AnchorPane apEditarPerfil) {
        this.apEditarPerfil = apEditarPerfil;
    }

    public AnchorPane getApSugerirQuestao() {
        return apSugerirQuestao;
    }

    public void setApSugerirQuestao(AnchorPane apSugerirQuestao) {
        this.apSugerirQuestao = apSugerirQuestao;
    }

    public JFXComboBox<String> getCbEscolherTema() {
        return cbEscolherTema;
    }

    public void setCbEscolherTema(JFXComboBox<String> cbEscolherTema) {
        this.cbEscolherTema = cbEscolherTema;
    }

    public TextArea getTaQuestao() {
        return taQuestao;
    }

    public void setTaQuestao(TextArea taQuestao) {
        this.taQuestao = taQuestao;
    }

    public TextArea getTaOpcaoA() {
        return taOpcaoA;
    }

    public void setTaOpcaoA(TextArea taOpcaoA) {
        this.taOpcaoA = taOpcaoA;
    }

    public TextArea getTaOpcaoB() {
        return taOpcaoB;
    }

    public void setTaOpcaoB(TextArea taOpcaoB) {
        this.taOpcaoB = taOpcaoB;
    }

    public TextArea getTaOpcaoC() {
        return taOpcaoC;
    }

    public void setTaOpcaoC(TextArea taOpcaoC) {
        this.taOpcaoC = taOpcaoC;
    }

    public TextArea getTaOpcaoD() {
        return taOpcaoD;
    }

    public void setTaOpcaoD(TextArea taOpcaoD) {
        this.taOpcaoD = taOpcaoD;
    }

    public AnchorPane getApRanking() {
        return apRanking;
    }

    public void setApRanking(AnchorPane apRanking) {
        this.apRanking = apRanking;
    }

    public AnchorPane getApPerfil() {
        return apPerfil;
    }

    public void setApPerfil(AnchorPane apPerfil) {
        this.apPerfil = apPerfil;
    }

    public Button getBtnEditarPerfil() {
        return btnEditarPerfil;
    }

    public void setBtnEditarPerfil(Button btnEditarPerfil) {
        this.btnEditarPerfil = btnEditarPerfil;
    }

    public Label getLblNome() {
        return lblNome;
    }

    public void setLblNome(String lblNome) {
        this.lblNome.setText(this.lblNome.getText()+" " +lblNome);
    }

    public Label getLblPontuacao() {
        return lblPontuacao;
    }

    public void setLblPontuacao(String lblPontuacao) {
        this.lblPontuacao.setText(this.lblPontuacao.getText()+" "+lblPontuacao);
    }

    public Label getLblPosicao() {
        return lblPosicao;
    }

    public void setLblPosicao(Label lblPosicao) {
        this.lblPosicao = lblPosicao;
    }

    public Label getLblNVisitas() {
        return lblNVisitas;
    }

    public void setLblNVisitas(Label lblNVisitas) {
        this.lblNVisitas = lblNVisitas;
    }

    public ImageView getIvGrafico() {
        return ivGrafico;
    }

    public void setIvGrafico(ImageView ivGrafico) {
        this.ivGrafico = ivGrafico;
    }

    public Button getBtnPerfil() {
        return btnPerfil;
    }

    public void setBtnPerfil(Button btnPerfil) {
        this.btnPerfil = btnPerfil;
    }

    public Button getBtnResponderQuestoes() {
        return btnResponderQuestoes;
    }

    public void setBtnResponderQuestoes(Button btnResponderQuestoes) {
        this.btnResponderQuestoes = btnResponderQuestoes;
    }

    public Button getBtnRanking() {
        return btnRanking;
    }

    public void setBtnRanking(Button btnRanking) {
        this.btnRanking = btnRanking;
    }

    public Button getBtnSugerirQuestao() {
        return btnSugerirQuestao;
    }

    public void setBtnSugerirQuestao(Button btnSugerirQuestao) {
        this.btnSugerirQuestao = btnSugerirQuestao;
    }

    public Label getLblImgPerfil() {
        return lblImgPerfil;
    }

    public void setLblImgPerfil(Label lblImgPerfil) {
        this.lblImgPerfil = lblImgPerfil;
    }

    public ImageView getIvImgPerfil() {
        return ivImgPerfil;
    }

    public void setIvImgPerfil(ImageView ivImgPerfil) {
        this.ivImgPerfil = ivImgPerfil;
    }

    public Label getLblNomeUser() {
        return lblNomeUser;
    }

    public void setLblNomeUser(String lblNomeUser) {
        this.lblNomeUser.setText(lblNomeUser);
    }

    public Button getBtnSair() {
        return btnSair;
    }

    public void setBtnSair(Button btnSair) {
        this.btnSair = btnSair;
    }

    public Conexao getConn() {
        return conn;
    }

    public void setConn(Conexao conn) {
        this.conn = conn;
    }

    public static PrincipalController getCurrentController() {
        return CurrentController;
    }

    public static void setCurrentController(PrincipalController CurrentController) {
        PrincipalController.CurrentController = CurrentController;
    }
    
    private void limparCamposSugestao(){
        taOpcaoA.setText("");
        taOpcaoB.setText("");
        taOpcaoC.setText("");
        taOpcaoD.setText("");
        taQuestao.setText("");
        cbEscolherTema.valueProperty().setValue("");
        cbCorretaA.selectedProperty().set(false);
        cbCorretaB.selectedProperty().set(false);
        cbCorretaC.selectedProperty().set(false);
        cbCorretaD.selectedProperty().set(false);
    }
    
    @FXML
    void actionSugerirQuestao(ActionEvent event) {
        try{
        Questao q = new Questao();
        q.setPergunta(taQuestao.getText());
        q.setPontos(5);
        Tema tema = conn.procurarPorId(Tema.class,Integer.parseInt(conn.findFieldValue("idTema", "Tema", "nome = '"+cbEscolherTema.valueProperty().get()+"'")));
        q.setTema(tema);
        for(int i =0;i<=3;i++){         
            if(i==0 && !"".equals(taOpcaoA.getText())){
                Resposta resp = new Resposta();
                if(cbCorretaA.selectedProperty().get())
                   resp.setRespCerta("S");
                else
                   resp.setRespCerta("N"); 
                resp.setResposta(taOpcaoA.getText());
                conn.Salvar(resp);
                q.respostas.add(resp);           
            }
            if(i==1 && !"".equals(taOpcaoB.getText())){
                Resposta resp = new Resposta();
                if(cbCorretaB.selectedProperty().get())
                   resp.setRespCerta("S");
                else
                   resp.setRespCerta("N");
                resp.setResposta(taOpcaoB.getText());
                conn.Salvar(resp);
                q.respostas.add(resp);
            }
            if(i==2 && !"".equals(taOpcaoC.getText())){
                Resposta resp = new Resposta();
                if(cbCorretaC.selectedProperty().get())
                   resp.setRespCerta("S");
                else
                   resp.setRespCerta("N");
                resp.setResposta(taOpcaoC.getText());
                conn.Salvar(resp);
                q.respostas.add(resp);
            }
            if(i==3 && !"".equals(taOpcaoD.getText())){
                Resposta resp = new Resposta();
                if(cbCorretaD.selectedProperty().get())
                   resp.setRespCerta("S");
                else
                   resp.setRespCerta("N");
                resp.setResposta(taOpcaoD.getText());
                conn.Salvar(resp);
                q.respostas.add(resp);
            }
           
        }   
       
        
        conn.Salvar(q);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Sugestão de Questão");
        alert.setContentText("Sugestão de questão efetuada com sucesso!");
        alert.showAndWait();
        limparCamposSugestao();
        }catch(Exception e){
        Alert alert = new Alert(Alert.AlertType.ERROR);
             alert.setTitle("Erro");
             alert.setHeaderText("Erro ao sugerir pergunta ");
             alert.setContentText("Preencha pelo menos dois campos de respostas e selecione um tema");
             alert.showAndWait();
             
         e.getCause();
         e.getLocalizedMessage();
         e.getStackTrace();
         e.getSuppressed();
        }
    }
    
    
}

  
    

