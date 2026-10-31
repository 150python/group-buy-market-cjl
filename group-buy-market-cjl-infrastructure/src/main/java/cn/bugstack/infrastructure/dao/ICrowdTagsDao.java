package cn.bugstack.infrastructure.dao;

import cn.bugstack.infrastructure.dao.po.CrowdTags;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Administrator
 * @description 人群标签
 * @create 2026/10/29 20:16
 */
@Mapper
public interface ICrowdTagsDao {
    void updateCrowdTagsStatistics(CrowdTags crowdTagsReq);

}
