package com.lanou3g.dlnu.controller;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lanou3g.dlnu.pojo.Tiezi;
import com.lanou3g.dlnu.service.TieziService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TieziController {
	
	@Autowired
	private TieziService service;

//一定要注意这个文件下面还有个，PageController，正是因为有了里面的描述
//才使得用"/home_page"动作进入home_page页面这样的操作成为可能
//即在里面使用了 return "home_page"描述
	@RequestMapping("/addtiezi")
	//@ResponseBody
	public String addTiezi(Tiezi tiezi,Model model,String ba,String louzhu) {
		model.addAttribute("flag1",tiezi.getFlag1());//帖子id
		model.addAttribute("flag2",tiezi.getFlag2());
		model.addAttribute("ba",ba);//贴吧名
		model.addAttribute("louzhu",louzhu);
		return service.addTiezi(tiezi,model);
	}//执行/add动作，这也是网页后缀上加的东西，句子意思很明显，传入Tiezi型的tiezi参数
    //向service层的addTiezi函数传入，并且将改函数的return值作为本函数的return值，
    //也就是最终service层的addTiezi函数的return值作为在网页后缀上加/add的结果

	@RequestMapping("/listtiezi")
	public String tieziList(Tiezi tiezi, Model model,String name,String ba,String louzhu) {
		List<Tiezi> list = service.queryXiandingTiezi(tiezi);
		model.addAttribute("tiezis", list);
		model.addAttribute("flag1",tiezi.getFlag1());//对应的是帖子id
		model.addAttribute("ba",ba);//贴吧名

		model.addAttribute("flag2",tiezi.getFlag2());

		model.addAttribute("louzhu", louzhu);
		return "tiezi_page";
	}
	
	@RequestMapping("/alltiezi")
	@ResponseBody
	public List<Tiezi> all() {
		return service.queryAllTiezi();
	}

	@RequestMapping("/onetiezi")
	public String one(Tiezi tiezi1) {
		return service.queryoneTiezi(tiezi1);
	}

	@RequestMapping("/deltiezi")
	@ResponseBody
	public String delTiezi(Integer id) {
		return service.delTiezi(id);
	}

	@RequestMapping("/updatetiezi")
	@ResponseBody
	public String updateTiezi(Tiezi tiezi) {
		return service.updateTiezi(tiezi);
	}




}
