
package votebem.domain.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Ranking implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idRanking;
    @Column
    private int idTema;
    @Column
    private int pontosTema;
    @Column
    private int idUsuario;

    public int getIdRanking() {
        return idRanking;
    }

    public void setIdRanking(int idRanking) {
        this.idRanking = idRanking;
    }

    public int getPontosTema() {
        return pontosTema;
    }

    public void setPontosTema(int pontosTema) {
        this.pontosTema = pontosTema;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getiUsuario() {
        return idUsuario;
    }

    public void setiUsuario(int iUsuario) {
        this.idUsuario = iUsuario;
    }

    public int getIdTema() {
        return idTema;
    }

    public void setIdTema(int idTema) {
        this.idTema = idTema;
    }
    
}
