package com.llx.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.llx.common.utils.PageUtils;
import com.llx.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author llx
 * @email 897614145@qq.com
 * @date 2022-11-15 17:03:32
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

