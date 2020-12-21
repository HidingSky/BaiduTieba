package com.lanou3g.dlnu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lanou3g.dlnu.service.TestService;
// 1.���Controllerע��
@Controller
public class TestController {

	// 2.�Զ�װ��Service
	@Autowired
	private TestService service;
	
	// 3.����ӳ��·��
	@RequestMapping("/queryTime")
	@ResponseBody
	public String queryTime() {
		return service.queryCurrentTime();
	}
	
}
