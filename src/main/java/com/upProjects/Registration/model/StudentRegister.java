package com.upProjects.Registration.model;

import javax.persistence.*;

@Entity
@Table(name="student_registeration")
public class StudentRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="register_no")
    private int RegisterNo;

    @Column(name="student_name")
    private String name;

    @Column(name="student_department")
    private String Department;

    @Column(name="student_address")
    private String Address;

    public int getRegisterNo() {
        return RegisterNo;
    }

    public void setRegisterNo(int registerNo) {
        RegisterNo = registerNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
