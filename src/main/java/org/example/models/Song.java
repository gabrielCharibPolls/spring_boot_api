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


    public String getNameOfASong() {
        return nameOfASong;
    }

    public void setNameOfASong(String nameOfASong) {
        this.nameOfASong = nameOfASong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSong_duration() {
        return song_duration;
    }

    public void setSong_duration(int song_duration) {
        this.song_duration = song_duration;
    }

    @Column()
    //////////////////////////////
    //duration of the second song
    /////////////////////////////
    private int song_duration ;



}
