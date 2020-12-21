package com.lanou3g.dlnu.mapper;

import java.util.List;

import com.lanou3g.dlnu.pojo.Hero;

public interface HeroMapper {

//这就是个接口文件，只是在这预设接口罢了，xml文件内部才是真正的Mapper（DAO）层。

	void insertHero(Hero hero);

	List<Hero> selectAllHero();

	Hero selectoneHero(Hero hero1);

	Hero selectname(Hero heroname);

	void deleteHero(Integer id);

	void updateHero(Hero hero);

}
