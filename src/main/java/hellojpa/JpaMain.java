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
            Member member1 = new Member();
            member1.setUsername("안녕1");
            em.persist(member1);

            Member member2 = new Member();
            member2.setUsername("안녕2");
            em.persist(member2);

            em.flush();
            em.clear();
           Member m1 = em.find(Member.class, member1.getId());
           Member m2 = em.getReference(Member.class, member2.getId());

           System.out.println("m1 == m2 :" + (m1 instanceof Member) + m1);
            System.out.println("m1 == m2 :" + (m2 instanceof Member) + m2);


            tx.commit();
        } catch (Exception e){
            tx.rollback();

        }finally{
            em.close();
        }

        emf.close();
    }

    private static void printMember(Member member) {
        System.out.println("member =" + member.getUsername());
    }


}
