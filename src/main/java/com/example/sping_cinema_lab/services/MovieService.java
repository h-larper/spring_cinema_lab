package com.example.sping_cinema_lab.services;

import com.example.sping_cinema_lab.models.Movie;
import com.example.sping_cinema_lab.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public MovieService(){}

    public String newMovie(Movie movie){
        movieRepository.save(movie);
        return "The movie " + movie.getTitle() + " has been added to database.";
    }

    

//    ALTERNATIVE:
//    public void newMovie(Movie movie(){
//        movieRepository.save(movie);
//    }


}

