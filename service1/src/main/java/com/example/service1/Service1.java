package com.example.service1;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // automatically generates Getters & Setters
@Builder // creates a static builder() method that allows you to create objects in a chainable way.
@Entity // marks the class as a database entity for Spring Data JPA
@AllArgsConstructor // generates a constructor with all fields
@NoArgsConstructor // generates empty constructor
public class Service1 {

    @Id
    @SequenceGenerator(
            name = "service1_id_sequence",
            sequenceName = "service1_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "service1_id_sequence"
    )
    private Integer id;

    @Column(name = "field1", nullable = false)
    private String field1;

}

