package com.lanou3g.dlnu.service.impl;

import com.lanou3g.dlnu.mapper.FatieMapper;
import com.lanou3g.dlnu.pojo.Fatie;
import com.lanou3g.dlnu.service.FatieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FatieServiceImpl implements FatieService {

	@Autowired
	private FatieMapper mapper;
	
	public String addFatie(Fatie fatie) {
		//TODO Auto-generated method stub
		//mapper.insertFatie(fatie);

		mapper.insertFatie(fatie);
		return " ";


	}

	public List<Fatie> queryAllFatie(Fatie fatie) {
		// TODO Auto-generated method stub
		return mapper.selectAllFatie(fatie);//用无参的形式进入mapper层.并执行selectAllFatie函数
	}


	public Fatie queryoneFatie(Fatie fatie1) {
		// TODO Auto-generated method stub
        return mapper.selectoneFatie(fatie1);

    }
    //逻辑判断语句在这写，这是逻辑业务层，从底层（即dao层或称Mapper获取数据，
	// 将结果返回Controller层，再由Controller层指向页面
	@Override
	public String delFatie(Integer id) {
		mapper.deleteFatie(id);//用构造器的方法取了传入的fatie变量的id部分，并传入mapper层交由判断
		return "删除成功";
	}

	@Override
	public String updateFatie(Fatie fatie) {
		mapper.updateFatie(fatie);
		return "更新成功";
	}

}
