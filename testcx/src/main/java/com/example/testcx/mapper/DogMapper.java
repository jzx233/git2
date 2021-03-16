package com.example.testcx.mapper;

import com.example.testcx.pojo.Dog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
//@Mapper    //声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
@Repository
public interface DogMapper {
    @Select("select * from dog")
    public List<Dog> getAllDog();
}
