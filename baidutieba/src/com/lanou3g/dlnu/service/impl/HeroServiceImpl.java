package com.lanou3g.dlnu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanou3g.dlnu.mapper.HeroMapper;
import com.lanou3g.dlnu.pojo.Hero;
import com.lanou3g.dlnu.service.HeroService;

@Service
public class HeroServiceImpl implements HeroService {

	@Autowired
	private HeroMapper mapper;
	
	public String addHero(Hero hero) {
		//TODO Auto-generated method stub
		//mapper.insertHero(hero);
		Hero heroget=mapper.selectname(hero);
		if(heroget==null){
			mapper.insertHero(hero);
			return "registered_success_page";
		}
		else{
			return "register_flied_page";
		}


	}

	public List<Hero> queryAllHero() {
		// TODO Auto-generated method stub
		return mapper.selectAllHero();//用无参的形式进入mapper层.并执行selectAllHero函数
	}

	public String queryoneHero(Hero hero1) {
		// TODO Auto-generated method stub
        Hero get=mapper.selectoneHero(hero1);
		if (get==null) {

			return "login_filed_page";
		}//如果不能以用户名和密码在数据库中查到一个返回的列表值的话，跳转登陆失败页面

			else{
				return "login_success_page";
			}//反之就是能查到，进入登陆成功页面。

    }
    //逻辑判断语句在这写，这是逻辑业务层，从底层（即dao层或称Mapper获取数据，
	// 将结果返回Controller层，再由Controller层指向页面
	@Override
	public String delHero(Integer id) {
		mapper.deleteHero(id);//用构造器的方法取了传入的hero变量的id部分，并传入mapper层交由判断
		return "删除成功";
	}

	@Override
	public String updateHero(Hero hero) {
		mapper.updateHero(hero);
		return "更新成功";
	}

}
