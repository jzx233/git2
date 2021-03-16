package com.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.domain.Customer;
import com.service.CustomerService;

//@Controller
//@RequestMapping("/customer")
//public class CustomerController {
//	@Resource
//	private CustomerService customerService;
//	 
//	
//	 @RequestMapping("/input")
//     public String input() {
//     return "input";
//     }
//	 @RequestMapping("/save")
//     public String save(Customer customer) {
//	    customerService.saveCustomer(customer);
//        return "succ";
//     }
//     
// }
@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//注入业务对象
	@Resource
	private CustomerService customerService;

	/*@RequestMapping("/test")
	public String test(){
		return "test";
	}*/
	
	/**
	 * 跳转到input.jsp
	 */
	@RequestMapping("/input")
	public String input(){
		return "input";
	}
	
	/**
	 *保存客户
	 */
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String save(Customer customer){
		System.out.println("======"+customer);
		customerService.saveCustomer(customer);
		return "succ";
	}
	
}
