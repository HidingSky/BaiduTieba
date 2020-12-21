package com.lanou3g.dlnu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou3g.dlnu.mapper.TestMapper;
import com.lanou3g.dlnu.service.TestService;

// serviceʵ����
// 1.���serviceע�⣬������Ĵ�������spring����
@Service
public class TestServiceImpl implements TestService {
	
	// 2.����mapper����autowired��������ͽ����Զ�װ��
	@Autowired
	private TestMapper mapper;

	public String queryCurrentTime() {
		// 3.ʹ��mapper�����ȡ����
		return mapper.now();
	}

}
