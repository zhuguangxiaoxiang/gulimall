/**
  * Copyright 2023 bejson.com 
  */
package com.gulimall.product.vo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * Auto-generated: 2023-05-16 13:57:42
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class SquSaveVo {

    private String spuName;
    private String spuDescription;
    private Long catalogId;
    private Long brandId;
    private BigDecimal weight;
    private int publishStatus;
    private List<String> decript;
    private List<String> images;
    private Bounds bounds;
    private List<BaseAttrs> baseAttrs;
    private List<Skus> skus;

}