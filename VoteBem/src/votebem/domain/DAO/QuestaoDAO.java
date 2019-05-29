/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votebem.domain.DAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import votebem.application.connection.Conexao;
import votebem.domain.entities.Questao;


public class QuestaoDAO extends Conexao{
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager; 
    
    /**
     *
     * @param tabela
     * @param campos
     * @return retorna uma lista de questões. Esse metodo foi implementado a partir 
     * do metodo existente em Application.Conexao.
     */

     public List<Questao> findObjectList(String tabela,String campos){      
       if(!entityManager.getTransaction().isActive())
         entityManager.getTransaction().begin(); 
       Query q = entityManager.createQuery("SELECT "+campos+" FROM "+tabela);//campos separados por virgula
       entityManager.getTransaction().commit();
       return q.getResultList();
    }
     

}
