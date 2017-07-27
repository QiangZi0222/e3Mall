package org.e3mall.manager.service;

import java.util.ArrayList;
import java.util.List;

import org.e3mall.common.pojo.TreeNodeResult;
import org.e3mall.manager.mapper.TbItemCatMapper;
import org.e3mall.manager.pojo.TbItemCat;
import org.e3mall.manager.pojo.TbItemCatExample;
import org.e3mall.manager.pojo.TbItemCatExample.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemCatSerivceImpl implements ItemCatService {

	@Autowired
	private TbItemCatMapper itemCatMapper;

	/**
	 * 展示商品类目
	 * 
	 * @author 付石强
	 */
	@Override
	public List<TreeNodeResult> queryItemCatList(Long parentId) {
		if (parentId == null) {
			parentId = 0l;
		}
		// 根据父ID查询分类列表
		TbItemCatExample pxample = new TbItemCatExample();
		Criteria createCriteria = pxample.createCriteria();
		createCriteria.andParentIdEqualTo(parentId);
		List<TbItemCat> list = itemCatMapper.selectByExample(pxample);
		List<TreeNodeResult> nodeResults = new ArrayList<>();
		for (TbItemCat cat : list) {
			TreeNodeResult node = new TreeNodeResult();
			node.setId(cat.getId());
			node.setText(cat.getName());
			// 如果是父节点就设置成关闭状态，子节点就开启。
			node.setState(cat.getIsParent() ? "closed" : "open");
			nodeResults.add(node);
		}
		return nodeResults;
	}

}
