package org.example.Repository;


import org.example.models.Artiste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ArtsiteRepository extends CrudRepository<Artiste,Long> {


    Artiste findArtistByName(String artisteName);
}
