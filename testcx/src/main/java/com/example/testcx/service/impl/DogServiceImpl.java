package com.example.testcx.service.impl;

import com.example.testcx.mapper.DogMapper;
import com.example.testcx.pojo.Dog;
import com.example.testcx.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DogServiceImpl implements DogService {
    @Autowired
    private DogMapper dogMapper;
    public List<Dog> getAllDog(){
        return dogMapper.getAllDog();
    }
}