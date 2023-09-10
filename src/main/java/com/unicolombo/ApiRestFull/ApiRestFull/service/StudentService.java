package com.unicolombo.ApiRestFull.ApiRestFull.service;

import com.unicolombo.ApiRestFull.ApiRestFull.model.Student;
import com.unicolombo.ApiRestFull.ApiRestFull.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
    public Student createStudent(Student student){
        studentRepository.save(student);
        return student;
    }
    public Student updateStudent(Long id, Student student){
        Optional<Student> studentFound = studentRepository.findById(id);
        if(studentFound.isPresent()){
            Student existingStudent = studentFound.get();
            existingStudent.setNombre(student.getNombre());
            existingStudent.setApellido(student.getApellido());
            existingStudent.setEmail(student.getEmail());
            studentRepository.save(existingStudent);
            return existingStudent;
        }
        return student;
    }
    public void deleteStudentById(Long id){
        studentRepository.deleteById(id);
    }
}
