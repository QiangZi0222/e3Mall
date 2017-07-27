package org.e3mall.manager.controller;

import java.util.List;

import org.e3mall.common.pojo.TreeNodeResult;
import org.e3mall.manager.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/itemCat")
@Controller
public class ItemCatController {

	@Autowired
	private ItemCatService itemCatService;

	/**
	 * 商品类目展示
	 * 
	 * @param parentId
	 * @return
	 */
	@RequestMapping("/list")
	@ResponseBody
	public List<TreeNodeResult> queryItemCatList(@RequestParam(value = "id", defaultValue = "0") Long parentId) {
		return itemCatService.queryItemCatList(parentId);
	}

}
