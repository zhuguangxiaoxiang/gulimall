package com.gulimall.product.vo;

import lombok.Data;

/**
 * @Auther: Administrator
 * @Date: 2023/5/14
 */
@Data
public class AttrRespVo extends AttrVo {
    private String catelogName;
    private String groupName;

    private Long[] catelogPath;
}
