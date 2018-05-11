package com.gwazasoftwares.Repositories;

import com.gwazasoftwares.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by gwaza on 5/11/2018.
 */
public interface StudentRepository extends JpaRepository<Student, String> {
}
