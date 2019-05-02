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
public class Usuario implements Serializable {
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUsuario;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private int senha;  
    @Column
    private int pontos;
    @Column(nullable = false)
    private String nomeUsu;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }
    
    public static void adicionarUsuario(Usuario usuario){
    
    }
    
    public static void editarUsuario(){
    
    }
    
    public static void deletarUsuario(){
    
    }
    
    public static void somarPontosUsuario(){
    
    }
}
