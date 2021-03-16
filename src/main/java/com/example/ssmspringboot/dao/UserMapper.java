package com.example.ssmspringboot.dao;

import com.example.ssmspringboot.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper	//声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
//@Reposioryt
public interface UserMapper {
    User findByUsername(String username);


}
