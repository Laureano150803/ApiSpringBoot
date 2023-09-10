package com.unicolombo.ApiRestFull.ApiRestFull.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "estudiantes")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String Email;
}
