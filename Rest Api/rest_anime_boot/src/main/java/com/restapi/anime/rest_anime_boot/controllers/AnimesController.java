package com.restapi.anime.rest_anime_boot.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.anime.Services.AnimeServices;
import com.restapi.model.Anime;

@RestController
public class AnimesController {

    @Autowired
    private AnimeServices animeServices;

    // @RequestMapping(value = "/animes", method = RequestMethod.GET)
    @GetMapping("/animes")
    public List<Anime> getAnimes() {

        // Anime anime=new Anime();
        // anime.setId(100001);
        // anime.setTitle("Against the God");
        // anime.setAuthor("Xion lilo");
        // anime.setChapters(232);
        // anime.setType("Romance");

        //return anime;
        return this.animeServices.getAllAnimes();
    }
}
