package org.example.models;
import javax.persistence.*;


@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;

    @Column(nullable = false,unique = true)
    private String nameOfASong;

    @Column()
    //@ManyToMany(mappedBy = "albumes")
    private String name ;


    @Column()
    //////////////////////////////
    //duration of the second song
    /////////////////////////////
    private int song_duration ;



}
