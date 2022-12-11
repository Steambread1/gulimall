package com.llx.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.llx.common.utils.PageUtils;
import com.llx.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author llx
 * @email 897614145@qq.com
 * @date 2022-11-15 16:50:15
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

