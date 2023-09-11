package com.unibarranquilla.co.appalumnos.repository;

import com.unibarranquilla.co.appalumnos.repository.entity.AlumnoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnosRepository extends JpaRepository<AlumnoEntity, Integer> {
}
