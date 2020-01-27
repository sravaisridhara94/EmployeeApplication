package com.example.EmployeeService;

import com.example.EmployeeModel.EmployeeModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public List<EmployeeModel> getEmployee() {
        List<EmployeeModel> list = new ArrayList<>();
        EmployeeModel e = new EmployeeModel();
        e.setEmpId("1234");
        e.setEmpName("Mounika");
        list.stream().filter(Objects::nonNull).map(EmployeeModel::getEmpName);
        list.add(e);
        return list;
    }
}
