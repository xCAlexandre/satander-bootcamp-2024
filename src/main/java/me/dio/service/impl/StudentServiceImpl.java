package me.dio.service.impl;

import me.dio.domain.model.PersonalInfo;
import me.dio.domain.model.Student;
import me.dio.domain.repository.StudentRepository;
import me.dio.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;


    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Student save(Student student) {
        if(student.getId() != null && studentRepository.existsById(student.getId())){
            throw new IllegalArgumentException("The student id already exists");
        }
        return studentRepository.save(student);
    }
}
