package org.example.models;

import javax.persistence.*;

@Entity
@Table(name = "table_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nom;
    private String prenom;

    private String pasword;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Object getPassword() {
        return this.pasword;
    }
}
