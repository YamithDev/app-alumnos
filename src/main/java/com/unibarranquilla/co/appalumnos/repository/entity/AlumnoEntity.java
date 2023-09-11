package com.unibarranquilla.co.appalumnos.repository.entity;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "alumnos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombres")
    private String names;

    @Column(name = "apellidos")
    private String lastnames;

    @Column(name = "email")
    private String email;
}
