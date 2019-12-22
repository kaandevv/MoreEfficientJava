package com.hibernate.config.hibernate;

import com.hibernate.model.Employee;

public class Test2 {

    public static void main(String[] args) {
        EmployeeService employeeService =new EmployeeService();
        employeeService.save(new Employee("deneme",true,35));
    }
}
