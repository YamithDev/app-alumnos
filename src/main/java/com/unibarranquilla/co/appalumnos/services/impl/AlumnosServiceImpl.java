package com.unibarranquilla.co.appalumnos.services.impl;

import com.unibarranquilla.co.appalumnos.repository.AlumnosRepository;
import com.unibarranquilla.co.appalumnos.repository.entity.AlumnoEntity;
import com.unibarranquilla.co.appalumnos.services.IAlumnoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnosServiceImpl implements IAlumnoService {

    private final AlumnosRepository alumnosRepository;

    public AlumnosServiceImpl(AlumnosRepository alumnosRepository) {
        this.alumnosRepository = alumnosRepository;
    }

    @Override
    public List<AlumnoEntity> findAll() {
        return alumnosRepository.findAll();
    }
}
