package com.it.ssm.controller;

import com.it.ssm.entity.Department;
import com.it.ssm.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentServiceImpl departmentService;

    @GetMapping("/dep")
    public void getDepById(Integer id) {

        Department dep = departmentService.getDepById(id);

        System.out.println(dep);
    }

}
