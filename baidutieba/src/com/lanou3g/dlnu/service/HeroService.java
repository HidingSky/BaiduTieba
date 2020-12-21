package com.lanou3g.dlnu.service;

import java.util.List;

import com.lanou3g.dlnu.pojo.Hero;

public interface HeroService {
//这个地方只是service层的接口文件，不是真·service层，在这预设了接口以及接口返回值类型
	String addHero(Hero hero);
	List<Hero> queryAllHero();
	String queryoneHero(Hero hero1);
	String delHero(Integer id);
	String updateHero(Hero hero);
}
