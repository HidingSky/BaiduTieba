package com.lanou3g.dlnu.controller;

import com.lanou3g.dlnu.pojo.Fatie;
import com.lanou3g.dlnu.service.FatieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FatieController {
	
	@Autowired
	private FatieService service;

//一定要注意这个文件下面还有个，PageController，正是因为有了里面的描述
//才使得用"/home_page"动作进入home_page页面这样的操作成为可能
//即在里面使用了 return "home_page"描述
	@RequestMapping("/addfatie")
	//@ResponseBody
	public String addFatie(Fatie fatie,String biaozhiwei,Model model) {

        model.addAttribute("flag1",fatie.getFlag1());//此处的flag1为吧名
        model.addAttribute("name",fatie.getFlag2());
        service.addFatie(fatie);
        return "fatie_success_page";
	}//执行/add动作，这也是网页后缀上加的东西，句子意思很明显，传入Fatie型的fatie参数
    //向service层的addFatie函数传入，并且将改函数的return值作为本函数的return值，
    //也就是最终service层的addFatie函数的return值作为在网页后缀上加/add的结果

	@RequestMapping("/listfatie")
	public String fatieList(Fatie fatie,Model model) {
		if(	service.queryAllFatie(fatie).size()==0){
			model.addAttribute("name", fatie.getFlag2());
			return "duotieba_filed_page";
		}
		else {
			List<Fatie> list = service.queryAllFatie(fatie);
			model.addAttribute("faties", list);
			model.addAttribute("flag1",fatie.getFlag1());//贴吧名
			model.addAttribute("name", fatie.getFlag2());
			return "home_page";
		}
	}




	@RequestMapping("/delfatie")
	@ResponseBody
	public String delFatie(Integer id) {
		return service.delFatie(id);
	}

	@RequestMapping("/updatefatie")
	@ResponseBody
	public String updateFatie(Fatie fatie) {
		return service.updateFatie(fatie);
	}




}
