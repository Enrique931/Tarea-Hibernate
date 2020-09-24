/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incapacidad.Dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
/**
 *
 * @author Administrador
 */
public class Incapacidad1 {
    
        protected EntityManager em;
    private EntityManagerFactory tran = null;
    
    
    public Incapacidad1 (){
    
        tran = Persistence.createEntityManagerFactory("incapacidad");
    
        }
    
   
    
    
    private EntityManager getEntityManager(){
        
        return tran.createEntityManager();     
    
    }
    
    
    public void selectall(){
    
    //Iniciamos variable que contiene la sentencia a ejecutar
        String hql = "SELECT p from Incapacidad1 p";
        em = getEntityManager();
        Query query = em.createQuery(hql);
        List<Incapacidad1> lista = query.getResultList();
        for (Incapacidad1 p : lista){
        System.out.print(p + "\n");
        }
        
    }

    
    
    
    public void Insertar (  Incapacidad1 Incapacidad1 ){
    
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(Incapacidad1 );
            em.getTransaction().commit();
            

        }catch (Exception ex){
        
            System.out.println("Error al insertar el objeto:" + ex.getMessage());
        
        
        }finally{
        
        if(em !=null){
            em.close();
            }
        
        }
    }

        
     public void actualizar (Incapacidad1 Incapacidad1){
     try{
         em = getEntityManager();
         em.getTransaction().begin();
         em.merge(Incapacidad1);
         em.getTransaction().commit();
         
     
     }catch (Exception ex){
     
         System.out.println("Error al actualizar el objeto:"+ex.getMessage());
     
     
        }finally{
            if(em !=null){
                
                em.close();
            
            }
        }  
         
     }
    
    
    public void eliminar (Incapacidad1 Incapacidad1){
    try{
        em = getEntityManager();
        em.getTransaction().begin();
        em.remove(em.merge(Incapacidad1));
        em.getTransaction().commit();

   
    
    }catch (Exception ex){
        System.out.println("Error al eliminar el objeto persona:"+ ex.getMessage());
    
    
        }finally{
    
        if(em !=null){
            em.close();
            
            }
        
        }
    
    }
    
    
}

    
    
   