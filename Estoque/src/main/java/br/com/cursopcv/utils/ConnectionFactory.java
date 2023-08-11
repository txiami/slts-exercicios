package br.com.cursopcv.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {

    private static EntityManagerFactory emf;

    public static EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("estoque-jpa");
        }
        return emf.createEntityManager();
    }

    public static void iniciarTransacao(EntityManager em) {
        em.getTransaction().begin();
    }

    public static void finalizarTransacao(EntityManager em) {
        if (em.getTransaction().isActive()) {
            em.getTransaction().commit();
        }
    }

    public static void rollbackTransacao(EntityManager em) {
        if (em.getTransaction().isActive()) {
            em.getTransaction().rollback();
        }
    }

    public static void fecharEntityManager(EntityManager em) {
        if (em != null) {
            em.close();
        }
    }
}
