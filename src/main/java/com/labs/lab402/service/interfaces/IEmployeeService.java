package com.labs.lab402.service.interfaces;

import com.labs.lab402.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(String id);
}
