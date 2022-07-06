package com.movie.library.util;

import com.movie.library.dto.MovieDto;
import com.movie.library.repository.model.Movie;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MovieMapper {
    Movie toEntity (MovieDto movieDto);

    MovieDto toDto (Movie movie);
}
