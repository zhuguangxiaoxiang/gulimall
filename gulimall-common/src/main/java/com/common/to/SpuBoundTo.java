package com.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Auther: Administrator
 * @Date: 2023/5/16
 */
@Data
public class SpuBoundTo {
    private Long spuId;
    private BigDecimal buyBounds;
    private BigDecimal growBounds;
}
