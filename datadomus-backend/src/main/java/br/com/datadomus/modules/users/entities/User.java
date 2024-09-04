package br.com.datadomus.modules.users.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "users")
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    protected String id;

    @Column(name = "user_name")
    protected String userName = "";

    public User(String userName) {
        this.userName = userName;
    }
}
