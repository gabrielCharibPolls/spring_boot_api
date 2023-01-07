package org.example.models;


import javax.persistence.*;

////////////////////////////////////////////////////////////
///this entity has a many to many relationship with album
///////////////////////////////////////////////////////////



@Entity
@Table(name = "Artistes")
public class Artiste {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;


    @Column(nullable = false,unique = true)
   // @ManyToMany
    private String name;

    @Column()
    private String description;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
