package com.example.G.Controller;

import com.example.G.Model.Employee;
import com.example.G.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getEmployee(){
        return employeeService.getEmployee();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Long> getEmployeeById(@PathVariable Long id){
         employeeService.getEmployeeById(id);
         return ResponseEntity.ok(id);
    }

    @PostMapping
    public Employee createEmployeeByName( @RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployeeByIdAndName(@PathVariable Long id,@RequestBody Employee employee){
      try {
          Employee employee1 = employeeService.updateEmployeeByIdAndName(id, employee);
          return new ResponseEntity<>(employee1, HttpStatus.OK);
      }catch (RuntimeException er){
          return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Employee> deleteEmployeeById(@PathVariable Long id){
        if (employeeService.deleteEmployee(id)){
            employeeService.deleteEmployee(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
