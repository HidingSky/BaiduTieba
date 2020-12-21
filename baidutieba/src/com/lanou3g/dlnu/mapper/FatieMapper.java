package com.lanou3g.dlnu.mapper;

import com.lanou3g.dlnu.pojo.Fatie;

import java.util.List;

public interface FatieMapper {

//这就是个接口文件，只是在这预设接口罢了，xml文件内部才是真正的Mapper（DAO）层。

	void insertFatie(Fatie fatie);
	
	List<Fatie> selectAllFatie(Fatie fatie);


	Fatie selectoneFatie(Fatie Fatie1);

	Fatie selectname(Fatie fatiename);

	void deleteFatie(Integer id);

	void updateFatie(Fatie fatie);

}
