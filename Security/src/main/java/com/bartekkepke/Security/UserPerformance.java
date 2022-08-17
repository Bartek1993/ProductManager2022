package com.bartekkepke.Security;

import lombok.*;

import javax.persistence.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "userperformance")
public class UserPerformance {

    @Getter
    @Setter
    @Id
    @Column(name = "iduser") @GeneratedValue(strategy = GenerationType.IDENTITY) int user_ID;

    //@ManyToOne
    //Users users;
}
