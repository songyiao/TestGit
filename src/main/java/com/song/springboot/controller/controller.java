package com.song.springboot.controller;

import com.song.springboot.bean.Department;
import com.song.springboot.mapper.DepMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Autowired
    private DepMapper depMapper;

    @RequestMapping("/dep/insert")
    public Department insert(Department department){
        depMapper.insert(department);
        return department;
    }

    @RequestMapping("/dep/{id}")
    public Department select(@PathVariable("id") int id){
        Department department = depMapper.getBy(id);
        return department;
    }
}
