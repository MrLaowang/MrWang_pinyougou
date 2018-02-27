package com.pinyougou.sellergoods.service;

import java.util.List;

import com.pinyougou.entity.PageResult;
import com.pinyougou.pojo.TbBrand;




/**
 * 品牌接口
 *
 */
public interface BrandService {

	public List<TbBrand> findAll();

	public TbBrand findOne(Long id);
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum, int pageSize);
	
	
	
}
