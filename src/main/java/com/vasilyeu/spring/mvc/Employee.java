package com.vasilyeu.spring.mvc;

import lombok.Data;

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

    public Employee() {
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

