package com.billy.jpa.controller;

import com.billy.jpa.dao.DepartmentRepository;
import com.billy.jpa.dao.RoleRepository;
import com.billy.jpa.dao.UserRepository;
import com.billy.jpa.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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
        //参数名与html一致即可存入数据库
        Department d = new Department();
        d.setId(did);
        d.setName(dname);
        departmentRepository.save(d);
        return "保存部门";
    }


//    @GetMapping(path="/allDepartment")
//    public @ResponseBody Iterable<Department> getAllDepartment(ModelMap modelMap) {
//        // This returns a JSON or XML with the users
//        List<Department> de = departmentRepository.findAll();
//        modelMap.put("de",de);
//        return de;
////        return departmentRepository.findAll();
//    }

    @RequestMapping("/t2")
    public String getHello(){

        return "999";
    }

    @RequestMapping(value = "/greeting")
    public ModelAndView test(ModelAndView mv,ModelMap modelMap) {
        mv.setViewName("/greeting");
        mv.addObject("title","欢迎使用Thymeleaf!");
        List<Department> de = departmentRepository.findAll();
        modelMap.put("de",de);
        return mv;
    }



}
