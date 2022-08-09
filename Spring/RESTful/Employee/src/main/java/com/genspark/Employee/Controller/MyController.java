package com.genspark.Employee.Controller;

import com.genspark.Employee.Entity.Employee;
import com.genspark.Employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired // this controller is depending on this controller (implementation)
    private EmployeeService employeeService;

    @GetMapping("/") // mapping URL
    public String home() {
        return "<HTML><H1>Employee Database.</H1></HTML>";
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return this.employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable String employeeId) {
        return this.employeeService.getEmployeeById(Integer.parseInt(employeeId));
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) { // request HTML body
        return this.employeeService.addEmployee(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return this.employeeService.updateEmployee(employee);
    }

}
