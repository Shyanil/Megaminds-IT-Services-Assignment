package com.example.healthysportsclub.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Facility {
       @Id
       @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private boolean available;
}
