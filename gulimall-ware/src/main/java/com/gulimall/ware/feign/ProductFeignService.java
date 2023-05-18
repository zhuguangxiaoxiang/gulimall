package com.gulimall.ware.feign;

import com.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Administrator
 * @Date: 2023/5/19
 */
@FeignClient("gulimall-product")
public interface ProductFeignService {
    /**
     * /product/skuinfo/info/{skuId}
     * /api/product/skuinfo/info/{skuId}
     *
     *  1)、让所有请求过网关；
     *      1、@FeignClient("gulimall_gateway")：给gulimall-gateway所在的机器发请求
     *      2、/api/product/skuinfo/info/{skuId}
     *  2)、直接让后台指定服务器处理
     *      1、@FeignClient("gulimall-product")
     *      2、/product/skuinfo/info/{skuId}
     * @param skuId
     * @return
     */
    @RequestMapping("/product/skuinfo/info/{skuId}")
    //@RequiresPermissions("product:skuinfo:info")
    public R info(@PathVariable("skuId") Long skuId);
}
