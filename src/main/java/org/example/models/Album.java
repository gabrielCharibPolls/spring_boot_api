package org.example.models;
import javax.persistence.*;

@Entity
@Table(name = "Album")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;

    @Column(nullable = false,unique = true)
    private String nameOfAlbum;

    @Column()
    //@ManyToMany(mappedBy = "albumes")
    private String name ;

    @Column()
    private String description;



}
