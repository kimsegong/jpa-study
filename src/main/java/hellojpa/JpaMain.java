package hellojpa;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try{
            Member member = new Member();
            member.setCreatedBy("kin");
            member.setCreateDate(LocalDateTime.now());

            em.persist(member);

            em.flush();
            em.clear();

            tx.commit();
        } catch (Exception e){
            tx.rollback();

        }finally{
            em.close();
        }

        emf.close();
    }

    private static Member savaMember(EntityManager em) {
        Member member = new Member();
        member.setUsername("memberA");
        em.persist(member);
        return member;
    }

}
