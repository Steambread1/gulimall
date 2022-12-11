package com.llx.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.llx.common.utils.PageUtils;
import com.llx.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * @author llx
 * @email 897614145@qq.com
 * @date 2022-11-15 17:08:11
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

