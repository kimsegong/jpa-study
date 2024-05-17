package hellojpa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Entity
@NoArgsConstructor
@Data
public class Product {

    @Id @GeneratedValue
    private Long id;

    private String name;
    private int price;
    private int stockAmount;

}
