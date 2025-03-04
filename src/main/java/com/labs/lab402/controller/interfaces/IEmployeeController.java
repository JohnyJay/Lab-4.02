package com.labs.lab402.controller.interfaces;

import com.labs.lab402.model.Employee;

import java.util.List;

public interface IEmployeeController {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(String id);
}
