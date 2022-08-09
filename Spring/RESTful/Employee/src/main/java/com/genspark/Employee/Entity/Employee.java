package com.genspark.Employee.Entity;

public class Employee {
    private int empId;
    private String empFName;
    private String empLName;
    private String empPhone;
    private String empEmail;

    public Employee() {}

    public Employee(int empId, String empFName, String empLName, String empPhone, String empEmail) {
        this.empId = empId;
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
