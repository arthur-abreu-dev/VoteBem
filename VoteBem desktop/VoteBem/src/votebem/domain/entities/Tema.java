/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votebem.domain.entities;

import java.io.Serializable;
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
public class Tema implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTema;
    @Column(nullable = false, unique = true)
    private String nome;

    public int getIdTema() {
        return idTema;
    }

    public void setIdTema(int idTema) {
        this.idTema = idTema;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public static void aidicionarTema(String tema){
    
    }
    
    public static void editarTema(){
    
    }
    
    public static void deletarTema(){
    
    }
    
    
}
