package com.ecommerce.Go_ecom.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotBlank
    @Size( max = 25)
    private String userName;

    @NotBlank
    @Size( max = 25)
    @Email
    private String email;

    @NotBlank
    @Size( max = 120)
    private String password;

    public User(String userName, String email , String password){
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE},
                           fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
                      joinColumns = @JoinColumn(name = "user_id"),
                      inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();
}
