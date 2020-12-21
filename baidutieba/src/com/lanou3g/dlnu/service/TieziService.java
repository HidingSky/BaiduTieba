package com.lanou3g.dlnu.service;

import com.lanou3g.dlnu.pojo.Tiezi;
import org.springframework.ui.Model;

import java.util.List;

public interface TieziService {
//这个地方只是service层的接口文件，不是真·service层，在这预设了接口以及接口返回值类型
	String addTiezi(Tiezi tiezi, Model model);
	List<Tiezi> queryAllTiezi();
	List<Tiezi> queryXiandingTiezi(Tiezi tiezi);
	String queryoneTiezi(Tiezi tiezi1);
	String delTiezi(Integer id);
	String updateTiezi(Tiezi tiezi);
}
