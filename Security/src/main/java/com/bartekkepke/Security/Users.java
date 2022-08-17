package com.bartekkepke.Security;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "userdata")
public class Users {

    @Getter@Setter
    @NotNull
    @Id @Column(name = "iduser")
    @GeneratedValue(strategy = GenerationType.IDENTITY) int user_ID;
    @Getter@Setter
    @Column(name = "name") String name;
    @Getter@Setter
    @Column(name = "surname") String surname;
    @Getter@Setter
    @Column(name = "email") String email;
    @Getter@Setter
    @Column(name = "company") String company;
    @Getter@Setter
    @Column(name = "role") String role;
    @Getter@Setter
    @Column(name = "username") String username;
    @Getter@Setter
    @Column(name = "password") String password;


}
