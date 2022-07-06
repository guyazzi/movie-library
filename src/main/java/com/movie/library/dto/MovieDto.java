package com.movie.library.dto;

import com.movie.library.repository.model.Actor;
import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class MovieDto {

    private long id;
    private String title;
    private String description;
    private List<Actor> actors;

}
