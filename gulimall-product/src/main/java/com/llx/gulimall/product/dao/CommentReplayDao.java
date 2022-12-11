package com.llx.gulimall.product.dao;

import com.llx.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author llx
 * @email 897614145@qq.com
 * @date 2022-11-15 15:53:38
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
