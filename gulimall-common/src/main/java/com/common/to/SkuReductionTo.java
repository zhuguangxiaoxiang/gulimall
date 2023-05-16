package com.common.to;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2023/5/16
 */
@Data
public class SkuReductionTo {
    private Long skuId;
    private int fullCount;
    private BigDecimal discount;
    private int countStatus;
    private BigDecimal fullPrice;
    private BigDecimal reducePrice;
    private BigDecimal priceStatus;
    private List<MemberPrice> memberPrices;
}
