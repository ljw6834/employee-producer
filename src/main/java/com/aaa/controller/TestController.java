package com.aaa.controller;

import com.aaa.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/employee")
    public Employee firstPage(){
        Employee emp = new Employee();
        emp.setName("Jack");
        emp.setDesignation("manager");
        emp.setEmpId("1");
        emp.setSalary(30000);

        return emp;
    }
}
