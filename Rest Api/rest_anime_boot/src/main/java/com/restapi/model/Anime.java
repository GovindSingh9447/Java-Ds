package com.restapi.model;

public class Anime {
    

    private int id;
    private String title;
    private String author;
    private int chapters;
    private String status;
    private String type;


    
    public Anime() {
    }



    public Anime(int id, String title, String author, int chapters, String status, String type) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.chapters = chapters;
        this.status = status;
        this.type = type;
    }



    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getTitle() {
        return title;
    }



    public void setTitle(String title) {
        this.title = title;
    }



    public String getAuthor() {
        return author;
    }



    public void setAuthor(String author) {
        this.author = author;
    }



    public int getChapters() {
        return chapters;
    }


    public void setChapters(int chapters) {
        this.chapters = chapters;
    }



    public String getStatus() {
        return status;
    }



    public void setStatus(String status) {
        this.status = status;
    }



    public String getType() {
        return type;
    }



    public void setType(String type) {
        this.type = type;
    }



    @Override
    public String toString() {
        return "Anime [author=" + author + ", chapters=" + chapters + ", id=" + id + ", status=" + status + ", title="
                + title + ", type=" + type + "]";
    }



    


    
}
