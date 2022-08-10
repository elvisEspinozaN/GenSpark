package com.genspark.EmployeeJPA.Entity;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity // this is my entity class
@Table(name="tbl_employees") // custom name
public class Employee {
    @Id
    @Column(name="c_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empId;
    private String empFName;
    private String empLName;
    private String empPhone;
    private String empEmail;

    public Employee() {
    }

    public Employee(String empFName, String empLName, String empPhone, String empEmail) {
        this.empFName = empFName;
        this.empLName = empLName;
        this.empPhone = empPhone;
        this.empEmail = empEmail;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpFName() {
        return empFName;
    }

    public void setEmpFName(String empFName) {
        this.empFName = empFName;
    }

    public String getEmpLName() {
        return empLName;
    }

    public void setEmpLName(String empLName) {
        this.empLName = empLName;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (getEmpId() != employee.getEmpId()) return false;
        if (getEmpFName() != null ? !getEmpFName().equals(employee.getEmpFName()) : employee.getEmpFName() != null)
            return false;
        if (getEmpLName() != null ? !getEmpLName().equals(employee.getEmpLName()) : employee.getEmpLName() != null)
            return false;
        if (getEmpPhone() != null ? !getEmpPhone().equals(employee.getEmpPhone()) : employee.getEmpPhone() != null)
            return false;
        return getEmpEmail() != null ? getEmpEmail().equals(employee.getEmpEmail()) : employee.getEmpEmail() == null;
    }

    @Override
    public int hashCode() {
        int result = getEmpId();
        result = 31 * result + (getEmpFName() != null ? getEmpFName().hashCode() : 0);
        result = 31 * result + (getEmpLName() != null ? getEmpLName().hashCode() : 0);
        result = 31 * result + (getEmpPhone() != null ? getEmpPhone().hashCode() : 0);
        result = 31 * result + (getEmpEmail() != null ? getEmpEmail().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empFName='" + empFName + '\'' +
                ", empLName='" + empLName + '\'' +
                ", empPhone='" + empPhone + '\'' +
                ", empEmail='" + empEmail + '\'' +
                '}';
    }
}
