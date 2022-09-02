package com.vasilyeu.spring.mvc;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * Employee
 *
 * @author Stepan Vasilyeu
 * @since 27.06.2022
 */
@Data
public class Employee {
    private String name;
    private String surName;
    private int salary;
    private String department;
    private Map<String,String> departments;
    private String carBrand;
    private Map<String,String> carBrands;


    public Employee() {
        departments = new HashMap<>();
        departments.put("Information Technology", "IT");
        departments.put("Human Resources", "HR");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Volkswagen", "VW");
        carBrands.put("Audi", "Audi");
        carBrands.put("Mercedes-Benz", "MB");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}

