package com.example.sbservice1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "sample_entity_pgssql")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SampleEntity1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
}
