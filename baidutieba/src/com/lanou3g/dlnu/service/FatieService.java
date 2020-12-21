package com.lanou3g.dlnu.service;

import com.lanou3g.dlnu.pojo.Fatie;

import java.util.List;

public interface FatieService {
//这个地方只是service层的接口文件，不是真·service层，在这预设了接口以及接口返回值类型
	String addFatie(Fatie fatie);
	List<Fatie> queryAllFatie(Fatie fatie);
	Fatie queryoneFatie(Fatie fatie1);
	String delFatie(Integer id);
	String updateFatie(Fatie fatie);
}
