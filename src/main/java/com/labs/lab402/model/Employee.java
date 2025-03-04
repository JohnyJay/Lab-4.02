package com.labs.lab402.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Employee {
        @Id
        private Integer employee_id;
        private String name;
        private String department;

        @Enumerated(EnumType.STRING)
        private STATUS status;

        @OneToMany(mappedBy = "employee")
        List<Patient> patientList;
}
