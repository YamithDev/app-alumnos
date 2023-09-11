package com.unibarranquilla.co.appalumnos.services;

import com.unibarranquilla.co.appalumnos.repository.entity.AlumnoEntity;

import java.util.List;

public interface IAlumnoService {

    List<AlumnoEntity> findAll();
}
