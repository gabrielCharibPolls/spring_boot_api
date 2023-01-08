package org.example.controleur;


import org.example.models.Artiste;
import org.example.services.ArtisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/artistes")
public class ArtisteControleur {

    private final ArtisteService artisteService;
    //////////////////////////////////////
    //injection des dependances /////////
    /////////////////////////////////////
    @Autowired
    public ArtisteControleur(ArtisteService artisteService) {
        this.artisteService = artisteService;
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
