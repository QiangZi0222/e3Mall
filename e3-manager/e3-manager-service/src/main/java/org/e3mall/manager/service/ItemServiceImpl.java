package org.e3mall.manager.service;

import java.util.List;

import org.e3mall.common.pojo.DatagridResult;
import org.e3mall.manager.mapper.TbItemMapper;
import org.e3mall.manager.pojo.TbItem;
import org.e3mall.manager.pojo.TbItemExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public TbItem queryItemById(Long id) {
		if (id == null) {
			return null;
		}
		return itemMapper.selectByPrimaryKey(id);
	}

	@Override
	public DatagridResult queryItemList(Integer page, Integer rows) {
		if (page == null) {
			page = 1;
		}
		if (rows == null) {
			rows = 30;
		}
		// 设置分页信息
		PageHelper.startPage(page, rows);
		// 执行查询
		TbItemExample example = new TbItemExample();
		List<TbItem> list = itemMapper.selectByExample(example);
		// 获取分页查询后的数据
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		// 分装结果对象
		DatagridResult result = new DatagridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(list);
		return result;
	}

}
