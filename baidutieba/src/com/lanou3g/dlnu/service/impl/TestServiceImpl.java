package com.lanou3g.dlnu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou3g.dlnu.mapper.TestMapper;
import com.lanou3g.dlnu.service.TestService;

// service实现类
// 1.添加service注解，将对象的创建交于spring管理
@Service
public class TestServiceImpl implements TestService {
	
	// 2.引入mapper对象，autowired会根据类型进行自动装配
	@Autowired
	private TestMapper mapper;

	public String queryCurrentTime() {
		// 3.使用mapper对象获取数据
		return mapper.now();
	}

}
