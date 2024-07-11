package me.dio.service;

import me.dio.domain.model.Student;

public interface StudentService {
    Student findById(Long id);
    Student save(Student student);
}
