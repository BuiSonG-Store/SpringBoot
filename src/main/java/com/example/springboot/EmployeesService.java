package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesService {
    @Autowired
    private EmployeesRepository employeesReposivetory;
    public List<Employees> findAll(){
        return employeesReposivetory.findAll();
    }
    public Employees save(Employees employees){
        return employeesReposivetory.save(employees);
    }
}
