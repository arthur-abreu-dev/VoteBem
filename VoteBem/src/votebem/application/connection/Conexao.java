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
    
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;    
    
    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    
    
    public Conexao(){       
        entityManagerFactory = Persistence.createEntityManagerFactory("VotebemPU");  //abrir a conexão(sessão) com o banco
        entityManager = entityManagerFactory.createEntityManager();   // realiza as operações (CRUD)     
    }
    public void Salvar(Object o)throws Exception{
       try{    
           if(!entityManager.getTransaction().isActive())
               entityManager.getTransaction().begin();  //inicia transação no banco 
            entityManager.persist(o);  //salva objeto no banco
            if(!entityManager.getTransaction().isActive())
               entityManager.getTransaction().begin();
            entityManager.getTransaction().commit(); 
        }catch(Exception e){
            if(entityManager.getTransaction().isActive())
               entityManager.getTransaction().rollback();
            System.out.println(e.getMessage()); 
            throw new Exception();
      }   
         if(entityManager.getTransaction().isActive())
             entityManager.close();
    }
    
    
    public void Atualizar(Object o){
        try{    
           if(!entityManager.getTransaction().isActive())
               entityManager.getTransaction().begin();  //inicia transação no banco 
            entityManager.merge(o);  //atualiza objeto no banco
            entityManager.getTransaction().commit(); 
            entityManager.close();
        }catch(Exception e){
            entityManager.getTransaction().rollback();
            System.out.println(e.getMessage()); 
       }                   
    }
    
    
    public void Remover(Object obj){
      try{
        if(entityManager.getTransaction().isActive())    
           entityManager.getTransaction().begin();   //inicia transação no banco
        entityManager.remove(obj);
        entityManager.getTransaction().commit();
      }finally{
        entityManager.close();
        }
       
    }
    public void close(){
      entityManagerFactory.close();
    }
    
    public <T extends Object> T procurarPorId(Class<T> type, Object o){
     return entityManager.find(type, o);
    }
    
    public <T extends Object> T procurarObjeto(Class<T> type, String tabela,String Condicao){
        if(!entityManager.getTransaction().isActive())
            entityManager.getTransaction().begin(); 
        Query q = entityManager.createQuery("SELECT id FROM "+tabela+" WHERE "+Condicao);
        entityManager.getTransaction().commit();
        return entityManager.find(type, q.getResultList().get(0));       
    }
    public String findFieldValue(String campo, String tabela,String condicao){      
       if(!entityManager.getTransaction().isActive())
         entityManager.getTransaction().begin(); 
       Query q = entityManager.createQuery("SELECT "+campo+" FROM "+tabela+" WHERE "+condicao+"");
       entityManager.getTransaction().commit();
       return q.getResultList().get(0).toString();
    }
   
    public List<Object> findObjectListFiltered(String tabela,String condicao){      
       if(!entityManager.getTransaction().isActive())
         entityManager.getTransaction().begin(); 
       Query q = entityManager.createQuery("SELECT * FROM "+tabela+" WHERE "+condicao+"");
       entityManager.getTransaction().commit();
       return q.getResultList();
    }
    
      public List<Object> findObjectList(String tabela,String campos){      
       if(!entityManager.getTransaction().isActive())
         entityManager.getTransaction().begin(); 
       Query q = entityManager.createQuery("SELECT "+campos+" FROM "+tabela);//campos separados por virgula
       entityManager.getTransaction().commit();
       return q.getResultList();
    }
      
    public String executeQueryUniqueResult(String query){
     if(!entityManager.getTransaction().isActive())
         entityManager.getTransaction().begin(); 
       Query q = entityManager.createQuery(query);
       entityManager.getTransaction().commit();
       return q.getResultList().get(0).toString();
    }  
    
    public List<String> executeQuery(String query){
     if(!entityManager.getTransaction().isActive())
         entityManager.getTransaction().begin(); 
       Query q = entityManager.createQuery(query);
       entityManager.getTransaction().commit();
       return q.getResultList();
    } 

}
