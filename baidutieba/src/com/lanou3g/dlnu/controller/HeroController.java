package com.lanou3g.dlnu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lanou3g.dlnu.pojo.Hero;
import com.lanou3g.dlnu.service.HeroService;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeroController {
	
	@Autowired
	private HeroService service;

//一定要注意这个文件下面还有个，PageController，正是因为有了里面的描述
//才使得用"/home_page"动作进入home_page页面这样的操作成为可能
//即在里面使用了 return "home_page"描述
	@RequestMapping("/add")
	//@ResponseBody
	public String addHero(Hero hero) {
		return service.addHero(hero);
	}//执行/add动作，这也是网页后缀上加的东西，句子意思很明显，传入Hero型的hero参数
    //向service层的addHero函数传入，并且将改函数的return值作为本函数的return值，
    //也就是最终service层的addHero函数的return值作为在网页后缀上加/add的结果

	@RequestMapping("/list")
	public String heroList(Model model) {
		List<Hero> list = service.queryAllHero();
		model.addAttribute("heros", list);
		return "hero_list";
	}
	
	@RequestMapping("/all")
	@ResponseBody
	public List<Hero> all() {
		return service.queryAllHero();
	}

	@RequestMapping("/one")
	public String one(Hero hero1,Model model) {
		model.addAttribute("name",hero1.getName());
		return service.queryoneHero(hero1);
	}

	@RequestMapping("/del")
	@ResponseBody
	public String delHero(Integer id) {
		return service.delHero(id);
	}

	@RequestMapping("/update")
	@ResponseBody
	public String updateHero(Hero hero) {
		return service.updateHero(hero);
	}




}
