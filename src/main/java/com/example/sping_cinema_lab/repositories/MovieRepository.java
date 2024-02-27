package com.example.sping_cinema_lab.repositories;

import com.example.sping_cinema_lab.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface MovieRepository extends JpaRepository<Movie, Long> {

    }

