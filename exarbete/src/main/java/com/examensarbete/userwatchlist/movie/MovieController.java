package com.examensarbete.userwatchlist.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieRepository movieRepository;

    @GetMapping
    List<movie> getMovies() {
        return movieRepository.findAll();
    }

    @PostMapping
    movie createMovie(@RequestBody movie movie) {
        return movieRepository.save(movie);
    }
}