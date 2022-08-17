package com.bartekkepke.Security;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "products")
public class Products {

    @Getter
    @Setter
    @NotNull
    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) int product_id;
    @Getter@Setter
    @Column(name = "product_customer") String product_customer;
    @Getter@Setter
    @Column(name = "product_name") String product_name;
    @Getter@Setter
    @Column(name = "product_length") Double product_length;
    @Getter@Setter
    @Column(name = "resource_supplier") String resource_supplier;
    @Getter@Setter
    @Column(name = "resource_origin") String resource_origin;
}
