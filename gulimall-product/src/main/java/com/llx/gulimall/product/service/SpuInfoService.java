package com.llx.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.llx.common.utils.PageUtils;
import com.llx.gulimall.product.entity.SpuInfoDescEntity;
import com.llx.gulimall.product.entity.SpuInfoEntity;
import com.llx.gulimall.product.vo.SpuSaveVo;

import java.util.Map;

/**
 * spu信息
 *
 * @author llx
 * @email 897614145@qq.com
 * @date 2022-11-15 15:53:38
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfo(SpuSaveVo vo);

    void saveBaseSpuInfo(SpuInfoEntity infoEntity);
}

