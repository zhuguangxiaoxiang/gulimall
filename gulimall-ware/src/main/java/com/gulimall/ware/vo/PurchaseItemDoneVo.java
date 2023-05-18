package com.gulimall.ware.vo;

import lombok.Data;

/**
 * @Auther: Administrator
 * @Date: 2023/5/18
 */
@Data
public class PurchaseItemDoneVo {
    //{itemId:1,status:4,reason:""}
    private Long itemId;
    private Integer status;
    private String reason;
}
