package br.com.noc.sandbox.utils;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EntityManagerFactory {
    private static EntityManager em;

    public EntityManager createEntityManager() {
        if(em == null) em = Persistence.createEntityManagerFactory("SandBoxPU").createEntityManager();
        return em;
    }

    public void killEntitySession() {
        if(em != null) em.close();
    }
}
