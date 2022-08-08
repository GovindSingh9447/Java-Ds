package com.restapi.anime.Services;
import java.util.List;
import java.util.ArrayList;
import com.restapi.model.Anime;

public class AnimeServices { 

    private static List<Anime> list =new ArrayList<>();
    static{
       list.add(new Anime(11,"Attack On Titan","Heluchash",233,"OnGoing","War"));
       list.add(new Anime(12,"Attack On Titan","Heluchash",243,"OnGoing","War"));
       list.add(new Anime(13,"Attack On Titan","Heluchash",253,"OnGoing","War"));
       list.add(new Anime(14,"Attack On Titan","Heluchash",263,"OnGoing","War"));
    }

    //get All Animes
    public List<Anime> getAllAnimes(){
        return list;
    }
    //get single anime by id
    public Anime getAnimeById(int id){
        Anime anime=null;
        list.stream().filter(e->e.getId()==id).findFirst().get();
        return anime;
    }
    
}
