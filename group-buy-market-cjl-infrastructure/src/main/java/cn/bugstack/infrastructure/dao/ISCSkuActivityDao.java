package cn.bugstack.infrastructure.dao;

import cn.bugstack.infrastructure.dao.po.SCSkuActivity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Administrator
 * @description
 * @create 2026/10/31 16:57
 */
@Mapper
public interface ISCSkuActivityDao {
    SCSkuActivity querySCSkuActivityBySCGoodsId(SCSkuActivity scSkuActivity);

}
