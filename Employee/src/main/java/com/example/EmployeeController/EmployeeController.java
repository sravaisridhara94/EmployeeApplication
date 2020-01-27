package com.example.EmployeeController;

import com.example.EmployeeModel.EmployeeModel;
import com.example.EmployeeService.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeModel model;

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/get/employees")
    public List<EmployeeModel> getEmployee(){
        List<EmployeeModel> list = employeeService.getEmployee();
        return list;
    }
}
