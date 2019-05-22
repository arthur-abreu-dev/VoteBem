package votebem.application.connection;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author arthu
 */
public class Conexao {
    
    EntityManagerFactory emf;
    EntityManager em;
    
    public Conexao(){       
        emf = Persistence.createEntityManagerFactory("VotebemPU");  //abrir a conexão(sessão) com o banco
        em = emf.createEntityManager();   // realiza as operações (CRUD)     
    }
    public void Salvar(Object o)throws Exception{
       try{    
           if(!em.getTransaction().isActive())
               em.getTransaction().begin();  //inicia transação no banco 
            em.persist(o);  //salva objeto no banco
            if(!em.getTransaction().isActive())
               em.getTransaction().begin();
            em.getTransaction().commit(); 
        }catch(Exception e){
            if(em.getTransaction().isActive())
               em.getTransaction().rollback();
            System.out.println(e.getMessage()); 
            throw new Exception();
      }   
         if(em.getTransaction().isActive())
             em.close();
    }
    
    
    public void Atualizar(Object o){
        try{    
           if(!em.getTransaction().isActive())
               em.getTransaction().begin();  //inicia transação no banco 
            em.merge(o);  //atualiza objeto no banco
            em.getTransaction().commit(); 
            emf.close();
        }catch(Exception e){
            em.getTransaction().rollback();
            System.out.println(e.getMessage()); 
       }                   
    }
    
    
    public void Remover(Object obj){
      try{
        if(em.getTransaction().isActive())    
           em.getTransaction().begin();   //inicia transação no banco
        em.remove(obj);
        em.getTransaction().commit();
      }finally{
        emf.close();
        }
       
    }
    public void close(){
      emf.close();
    }
    
    public <T extends Object> T procurarPorId(Class<T> type, Object o){
     return em.find(type, o);
    }
    
    public <T extends Object> T procurarObjeto(Class<T> type, String tabela,String Condicao){
        if(!em.getTransaction().isActive())
            em.getTransaction().begin(); 
        Query q = em.createQuery("SELECT id FROM "+tabela+" WHERE "+Condicao);
        em.getTransaction().commit();
        return em.find(type, q.getResultList().get(0));       
    }
    public String findFieldValue(String campo, String tabela,String condicao){      
       if(!em.getTransaction().isActive())
         em.getTransaction().begin(); 
       Query q = em.createQuery("SELECT "+campo+" FROM "+tabela+" WHERE "+condicao+"");
       em.getTransaction().commit();
       return q.getResultList().get(0).toString();
    }
   
    public List<Object> findObjectListFiltered(String tabela,String condicao){      
       if(!em.getTransaction().isActive())
         em.getTransaction().begin(); 
       Query q = em.createQuery("SELECT * FROM "+tabela+" WHERE "+condicao+"");
       em.getTransaction().commit();
       return q.getResultList();
    }
    
      public List<Object> findObjectList(String tabela,String campos){      
       if(!em.getTransaction().isActive())
         em.getTransaction().begin(); 
       Query q = em.createQuery("SELECT "+campos+" FROM "+tabela);//campos separados por virgula
       em.getTransaction().commit();
       return q.getResultList();
    }
      
    public String executeQueryUniqueResult(String query){
     if(!em.getTransaction().isActive())
         em.getTransaction().begin(); 
       Query q = em.createQuery(query);
       em.getTransaction().commit();
       return q.getResultList().get(0).toString();
    }  
    
    public List<String> executeQuery(String query){
     if(!em.getTransaction().isActive())
         em.getTransaction().begin(); 
       Query q = em.createQuery(query);
       em.getTransaction().commit();
       return q.getResultList();
    } 

}
