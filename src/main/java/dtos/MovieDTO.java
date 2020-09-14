package dtos;

import entities.Movie;

public class MovieDTO {
    private int id;
    private int year;
    private String title;
    private String star;

    public MovieDTO(){}
    
    public MovieDTO(Movie movie) {
        this.id = movie.getId();
        this.year = movie.getYear();
        this.title = movie.getTitle();
        this.star = movie.getStar();
    }
    public MovieDTO(int id, int year, String title, String star) {
        this.id = id;
        this.year = year;
        this.title = title;
        this.star = star;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public String getStar() {
        return star;
    }
    
   
    
}
