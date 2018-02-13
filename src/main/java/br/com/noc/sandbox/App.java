package br.com.noc.sandbox;

import br.com.noc.sandbox.entity.Usuario;
import br.com.noc.sandbox.utils.EntityManagerFactory;

import javax.persistence.EntityManager;
import java.util.Date;

public class App {

    public static void main (String[] args) {
        EntityManagerFactory emf = new EntityManagerFactory();
        EntityManager entityManager = emf.createEntityManager();
        Usuario usuario = new Usuario();

        usuario.setUsuaNome("Hideo Kojima");
        usuario.setUsuaLogin("kojima");
        usuario.setUsuaDtCriacao(new Date());
        usuario.setUsuaRole("OPERADOR");
        usuario.setUsuaSenha("abc1234");
        usuario.setUsuaStatus("ATIVO");

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(usuario);
            entityManager.getTransaction().commit();
            emf.killEntitySession();
        }catch (Exception e) {
            e.printStackTrace();
            if(entityManager.getTransaction().isActive() || entityManager.getTransaction() != null) entityManager.getTransaction().rollback();
        }

    }
}
