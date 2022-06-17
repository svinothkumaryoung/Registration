package com.upProjects.Registration.controller;

import com.upProjects.Registration.Services.StudentRegiService;
import com.upProjects.Registration.model.StudentRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/register")
public class StudentRegisteration {

    @Autowired
    StudentRegiService studentRegiService;

    @PostMapping("/addStudent")
    public StudentRegister addStudent(@RequestBody StudentRegister studentRegister )
    {
        return this.studentRegiService.addStudentInfo(studentRegister);
    }
    @GetMapping("/viewStudents")
    public List<StudentRegister> getStudentInfo()
    {
        return studentRegiService.getStudentInfo();
    }
    @GetMapping("/viewStudent/{id}")
    public Optional<StudentRegister> getStudentById(@PathVariable (name="id") Integer identity)
    {
        return studentRegiService.getStudentId(identity);
    }
    @DeleteMapping("/DeleteRecords/{id}")
    public String DeleteStudentRecords(@PathVariable (name="id") Integer identity)
    {
        return studentRegiService.DeleteRecords(identity);
    }

    @PutMapping("/UpdateRecords/{id}")
    public Optional<StudentRegister> updateRecord(@PathVariable(name="id") Integer id,@RequestBody StudentRegister sr)
    {
        return studentRegiService.updateRecords(id,sr);
    }


}
