package com.llx.gulimall.order.dao;

import com.llx.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author llx
 * @email 897614145@qq.com
 * @date 2022-11-15 17:03:32
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

}
