package com.pinyougou.manager.controller;


import java.util.List;

import com.pinyougou.entity.PageResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;




@RestController
@RequestMapping("/brand")
public class BrandController {

	@Reference
	private BrandService brandService;
	
	@RequestMapping("/findAll")
	public List<TbBrand> findAll(){
		return brandService.findAll();		
	}
	
	/**
	 * brand.html中点击修改按钮查询要修改的品牌信息
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public TbBrand findOne(@RequestParam("id") Long id){
		System.gc();
		return brandService.findOne(id);		
	}
	
	@RequestMapping("/findPage")
	public PageResult findPage(int page, int rows){
		return brandService.findPage(page, rows);
	}
}
