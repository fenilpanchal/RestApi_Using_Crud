package com.example.G.Exception;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id){
        super("Employee is "+ id +" Not Found");
    }
}
