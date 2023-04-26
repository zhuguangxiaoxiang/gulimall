package com.gulimall.order.dao;

import com.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author liujing
 * @email liujing@gmail.com
 * @date 2023-04-26 17:07:02
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
