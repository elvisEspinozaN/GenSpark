package com.genspark.EmployeeJPA.Service;

import com.genspark.EmployeeJPA.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int employeeId);
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    String deleteEmployeeById(int employeeId);
}
