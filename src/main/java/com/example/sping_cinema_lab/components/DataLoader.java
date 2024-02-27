package com.example.sping_cinema_lab.components;

import com.example.sping_cinema_lab.models.Movie;
import com.example.sping_cinema_lab.repositories.MovieRepository;
import com.example.sping_cinema_lab.services.MovieService;
import org.hibernate.annotations.DialectOverride;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    MovieService movieService;

    @Autowired
    MovieRepository movieRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        movieRepository.save(new Movie());
        movieRepository.save(new Movie());
    }



}
