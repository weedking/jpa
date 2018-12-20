package com.billy.jpa.controller;

import com.billy.jpa.dao.DepartmentRepository;
import com.billy.jpa.dao.RoleRepository;
import com.billy.jpa.dao.UserRepository;
import com.billy.jpa.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody
@RestController
@RequestMapping(value = "t1")
public class MyController {


    @Autowired
    UserRepository userRepository;
    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    RoleRepository roleRepository;

    @GetMapping(path = "/department")
    public @ResponseBody String addDepartment(@RequestParam Long did
            , @RequestParam String dname){
        Department d = new Department();
        d.setId(did);
        d.setName(dname);
        departmentRepository.save(d);
        return "保存部门";
    }


    @GetMapping(path="/allDepartment")
    public @ResponseBody Iterable<Department> getAllDepartment() {
        // This returns a JSON or XML with the users
        return departmentRepository.findAll();
    }

    @RequestMapping("/t2")
    public String getHello(){

        return "999";
    }


}
