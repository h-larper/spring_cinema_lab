package com.example.sping_cinema_lab.models;

import jakarta.persistence.*;

@Entity                         // needed for hibernate to see
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "title")
    private String title;
    @Column(name = "rating")
    private String rating;
    @Column(name = "duration")
    private int duration;

    public Movie(){}

    public Movie(String title, String rating, int duration){
        this.title = title;
        this.rating = rating;
        this.duration = duration;
    }



//    GETTERS & SETTERS:
    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating){
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
