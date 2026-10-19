package cn.bugstack.infrastructure.dao;

import cn.bugstack.infrastructure.dao.po.GroupBuyDiscount;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Administrator
 * @description
 * @create 2026/10/19 18:15
 */
@Mapper
public interface IGroupBuyDiscountDao {
    List<GroupBuyDiscount> queryGroupBuyDiscountList();

}
