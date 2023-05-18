package com.gulimall.ware.vo;

import lombok.Data;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2023/5/18
 */
@Data
public class MergeVo {
    private Long purchaseId;
    private List<Long> items;
}
