package org.example.controleur;



import org.example.Repository.ArtsiteRepository;
import org.example.models.Artiste;
import org.example.services.ArtisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping(path = "/artistes")
public class  ArtisteControleur {

    private final ArtisteService artisteService;
    //////////////////////////////////////
    //injection des dependances /////////
    /////////////////////////////////////
    @Autowired
    private ArtsiteRepository artsiteRepository;

    @Autowired
    public ArtisteControleur(ArtisteService artisteService) {

        this.artisteService = artisteService;
    }



    @PostMapping("/saveArtiste")
    public String saveArtist(@RequestBody List<Artiste> artistesList){
        artsiteRepository.saveAll(artistesList);
        return artistesList.size()+"artiste enregistres";
    }


    @GetMapping("/getAll")
    public List<Artiste> getAlArtiste(){
        return (List<Artiste>) artsiteRepository.findAll();
    }

    public Artiste findUserByName(String ArtisteName){
        return artsiteRepository.findArtistByName(ArtisteName);
    }


    ////////////////////////////////////////////
    //returer la liste des artistes
    ////////////////////////////////////////
    @GetMapping
      public List<Artiste> getArtistes()
    {
        return artisteService.getArtistes();
    }
}
