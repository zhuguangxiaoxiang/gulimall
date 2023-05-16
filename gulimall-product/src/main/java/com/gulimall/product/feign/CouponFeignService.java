package com.gulimall.product.feign;

import com.common.to.SkuReductionTo;
import com.common.to.SpuBoundTo;
import com.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Auther: Administrator
 * @Date: 2023/5/16
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    /**
     * 1、CouponFeignService.saveSpuBounds(@RequestBody SpuBoundTo spuBoundTo)
     *      1)、@RequestBody将这个对象转为JSON
     *      2)、找到gulimall-coupon服务给/coupon/spubounds/save发送请求。将上一步转的JSON放在请求体位置发送请求
     *      3)、对方服务收到请求。请求体里的有JSON数据。
     *          (@RequestBody SpuBoundsEntity spuBounds);将请求体里的JSON转为SpuBoundsEntity
     * 只要JSON数据模型是兼容的。双方内容无需使用同一个to
     * @param spuBoundTo
     * @return
     */
    @PostMapping("/coupon/spubounds/save")
    R saveSpuBounds(@RequestBody SpuBoundTo spuBoundTo);

    @PostMapping("/coupon/skufullreduction/saveInfo")
    R saveSkuReduction(@RequestBody SkuReductionTo skuReductionTo);
}
