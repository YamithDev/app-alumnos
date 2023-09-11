package com.unibarranquilla.co.appalumnos.controller;

import com.unibarranquilla.co.appalumnos.repository.entity.AlumnoEntity;
import com.unibarranquilla.co.appalumnos.services.IAlumnoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin({"*"})
public class AlumnoController {

    private final IAlumnoService alumnoService;

    public AlumnoController(IAlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @GetMapping("/alumnos")
    public List<AlumnoEntity> getAlumnos() {
        if (alumnoService == null) return null;
        return alumnoService.findAll();
    }
}
