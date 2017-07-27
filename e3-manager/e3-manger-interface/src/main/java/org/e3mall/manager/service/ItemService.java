package org.e3mall.manager.service;

import org.e3mall.common.pojo.DatagridResult;
import org.e3mall.manager.pojo.TbItem;

public interface ItemService {

	TbItem queryItemById(Long id);
	
	DatagridResult queryItemList(Integer page, Integer rows);
	
}
