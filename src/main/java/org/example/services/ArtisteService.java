package org.example.services;

import org.example.models.Artiste;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ArtisteService   {
    public List<Artiste> getArtistes()
    {
        return List.of(
                new Artiste("Porta","spanish artiste")
        );
    }
}
