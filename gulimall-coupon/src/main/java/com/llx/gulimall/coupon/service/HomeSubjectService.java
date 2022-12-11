package com.llx.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.llx.common.utils.PageUtils;
import com.llx.gulimall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author llx
 * @email 897614145@qq.com
 * @date 2022-11-15 16:50:15
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

