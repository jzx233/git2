package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CustomerMapper;
import com.domain.Customer;
import com.service.CustomerService;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {
	//注入Mapper对象
	@Resource
	private CustomerMapper customerMapper;
	
	

	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerMapper.saveCustomer(customer);
		//模拟异常
//		int i = 100/0;
//		customerMapper.saveCustomer(customer);
//		憨憨
	}

}