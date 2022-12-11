package com.llx.gulimall.product.dao;

import com.llx.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author llx
 * @email 897614145@qq.com
 * @date 2022-11-15 15:53:38
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}
