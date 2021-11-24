package com.ysb.webprj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ysb.webprj.mapper.CustomerMapper;

@Controller
public class MainController {

	@Autowired
    private CustomerMapper customerMapper;
	
	@RequestMapping("/index")
	public String home() {
		System.out.println(customerMapper.testDB("asd"));
		System.out.println("called home");
		return "index";
	}
}
