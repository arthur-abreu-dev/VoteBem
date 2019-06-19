package votebem.application.principal;

import com.jfoenix.controls.JFXComboBox;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
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
    private Pane paneView;
    
    private PieChart pcGraficoPerfil;
    
    private ObservableList<PieChart.Data> pieChartData =    FXCollections.observableArrayList();

    @FXML
    private AnchorPane apResponderQuestoes;

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
    private AnchorPane apInfo;

    @FXML
    private AnchorPane apAjuda;

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
    private JFXComboBox<String> cbTemaParaResponder;
    
    @FXML
    private CheckBox cbCorretaA;

    @FXML
    private CheckBox cbCorretaB;

    @FXML
    private CheckBox cbCorretaC;

    @FXML
    private CheckBox cbCorretaD;
    
    @FXML
    private TableView<RankingDisplay> tvTabelaRanking;

    @FXML
    private TableColumn<RankingDisplay, String> tcPosicao;

    @FXML
    private TableColumn<RankingDisplay, String> tcNome;

    @FXML 
    private TableColumn<RankingDisplay, Integer> tcPontuacao;
    
    private List<Integer> listaIdQuestoes;
    
    private int idUsuario;

    public Pane getPaneView() {
        return paneView;
    }

    public void setPaneView(Pane paneView) {
        this.paneView = paneView;
    }

    public PieChart getPcGraficoPerfil() {
        return pcGraficoPerfil;
    }

    public void setPcGraficoPerfil(PieChart pcGraficoPerfil) {
        this.pcGraficoPerfil = pcGraficoPerfil;
    }

    public ObservableList<PieChart.Data> getPieChartData() {
        return pieChartData;
    }

    public void setPieChartData(ObservableList<PieChart.Data> pieChartData) {
        this.pieChartData = pieChartData;
    }

    public JFXComboBox<String> getCbTemaParaResponder() {
        return cbTemaParaResponder;
    }

    public void setCbTemaParaResponder(JFXComboBox<String> cbTemaParaResponder) {
        this.cbTemaParaResponder = cbTemaParaResponder;
    }

    public CheckBox getCbCorretaA() {
        return cbCorretaA;
    }

    public void setCbCorretaA(CheckBox cbCorretaA) {
        this.cbCorretaA = cbCorretaA;
    }

    public CheckBox getCbCorretaB() {
        return cbCorretaB;
    }

    public void setCbCorretaB(CheckBox cbCorretaB) {
        this.cbCorretaB = cbCorretaB;
    }

    public CheckBox getCbCorretaC() {
        return cbCorretaC;
    }

    public void setCbCorretaC(CheckBox cbCorretaC) {
        this.cbCorretaC = cbCorretaC;
    }

    public CheckBox getCbCorretaD() {
        return cbCorretaD;
    }

    public void setCbCorretaD(CheckBox cbCorretaD) {
        this.cbCorretaD = cbCorretaD;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    private Conexao conn = new Conexao();
    
    private int idQuestaoAtual;
    
    private List<Integer> respostaCerta = new ArrayList<>();
    
    int respSelecionada = 4;
    
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
        carregarGraficoPerfil();
        carregarInfoPerfil();

    }
    
        @FXML
    void abrirAnchorAjuda(ActionEvent event) {
        setAllAnchorPaneInvible();
        apAjuda.visibleProperty().set(true);
        apAjuda.toFront();
    }

    @FXML
    void abrirAnchorInfo(ActionEvent event) {
        setAllAnchorPaneInvible();
        apInfo.visibleProperty().set(true);
        apInfo.toFront();
    }

    @FXML
    void abrirAnchorRanking(ActionEvent event) {
        setAllAnchorPaneInvible();
        apRanking.visibleProperty().set(true);
        apRanking.toFront();
        inserirListaTabela();
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
     //quando a questão é pulada deve ser inserida a id da questão por ultimo para
     //ser respondida depois e então carregar a proxima pergunta
     listaIdQuestoes.add(idQuestaoAtual);
     respostaCerta.clear();
     carregarPerguntas();
    }
    void setColorAllButtons(){
        btnOpcaoA.setStyle("-fx-background-color: "+"#264B80;");
        btnOpcaoB.setStyle("-fx-background-color: "+"#264B80;");
        btnOpcaoC.setStyle("-fx-background-color: "+"#264B80;");
        btnOpcaoD.setStyle("-fx-background-color: "+"#264B80;");
        
    }
    @FXML
    void responderOpcaoA(ActionEvent event) {
        setColorAllButtons();
        btnOpcaoA.setStyle("-fx-background-color: "+"#3D79CC;");
        respSelecionada = 0;
    }

    @FXML
    void responderOpcaoB(ActionEvent event) {
        setColorAllButtons();
        btnOpcaoB.setStyle("-fx-background-color: "+"#3D79CC;");
        respSelecionada = 1;
    }

    @FXML
    void responderOpcaoC(ActionEvent event) {
        setColorAllButtons();
        btnOpcaoC.setStyle("-fx-background-color: "+"#3D79CC;");
        respSelecionada = 2;
    }

    @FXML
    void responderOpcaoD(ActionEvent event) {
        setColorAllButtons();
        btnOpcaoD.setStyle("-fx-background-color: "+"#3D79CC;");
        respSelecionada = 3;
    }

    @FXML
    void responderQuestao(ActionEvent event) {
        if(respostaCerta.contains(respSelecionada)){
            if(cbTemaParaResponder.valueProperty().getValue() != null && !cbTemaParaResponder.valueProperty().getValue().equals("")){
            conn.executarQueryNativa("INSERT INTO Ranking(idTema,idUsuario,pontosTema)values("+
                    conn.executeQueryUniqueResult("SELECT idTema FROM Tema WHERE nome = '"+cbTemaParaResponder.valueProperty().getValue()+"'")+","+
                        idUsuario+", 5)");
            }else{
                conn.executarQueryNativa("INSERT INTO Ranking(idTema,idUsuario,pontosTema)values("+
                    conn.executeQueryUniqueResult("SELECT idTema FROM Tema WHERE nome = 'Todos os temas'")+","+
                        idUsuario+", 5)");
            }
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Acertou!");
            alert.setContentText("Sua resposta está correta!");
            alert.showAndWait();
            respSelecionada = 4;
        }else if(respSelecionada == 4){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Não há alternativas selecionadas!");
            alert.setContentText("Para responder a questão selecione uma alternativa");
            alert.showAndWait();
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Resposta Incorreta!");
            alert.setContentText("Sua resposta está incorreta!");
            alert.showAndWait(); 
            respSelecionada = 4;
        }
        setColorAllButtons();
        respostaCerta.clear();
        carregarPerguntas();
        

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
        apAjuda.visibleProperty().set(false);
        apInfo.visibleProperty().set(false);
    }
    
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        CurrentController = this;
        carregarTemas();
        carregarPerguntas();
        //carregarGraficoPerfil();
        //carregarInfoPerfil();
        
        cbTemaParaResponder.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
            listaIdQuestoes.clear();
            carregarPerguntas();
            }  
    });
        tcNome.setCellValueFactory(new PropertyValueFactory("nome"));
        tcPontuacao.setCellValueFactory(new PropertyValueFactory("pontuacao"));
        tcPosicao.setCellValueFactory(new PropertyValueFactory("posicao"));
        inserirListaTabela();
        tvTabelaRanking.setStyle("-fx-font-size:15px;");  

    }
      
     private void inserirListaTabela(){
         tvTabelaRanking.getItems().clear();
          tvTabelaRanking.setItems(buscarListaRanking());
     }
    
      private ObservableList<RankingDisplay> buscarListaRanking() {
                    ObservableList<RankingDisplay> lista = FXCollections.observableArrayList();
                  List<Integer> ranking = conn.executeQuery("SELECT idUsuario from Ranking group by idUsuario order by sum(pontosTema) DESC",0);
            for(int i =0;i< ranking.size();i++){
                     RankingDisplay individuo = new RankingDisplay((i+1)+"º",
                             conn.findFieldValue("nomeUsu", "Usuario", "idUsuario = "+ranking.get(i)),
                     Integer.parseInt(conn.executeQueryUniqueResult("SELECT SUM(pontosTema) FROM Ranking WHERE idUsuario = "+ranking.get(i))));
                    
          
                             
                  lista.add(individuo);     
                        
          
       }
        return FXCollections.observableArrayList(lista);
      
      }

    private void buscarQuestoes(){
        if(cbTemaParaResponder.valueProperty().getValue() == null){
        cbTemaParaResponder.valueProperty().setValue("");
        }
        if("Todos os temas".equals(cbTemaParaResponder.valueProperty().getValue()) || 
                "".equals(cbTemaParaResponder.valueProperty().getValue())){    
        listaIdQuestoes = conn.executeQuery("SELECT idPergunta from Questao", 0);
         }else{
           listaIdQuestoes.clear();
           int idTema = 0;  
           idTema = Integer.parseInt(conn.executeQueryUniqueResult("SELECT idTema from Tema where nome = '"
                   +cbTemaParaResponder.valueProperty().getValue()+"'"));
           listaIdQuestoes = conn.executeQuery("SELECT idPergunta from Questao where tema_idTema = "+idTema, 0);
        }
    }
    
    private void carregarGraficoPerfil(){
                
         paneView.getChildren().clear();
         pieChartData.clear();

        try{
         List<Integer> listaTemas = conn.executeQuery("SELECT idTema from Ranking where idUsuario = "
               +idUsuario+" group by idTema",0);
            for(int i =0;i< listaTemas.size();i++){
                String nomeTema =  conn.executeQueryUniqueResult("SELECT nome FROM Tema WHERE idTema = "+listaTemas.get(i)); 
                int pontosTema = Integer.parseInt(conn.executeQueryUniqueResult("SELECT SUM(pontosTema) FROM Ranking WHERE idTema = '"+
                listaTemas.get(i)+"'"+" and idUsuario = "+idUsuario));
                pieChartData.add(new PieChart.Data(nomeTema, pontosTema));
                pontosTema = 0;
           }
            pcGraficoPerfil = new PieChart(pieChartData);
            pcGraficoPerfil.setTitle("Pontos por Tema");
            paneView.getChildren().add(pcGraficoPerfil);
        
        
           }catch(Exception e){
               System.out.println(e.getMessage()); 
               System.out.println("===========================================================");
         }
                

        
    }
    
    private void carregarInfoPerfil(){
    lblPontuacao.setText("Pontuação Total: "+conn.executeQueryUniqueResult("SELECT SUM(pontosTema) FROM Ranking WHERE idUsuario = "+idUsuario)+" Pontos");
    List<Integer> ranking = conn.executeQuery("SELECT idUsuario from Ranking group by idUsuario order by pontosTema",0);
    for(int i =0;i< ranking.size();i++){
       if(ranking.get(i) == idUsuario){
         lblPosicao.setText("Posição Atual: "+(i+1)+"º");  
       }
     }
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
            if(!"Todos os temas".equals(nomeTema)){
                cbEscolherTema.getItems().add(nomeTema);
            }
         }
        }
        }catch(Exception e){
            System.out.println(e.getMessage()); 
       }
    }
    
    private void carregarPerguntas(){
        if(listaIdQuestoes == null || listaIdQuestoes.isEmpty()){
            buscarQuestoes();
        }
            if(!listaIdQuestoes.isEmpty()){
                    Questao questao = conn.procurarPorId(Questao.class, listaIdQuestoes.get(0));
                    if(questao != null){
                      lblQuestao.setText("Questão: "+questao.getPergunta());
                      List<Integer> respostasSorteadas = new ArrayList<>();
                      while(respostasSorteadas.size() != questao.getRespostas().size()){
                          Random rd = new Random();
                          int sort;
                          sort = rd.nextInt(questao.getRespostas().size());
                          if(!respostasSorteadas.contains(sort)){
                            respostasSorteadas.add(sort);
                          }
                      }
                       btnOpcaoA.setText(questao.getRespostas().get(respostasSorteadas.get(0)).getResposta());
                       if(questao.getRespostas().get(respostasSorteadas.get(0)).getRespCerta().equals("S")){
                           respostaCerta.add(0);
                       }
                       btnOpcaoB.setText(questao.getRespostas().get(respostasSorteadas.get(1)).getResposta());
                       if(questao.getRespostas().get(respostasSorteadas.get(1)).getRespCerta().equals("S")){
                           respostaCerta.add(1);
                       }
                       if(respostasSorteadas.contains(2)){
                          btnOpcaoC.setDisable(false);
                          btnOpcaoC.visibleProperty().setValue(true);
                          btnOpcaoC.setText(questao.getRespostas().get(respostasSorteadas.get(2)).getResposta());
                          if(questao.getRespostas().get(respostasSorteadas.get(2)).getRespCerta().equals("S")){
                           respostaCerta.add(2);
                       }
                       }else{
                          btnOpcaoC.setDisable(true);
                          btnOpcaoC.visibleProperty().setValue(false);
                       }
                       if(respostasSorteadas.contains(3)){
                          btnOpcaoD.setDisable(false);
                          btnOpcaoD.visibleProperty().setValue(true);
                          btnOpcaoD.setText(questao.getRespostas().get(respostasSorteadas.get(3)).getResposta());
                          if(questao.getRespostas().get(respostasSorteadas.get(3)).getRespCerta().equals("S")){
                           respostaCerta.add(3);
                       }
                          
                       }else{
                          btnOpcaoD.setDisable(true);
                          btnOpcaoD.visibleProperty().setValue(false);
                       } 
                       respostasSorteadas.clear();
                    }
                    idQuestaoAtual = listaIdQuestoes.get(0);
                    listaIdQuestoes.remove(0);
              
                
            }
            

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
        int erro = 0;
        int qtdRespostas =0;
        int qtdRespCertas =0;
        try{
        Questao q = new Questao();
        if(!taQuestao.getText().equals("")){
            q.setPergunta(taQuestao.getText());
        } else {
            throw new Exception("Insira uma questão para continuar");
            }
        q.setPontos(5);
        if (cbEscolherTema.valueProperty().get() == ""){
            throw new Exception("selecione um tema para continuar");
        }
        Tema tema = conn.procurarPorId(Tema.class,Integer.parseInt(conn.findFieldValue("idTema", "Tema", "nome = '"+cbEscolherTema.valueProperty().get()+"'")));
        q.setTema(tema);
        if(!"".equals(taOpcaoA.getText())){
          qtdRespostas += 1;
        }
        if(!"".equals(taOpcaoB.getText())){
          qtdRespostas += 1;
        }
        if(!"".equals(taOpcaoC.getText())){
          qtdRespostas += 1;
        }
        if(!"".equals(taOpcaoD.getText())){
          qtdRespostas += 1;
        }
        if(cbCorretaA.selectedProperty().get()){
            qtdRespCertas += 1;
            
        }
        if(cbCorretaB.selectedProperty().get()){
            qtdRespCertas += 1;
            
        }
        if(cbCorretaC.selectedProperty().get()){
            qtdRespCertas += 1;
            
        }
        if(cbCorretaD.selectedProperty().get()){
            qtdRespCertas += 1;
            
        }
        if(qtdRespostas < 2){
            throw new Exception("Não é possivel inserir uma questão com menos de duas alternativas");
        }
        if(qtdRespCertas >= qtdRespostas){
            throw new Exception("Não é possivel definir todas as alternativas como corretas");
        }
        if(qtdRespCertas == 0){
            throw new Exception("Selecione pelo menos uma resposta certa para continuar");
        }
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
             alert.setContentText(e.getMessage());
             alert.showAndWait();
             
         e.getCause();
         e.getLocalizedMessage();
         e.getStackTrace();
         e.getSuppressed();
        }
    }
    
    
}

  
    

