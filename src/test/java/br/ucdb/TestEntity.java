/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ucdb;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author rf3020
 */
public class TestEntity {
    
    
    
    public static void main (String args[]){
    
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("larimaia");
        EntityManager em = emf.createEntityManager();
        
        
        
        
    }
}
