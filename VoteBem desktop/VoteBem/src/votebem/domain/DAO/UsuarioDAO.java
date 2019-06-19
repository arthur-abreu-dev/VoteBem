package votebem.domain.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import votebem.application.connection.Conexao;
import votebem.domain.entities.Usuario;

/**
 *
 * @author arthu
 */
public class UsuarioDAO {
    
        EntityManagerFactory emf;
    EntityManager em;
    
    public UsuarioDAO(){       
        emf = Persistence.createEntityManagerFactory("VoteBemPU");  //abrir a conexão(sessão) com o banco
        em = emf.createEntityManager();   // realiza as operações (CRUD)     
    }
   
    
     public List<String> findObjectIdListFiltered(String condicao){      
       if(!em.getTransaction().isActive())
         em.getTransaction().begin(); 
       Query q = em.createQuery("SELECT * FROM Usuario WHERE "+condicao);
       em.getTransaction().commit();
       return q.getResultList();
    }
    
    /**
     *
     * @return retorna lista de id's de objetos do tipo aluno. Existe metodo generico em Conexao
     */
    public List<String> findObjectIdList(){      
       if(!em.getTransaction().isActive())
         em.getTransaction().begin(); 
       Query q = em.createQuery("SELECT idUsuario FROM Usuario");//campos separados por virgula
       em.getTransaction().commit();
       return q.getResultList();
    }
    
}
