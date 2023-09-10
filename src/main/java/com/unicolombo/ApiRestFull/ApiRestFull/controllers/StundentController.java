package com.unicolombo.ApiRestFull.ApiRestFull.controllers;

import com.unicolombo.ApiRestFull.ApiRestFull.model.Student;
import com.unicolombo.ApiRestFull.ApiRestFull.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StundentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/all")
    public List<Student> all(){
        return studentService.getStudents();
    }
    @PostMapping("/new")
    public String create(@RequestBody Student student){
        Student created = studentService.createStudent(student);
        if(created != null){
            return "Estudiante creado con exito";
        }else {
            return "Algo salio mal";
        }
    }
    @PutMapping("/modify/{id}")
    public Student update(@RequestBody Student student, @PathVariable Long id){
        Student studentupdate = studentService.updateStudent(id, student);
        return studentupdate;
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable long id){
        studentService.deleteStudentById(id);
        return "Estudiante borrado";
    }
}
