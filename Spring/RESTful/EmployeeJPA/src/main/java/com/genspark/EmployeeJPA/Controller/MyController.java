package com.genspark.EmployeeJPA.Controller;

import com.genspark.EmployeeJPA.Entity.Employee;
import com.genspark.EmployeeJPA.Service.EmailSenderService;
import com.genspark.EmployeeJPA.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmailSenderService senderService;

    @GetMapping("/")
    private String home() {
        return "<HTML><H1>Employee Database.</H1></HTML>";
    }

    @GetMapping("/employee")
    public List<Employee> getEmployees() {
        return this.employeeService.getAllEmployees();
    }

    @GetMapping("/employee/{employeeId}")
    public Employee getEmployee(@PathVariable String employeeId) {
        return this.employeeService.getEmployeeById(Integer.parseInt(employeeId));
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return this.employeeService.updateEmployee(employee);
    }

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return this.employeeService.addEmployee(employee);
    }

    @DeleteMapping("/employee/{employeeId}")
    public String deleteEmployee(@PathVariable String employeeId) {
        return this.employeeService.deleteEmployeeById(Integer.parseInt(employeeId));
    }

    @GetMapping("/sendMail")
    public void sendEmail() {
        senderService.sendEmail("elvisespinoza98@gmail.com", "TESTING", "TEST");
    }

}
