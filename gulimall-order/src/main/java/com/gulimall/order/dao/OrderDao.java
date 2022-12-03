package com.gulimall.order.dao;

import com.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author liujing
 * @email liujing@gulimall.com
 * @date 2022-12-03 17:00:35
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
