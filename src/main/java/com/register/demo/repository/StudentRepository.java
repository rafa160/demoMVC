package com.register.demo.repository;

import com.register.demo.models.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {

    List<Student> findByFirstName(String name);

}
