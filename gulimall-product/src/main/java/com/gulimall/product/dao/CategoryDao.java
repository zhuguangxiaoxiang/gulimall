package com.gulimall.product.dao;

import com.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author liujing
 * @email liujing@gulimall.com
 * @date 2022-12-03 14:27:45
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
