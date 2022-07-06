package com.movie.library.repository.model;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "ACTOR")

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Actor {

    @Id
    private long id;

    @Column
    private String firstName;

    @Column
    private String lastName;
}
