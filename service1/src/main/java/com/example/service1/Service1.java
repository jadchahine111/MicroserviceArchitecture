package com.example.service1;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
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

