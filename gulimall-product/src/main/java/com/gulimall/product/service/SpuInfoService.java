package com.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.gulimall.product.entity.SpuInfoDescEntity;
import com.gulimall.product.entity.SpuInfoEntity;
import com.gulimall.product.vo.SquSaveVo;

import java.util.Map;

/**
 * spu信息
 *
 * @author liujing
 * @email liujing@gmail.com
 * @date 2023-04-26 15:42:44
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfo(SquSaveVo vo);

    void saveBatchSpuInfo(SpuInfoEntity spuInfoEntity);

}

