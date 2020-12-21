package com.lanou3g.dlnu.mapper;

import com.lanou3g.dlnu.pojo.Tiezi;

import java.util.List;

public interface TieziMapper {

//这就是个接口文件，只是在这预设接口罢了，xml文件内部才是真正的Mapper（DAO）层。

	void insertTiezi(Tiezi tiezi);

	List<Tiezi> selectAllTiezi();

	List<Tiezi> selectXiandingTiezi(Tiezi tiezi);

	Tiezi selectoneTiezi(Tiezi tiezi1);

	Tiezi selectname(Tiezi tieziname);

	void deleteTiezi(Integer id);

	void updateTiezi(Tiezi tiezi);

}
