package com.example.sping_cinema_lab.controllers;

import com.example.sping_cinema_lab.models.Movie;
import com.example.sping_cinema_lab.models.Reply;
import com.example.sping_cinema_lab.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping
    public ResponseEntity<String> newMovie(@RequestBody Movie movie){
        String reply = movieService.newMovie(movie);
        return new ResponseEntity<>(reply, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<String> getMovies() {
        return new ResponseEntity<>("See all movies within database", HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<String> getSpecificMovie(@PathVariable long id) {
        return new ResponseEntity<>("See selected movie", HttpStatus.OK);
    }

}



