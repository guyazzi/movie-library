package com.movie.library.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ActorDto {

    private Long id;
    private String firstName;
    private String lastName;
}
