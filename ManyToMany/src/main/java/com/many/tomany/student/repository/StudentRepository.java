package com.many.tomany.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.many.tomany.student.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
