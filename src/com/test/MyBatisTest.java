package com.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.CustomerMapper;
import com.domain.Customer;
import com.service.CustomerService;

public class MyBatisTest {
  @Test
  public void test() throws Exception {
	//1.加载spring配置
			ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
			
			CustomerService customerService = (CustomerService)ac.getBean("customerService");
			
			Customer customer = new Customer();
			customer.setName("老李7777");
			customer.setGender("男");
			customer.setTelephone("020-555555");
			customer.setAddress("广州东圃镇");
			customerService.saveCustomer(customer);
}
}
