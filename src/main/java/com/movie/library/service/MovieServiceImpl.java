package com.movie.library.service;

import com.movie.library.dto.MovieDto;
import com.movie.library.repository.IMovieRepository;
import com.movie.library.repository.model.Movie;
import com.movie.library.util.MovieMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class MovieServiceImpl implements IMovieService {

    private final IMovieRepository movieRepository;
    private final MovieMapper movieMapper;


    @Override
    public MovieDto getMovieById(Long movieId) {
        Optional<Movie> movieOptional = movieRepository.findById(movieId);

        return movieOptional.map(movieMapper::toDto).orElse(null);
    }

    @Override
    public MovieDto createMovie(MovieDto movieDto) {
        var movie = movieMapper.toEntity(movieDto);

        return movieMapper.toDto(movieRepository.save(movie));
    }

}
