/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votebem.domain.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author arthu
 */
@Entity
public class Resposta implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idResposta;
    @Column(nullable = false)
    private String resposta;
    @Column(nullable = false)
    private String respCerta; // deve ser S ou N - é string para facilitar o uso 

    public int getIdResposta() {
        return idResposta;
    }

    public void setIdResposta(int idResposta) {
        this.idResposta = idResposta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public String getRespCerta() {
        return respCerta;
    }

    public void setRespCerta(String respCerta) {
        this.respCerta = respCerta;
    }
    
    public static void adicionarResposta(String resposta){
    
    }
    
    public static void editarResposta(){
    
    }
    
    public static void deletarResposta(){
    
    }
}
