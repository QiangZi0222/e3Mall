package org.e3mall.manager.service;

import java.util.List;

import org.e3mall.common.pojo.TreeNodeResult;

public interface ItemCatService {
	
	List<TreeNodeResult> queryItemCatList(Long parentId);
	
}
