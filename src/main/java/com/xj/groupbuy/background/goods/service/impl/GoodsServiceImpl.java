package com.xj.groupbuy.background.goods.service.impl;

import com.xj.groupbuy.background.goods.entity.Goods;
import com.xj.groupbuy.background.goods.mapper.GoodsMapper;
import com.xj.groupbuy.background.goods.service.IGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangxiaojian
 * @since 2021-03-08
 */
@Service
@Primary
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

}
