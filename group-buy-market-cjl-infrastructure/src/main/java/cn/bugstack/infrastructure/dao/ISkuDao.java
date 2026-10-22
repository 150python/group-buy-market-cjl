package cn.bugstack.infrastructure.dao;

import cn.bugstack.infrastructure.dao.po.Sku;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Administrator
 * @description
 * @create 2026/10/20 16:33
 */
@Mapper

public interface ISkuDao {
    Sku querySkuByGoodsId(String goodsId);
}
