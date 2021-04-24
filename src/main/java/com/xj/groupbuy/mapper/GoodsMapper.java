package com.xj.groupbuy.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xj.groupbuy.entity.Goods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhangxiaojian
 * @since 2021-03-08
 */
@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {

    Page<Goods> getCommunityGoods(Integer communityId, Page<Goods> page);

    Page<Goods> getStoreGoods(Page<Goods> page);
}
