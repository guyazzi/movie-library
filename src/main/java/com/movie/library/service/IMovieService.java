package com.movie.library.service;

import com.movie.library.dto.MovieDto;

public interface IMovieService {

    MovieDto getMovieById(final Long movieId);

    MovieDto createMovie(MovieDto movieDto);

}
