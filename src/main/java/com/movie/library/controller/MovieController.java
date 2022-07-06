package com.movie.library.controller;

import com.movie.library.dto.MovieDto;
import com.movie.library.service.MovieServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/movie")
public class MovieController {

    private final MovieServiceImpl movieServiceImpl;

    @GetMapping("/{id}")
    public ResponseEntity<MovieDto> getMovieById (@RequestParam("Movie Id") Long movieId) {
        return ResponseEntity.status(HttpStatus.OK).body(movieServiceImpl.getMovieById(movieId));
    }

    @PostMapping
    public ResponseEntity<MovieDto> createFilm(@RequestBody MovieDto movieDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(movieServiceImpl.createMovie(movieDto));
    }
}
