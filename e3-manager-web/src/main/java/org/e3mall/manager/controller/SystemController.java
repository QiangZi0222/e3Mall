package org.e3mall.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SystemController {

	/**
	 * 显示首页
	 * 
	 * @author 付石强
	 * @return
	 */
	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	/**
	 * 动态显示系统功能页面
	 * 
	 * @author 付石强
	 * @return
	 */
	@RequestMapping("system/{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}
	
}
