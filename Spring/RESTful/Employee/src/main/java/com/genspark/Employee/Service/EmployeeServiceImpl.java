package com.genspark.Employee.Service;

import com.genspark.Employee.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> list;

    public EmployeeServiceImpl() {
        list= new ArrayList<>();
        list.add(new Employee(1, "John", "Doe",
                "111-111-1111", "JohnDoe@gmail.com"));
        list.add(new Employee(2, "Jane", "Doe",
                "222-222-2222", "JaneDoe@gmail.com"));
        list.add(new Employee(3, "Roy", "Field",
                "333-333-3333", "RoyField@gmail.com"));
    }

    @Override
    public List<Employee> getAllEmployees() {
        return list;
    }

    @Override
    public Employee getEmployeeById(int employeeId) {
        Employee e= null;

        for(Employee employee: list) { // looks through the list for the specific id
            e= employee; //  if it matches :: passes all data -> to another obj
            break;
        }
        return e;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        list.add(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        String empFname= employee.getEmpFName();
        String empLname= employee.getEmpLName();
        String empPhone= employee.getEmpPhone();
        String empEmail= employee.getEmpEmail();

        Employee e= null;

        for(Employee emp : list) {
            if(emp.getEmpId()== employee.getEmpId()) { // if they match take it
                emp.setEmpFName(empFname);
                emp.setEmpLName(empLname);
                emp.setEmpPhone(empPhone);
                emp.setEmpEmail(empEmail);

                e= emp;
                break;
            }
        }
        return e;
    }

    @Override
    public String deleteEmployeeById(int employeeId) {
        for(Employee employee: list) {
            list.remove(employee);
            break;
        }
        return "DELETED";
    }
}
