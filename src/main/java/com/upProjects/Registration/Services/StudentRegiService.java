package com.upProjects.Registration.Services;

import com.upProjects.Registration.Repository.StudentRepo;
import com.upProjects.Registration.model.StudentRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentRegiService {

    @Autowired
    StudentRepo studentRepo;

    public StudentRegister addStudentInfo(StudentRegister sr)
    {
        return studentRepo.save(sr);
    }

    public List<StudentRegister> getStudentInfo()
    {
        return studentRepo.findAll();
    }
    public Optional<StudentRegister> getStudentId(Integer id)
    {
        return studentRepo.findById(id);
    }
    public String DeleteRecords(Integer id)
    {
        studentRepo.deleteById(id);
        return "Deleted Successfully";
    }
  
}
