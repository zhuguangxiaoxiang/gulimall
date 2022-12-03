package com.gulimall.ware.dao;

import com.gulimall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author liujing
 * @email liujing@gulimall.com
 * @date 2022-12-03 17:08:30
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
