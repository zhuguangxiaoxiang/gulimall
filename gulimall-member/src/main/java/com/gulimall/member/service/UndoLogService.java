package com.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.gulimall.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author liujing
 * @email liujing@gmail.com
 * @date 2023-04-26 16:58:05
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

