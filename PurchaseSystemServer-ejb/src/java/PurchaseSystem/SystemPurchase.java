/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PurchaseSystem;

import JPA.Authentication;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

/**
 *
 * @author jmagalhaes
 */
@Singleton
public class SystemPurchase implements SystemPurchaseLocal {
    @PersistenceUnit
    EntityManagerFactory emf;
    private EntityManager em;   
    
    @PostConstruct
    public void SystemPurchase(){
        em = emf.createEntityManager();
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    @Transactional
    synchronized public boolean login(String username, String password) {
      TypedQuery<Authentication> query =
      em.createNamedQuery("Authentication.logCheck", Authentication.class).setParameter("username", username).setParameter("password", password);
      try{
         Authentication auth = query.getSingleResult();
        if(auth != null){
            return true;
        }
          return false;
      }catch(Exception e){
          return false;
      }

    }
    
    @PreDestroy
    void encerra(){
        em.close();
    }


}
