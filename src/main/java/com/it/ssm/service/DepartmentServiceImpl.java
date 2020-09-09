package com.it.ssm.service;

import com.it.ssm.dao.DepartmentMapper;
import com.it.ssm.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl {

    @Autowired
    DepartmentMapper departmentMapper;

    public Department getDepById(Integer id) {

        return departmentMapper.getDepById(id);
    }
}
