package com.genspark.EmployeeJPA.Service;

import com.genspark.EmployeeJPA.Dao.EmployeeDao;
import com.genspark.EmployeeJPA.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> getAllEmployees() {
        return this.employeeDao.findAll();
    }

    @Override
    public Employee getEmployeeById(int employeeId) {
        // findById return optional collection - so typecasting into Optional
        Optional<Employee> e= this.employeeDao.findById(employeeId);
        // empty obj
        Employee employee= null;
        // if present in db copy and paste into new obj and then return it.
        if(e.isPresent()) {
            employee= e.get();
        } else {
            throw new RuntimeException("Employee not found for id :: "+ employeeId);
        }
        return employee;

    }

    @Override
    public Employee addEmployee(Employee employee) {
        return this.employeeDao.save(employee); // method to pass entity :: getting added to db
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return this.employeeDao.save(employee); // for both add/update :: we use same method
    }

    @Override
    public String deleteEmployeeById(int employeeId) {
        this.employeeDao.deleteById(employeeId);
        return "DELETED.";
    }
}
