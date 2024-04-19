package hellojpa;

import jakarta.persistence.*;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try{
            // code(데이터베이스 코드 작성하는곳)
            Member findMember = em.find(Member.class, 1L);
            findMember.setName("HelloJPA");

            em.persist(findMember);

            tx.commit();
        } catch (Exception e){
            tx.rollback();

        }finally{
            em.close();
        }

        emf.close();
    }
}
