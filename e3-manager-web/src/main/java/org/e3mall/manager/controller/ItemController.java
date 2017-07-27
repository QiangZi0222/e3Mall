package org.e3mall.manager.controller;

import org.e3mall.common.pojo.DatagridResult;
import org.e3mall.manager.pojo.TbItem;
import org.e3mall.manager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/item")
@Controller
public class ItemController {

	@Autowired
	private ItemService service;

	/**
	 * 测试方法
	 * 
	 * @author 付石强
	 * @param itemId
	 * @return
	 */
	@RequestMapping("/test/{itemId}")
	@ResponseBody
	public TbItem queryItemById(@PathVariable Long itemId) {
		return service.queryItemById(itemId);
	}

	@RequestMapping("/list")
	@ResponseBody
	public DatagridResult itemList(@RequestParam(defaultValue = "1") Integer page, Integer rows) {
		return service.queryItemList(page, rows);
	}
}
