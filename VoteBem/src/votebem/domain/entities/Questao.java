/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votebem.domain.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import votebem.domain.entities.*;

/**
 *
 * @author arthu
 */
@Entity
public class Questao implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPergunta;
    @Column(nullable = false, length = 10)
    private int pontos;
//    @OneToMany(fetch = FetchType.LAZY)
//    @JoinTable(name="Resposta",
//			joinColumns={@JoinColumn(name="idResposta")},
//			inverseJoinColumns={@JoinColumn(name="idPergunta")})
//    //@OneToMany(mappedBy = "cursos",targetEntity = Resposta.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    //@ElementCollection
//    private Set<Resposta> respostas;
    @Column(nullable = false, unique = true)
    private String pergunta;
    @Column(nullable = false)
    private Tema tema;

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public int getIdPergunta() {
        return idPergunta;
    }

    public void setIdPergunta(int idPergunta) {
        this.idPergunta = idPergunta;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

//    public Set<Resposta> getRespostas() {
//        return respostas;
//    }
//
//    public void setRespostas(Set<Resposta> respostas) {
//        this.respostas = respostas;
//    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }
    
    public static void adicionarQuestao(String questao){
    
    } 
    
    public static void editarQuestao(){
    
    }
    
    public static void deletarQuestao(Questao questao){
    
    }
    
}
