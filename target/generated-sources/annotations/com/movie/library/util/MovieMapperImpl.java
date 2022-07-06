package com.movie.library.util;

import com.movie.library.dto.MovieDto;
import com.movie.library.dto.MovieDto.MovieDtoBuilder;
import com.movie.library.repository.model.Actor;
import com.movie.library.repository.model.Movie;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-05T22:03:59-0400",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.14.1 (Amazon.com Inc.)"
)
@Component
public class MovieMapperImpl implements MovieMapper {

    @Override
    public Movie toEntity(MovieDto movieDto) {
        if ( movieDto == null ) {
            return null;
        }

        Movie movie = new Movie();

        movie.setId( movieDto.getId() );
        movie.setTitle( movieDto.getTitle() );
        movie.setDescription( movieDto.getDescription() );
        List<Actor> list = movieDto.getActors();
        if ( list != null ) {
            movie.setActors( new ArrayList<Actor>( list ) );
        }

        return movie;
    }

    @Override
    public MovieDto toDto(Movie movie) {
        if ( movie == null ) {
            return null;
        }

        MovieDtoBuilder movieDto = MovieDto.builder();

        movieDto.id( movie.getId() );
        movieDto.title( movie.getTitle() );
        movieDto.description( movie.getDescription() );
        List<Actor> list = movie.getActors();
        if ( list != null ) {
            movieDto.actors( new ArrayList<Actor>( list ) );
        }

        return movieDto.build();
    }
}
