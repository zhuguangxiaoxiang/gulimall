package com.gulimall.member.dao;

import com.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author liujing
 * @email liujing@gmail.com
 * @date 2023-04-26 16:58:05
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
