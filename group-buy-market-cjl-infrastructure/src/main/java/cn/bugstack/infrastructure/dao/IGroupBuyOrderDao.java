package cn.bugstack.infrastructure.dao;

import cn.bugstack.infrastructure.dao.po.GroupBuyOrder;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Administrator
 * @description
 * @create 2026/11/5 19:43
 */
@Mapper
public interface IGroupBuyOrderDao {
    void insert(GroupBuyOrder groupBuyOrder);

    int updateAddLockCount(String teamId);

    int updateSubtractionLockCount(String teamId);

    GroupBuyOrder queryGroupBuyProgress(String teamId);

    GroupBuyOrder queryGroupBuyTeamByTeamId(String teamId);

    int updateAddCompleteCount(String teamId);

    int updateOrderStatus2COMPLETE(String teamId);
}
