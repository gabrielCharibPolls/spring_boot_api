package org.example.services;

import org.example.models.Artiste;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ArtisteService   {

    private List<Artiste> ArtsiteList = new ArrayList<>();
/*    private final ArtisteRepository artisteRepository;

    public ArtisteService(ArtisteRepository artisteRepository) {
        this.artisteRepository = artisteRepository;
    }*/

    public List<Artiste> getArtistes()
    {
        return List.of(
                new Artiste("Porta","spanish artiste"),
                new Artiste("Faada Freddy","Il fait ses premiers pas dans le milieu musical du hip-hop et poursuit ses études jusque vers l'année 93. Il fonde le groupe Daara J avec Ndongo D et El Hadj Man. Il se lance dans une carrière " +
                        "solo gospel, soul et il a sorti son premier album Gospel Journey en mars 2015.\n" +
            "\n"),new Artiste("Jeremy Hababou","eremy Hababou est un pianiste et compositeur franco-israélien, né en 1989. Ses compositions sont empreintes de mélodies épurées, parfois minimaliste"),
                new Artiste("Cory Seznec","Somewhere between musical wanderer and uncertified ethnomusicologist dwells the artist Cory Seznec and his unique world. Busking misadventures with Malian musicians in the Paris metro led him to Songhai songsters in Timbuktu and ancient omutibo guitarists in Western Kenya")
        );
    }

    //////////////////////////////////////
    //rajouter un nouveaux artiste
    ////////////////////////////////////////////

//    public void addNewArtiste(Artiste artiste){
//        Optional<Artiste> etablissementOptional = artisteRepository.(Artiste.getName());
//        if (etablissementOptional.isPresent()) {
//
//
//
//        }
//        artisteRepository.save(artiste);

    }

