package com.upProjects.Registration.Repository;

import com.upProjects.Registration.model.StudentRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<StudentRegister,Integer> {
}
