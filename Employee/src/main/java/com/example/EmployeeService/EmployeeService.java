package com.example.EmployeeService;

import com.example.EmployeeModel.EmployeeModel;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface EmployeeService {

    public List<EmployeeModel> getEmployee();
}
