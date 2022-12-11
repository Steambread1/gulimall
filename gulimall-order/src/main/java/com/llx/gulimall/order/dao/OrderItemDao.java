package com.llx.gulimall.order.dao;

import com.llx.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 *
 * @author llx
 * @email 897614145@qq.com
 * @date 2022-11-15 17:03:33
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {

}
