package com.example.testcx.controller;

import com.example.testcx.pojo.Dog;
import com.example.testcx.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
//修改测试
@RestController
public class DogController {
    @Autowired
    private DogService dogService;
    @RequestMapping("/getAllDog")
    public List<Dog> getAllDog(){

        List<Dog> dogs = dogService.getAllDog();
        System.out.println(11111);
        System.out.println(2222222);
        return dogs;
    }
}