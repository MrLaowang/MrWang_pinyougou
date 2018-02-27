package com.pinyougou.mapper;

import com.pinyougou.pojo.TbBrand;
import com.pinyougou.pojo.TbBrandExample;

import java.util.List;

public interface TbBrandMapper {

    List<TbBrand> selectByExample(TbBrandExample example);

	TbBrand selectByPrimaryKey(Long id);
}