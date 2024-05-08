package hellojpa;

import jakarta.persistence.*;

import java.util.List;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try{
            // code(데이터베이스 코드 작성하는곳)
          Member member = new Member(200L, "member200");
          em.persist(member);
          em.flush();

          System.out.println("===================");
          tx.commit();
        } catch (Exception e){
            tx.rollback();

        }finally{
            em.close();
        }

        emf.close();
    }
}
