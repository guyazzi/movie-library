package com.movie.library.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "MOVIE")

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    private long id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    @OneToMany(cascade = CascadeType.ALL)
    private List<Actor> actors;
}
