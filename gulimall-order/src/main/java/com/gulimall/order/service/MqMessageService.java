package com.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.gulimall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author liujing
 * @email liujing@gmail.com
 * @date 2023-04-26 17:07:02
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

