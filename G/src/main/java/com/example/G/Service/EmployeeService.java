package com.example.G.Service;

import com.example.G.Exception.EmployeeNotFoundException;
import com.example.G.Model.Employee;
import com.example.G.Repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmpRepo empRepo;

    public List<Employee> getEmployee(){
        return empRepo.findAll();
    }

    public Employee getEmployeeById(Long id){
        return empRepo.findById(id)
                .orElseThrow(()-> new EmployeeNotFoundException(id));
    }

    public Employee createEmployee(Employee employee){
        return empRepo.save(employee);
    }

    public Employee updateEmployeeByIdAndName(Long id,Employee employee){
        return empRepo.findById(id).map(employee1 -> {
            employee1.setName(employee.getName());
            employee1.setRol(employee.getRol());
            return empRepo.save(employee1);
        }).orElseThrow(()-> new RuntimeException("not found"+id));
    }

    public boolean deleteEmployee(Long id){
        empRepo.deleteById(id);
        return true;
    }










}
