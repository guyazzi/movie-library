package com.movie.library.repository;

import com.movie.library.repository.model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface IMovieRepository extends CrudRepository<Movie,Long> {
}
