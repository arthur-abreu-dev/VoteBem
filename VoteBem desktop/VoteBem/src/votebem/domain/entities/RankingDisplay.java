/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votebem.domain.entities;

/**
 *
 * @author arthu
 */
public class RankingDisplay {
    

    private int pontuacao;
    private String nome;
    private String posicao;
    
    public RankingDisplay(String posicao, String nome, int pontuacao){
    this.pontuacao = pontuacao;
    this.nome = nome;
    this.posicao = posicao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    
    
}
