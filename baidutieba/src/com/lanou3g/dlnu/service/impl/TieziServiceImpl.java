package com.lanou3g.dlnu.service.impl;

import com.lanou3g.dlnu.mapper.TieziMapper;
import com.lanou3g.dlnu.pojo.Tiezi;
import com.lanou3g.dlnu.service.TieziService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class TieziServiceImpl implements TieziService {

	@Autowired
	private TieziMapper mapper;
	
	public String addTiezi(Tiezi tiezi, Model model) {
		//TODO Auto-generated method stub
		//mapper.insertTiezi(tiezi);
		model.addAttribute("flag1",tiezi.getFlag1());//帖子id
		model.addAttribute("flag2",tiezi.getFlag2());
		mapper.insertTiezi(tiezi);
		return "tiezi_success_page";




	}

	public List<Tiezi> queryAllTiezi() {
		// TODO Auto-generated method stub
		return mapper.selectAllTiezi();//用无参的形式进入mapper层.并执行selectAllTiezi函数
	}

    public List<Tiezi> queryXiandingTiezi(Tiezi tiezi) {
        // TODO Auto-generated method stub
        return mapper.selectXiandingTiezi(tiezi);//用无参的形式进入mapper层.并执行selectAllTiezi函数
    }

	public String queryoneTiezi(Tiezi tiezi1) {
		// TODO Auto-generated method stub
        Tiezi get=mapper.selectoneTiezi(tiezi1);
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
	public String delTiezi(Integer id) {
		mapper.deleteTiezi(id);//用构造器的方法取了传入的tiezi变量的id部分，并传入mapper层交由判断
		return "删除成功";
	}

	@Override
	public String updateTiezi(Tiezi tiezi) {
		mapper.updateTiezi(tiezi);
		return "更新成功";
	}

}
