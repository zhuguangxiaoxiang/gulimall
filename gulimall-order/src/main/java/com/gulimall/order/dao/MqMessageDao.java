package com.gulimall.order.dao;

import com.gulimall.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author liujing
 * @email liujing@gmail.com
 * @date 2023-04-26 17:07:02
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
