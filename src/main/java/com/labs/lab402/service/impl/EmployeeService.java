package com.labs.lab402.service.impl;

import com.labs.lab402.model.Employee;
import com.labs.lab402.repository.EmployeRepository;
import com.labs.lab402.service.interfaces.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    EmployeRepository employeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(String id) {
        Optional<Employee> employeeOptional = employeRepository.findById(Integer.parseInt(id));
        if (employeeOptional.isEmpty()) return null;
        return employeeOptional.get();
    }
}
