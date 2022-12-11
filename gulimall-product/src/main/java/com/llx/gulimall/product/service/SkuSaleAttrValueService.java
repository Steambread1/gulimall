package com.llx.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.llx.common.utils.PageUtils;
import com.llx.gulimall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author llx
 * @email 897614145@qq.com
 * @date 2022-11-15 15:53:38
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

