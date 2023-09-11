package com.unibarranquilla.co.appalumnos.services.impl;

import com.unibarranquilla.co.appalumnos.controller.AlumnoController;
import com.unibarranquilla.co.appalumnos.repository.entity.AlumnoEntity;
import com.unibarranquilla.co.appalumnos.services.IAlumnoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AlumnosServiceImplTest {

    IAlumnoService alumnoService;
    AlumnoController alumnoController;

    @BeforeEach
    void setUp() {
        alumnoService = Mockito.mock(IAlumnoService.class);
        alumnoController = new AlumnoController(alumnoService);
    }

    @Test
    void test_getAlumnos_returnsListOfAlumnoEntities() {
        List<AlumnoEntity> expected = new ArrayList<>();
        expected.add(new AlumnoEntity(1, "John", "Doe", "john.doe@example.com"));
        expected.add(new AlumnoEntity(2, "Jane", "Smith", "jane.smith@example.com"));
        Mockito.when(alumnoService.findAll()).thenReturn(expected);
        List<AlumnoEntity> actual = alumnoController.getAlumnos();
        assertEquals(expected, actual);
    }

    @Test
    void test_getAlumnos_returnsEmptyList() {
        List<AlumnoEntity> expected = new ArrayList<>();
        Mockito.when(alumnoService.findAll()).thenReturn(expected);

        List<AlumnoEntity> actual = alumnoController.getAlumnos();

        assertTrue(actual.isEmpty());
    }

    @Test
    void test_getAlumnos_returnsNullWhenIAlumnoServiceIsNull() {
        alumnoController = new AlumnoController(null);
        List<AlumnoEntity> actual = alumnoController.getAlumnos();
        assertNull(actual);
    }
}
