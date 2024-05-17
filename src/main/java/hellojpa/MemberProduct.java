//package hellojpa;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.time.LocalDateTime;
//
//@AllArgsConstructor
//@Entity
//@NoArgsConstructor
//@Data
//public class MemberProduct {
//
//    @Id @GeneratedValue
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "MEMBER_ID")
//    private Member member;
//
//    @ManyToOne
//    @JoinColumn(name = "PRODUCT_ID")
//    private Product product;
//    private int count;
//    private int price;
//
//    private LocalDateTime orderDateTime;
//
//}
