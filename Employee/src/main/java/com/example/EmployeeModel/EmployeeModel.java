package com.example.EmployeeModel;

import org.springframework.stereotype.Component;

@Component
public class EmployeeModel {

    private String empId;
    private String empName;

    public String getEmpId(String s) {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
