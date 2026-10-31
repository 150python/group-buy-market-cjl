package cn.bugstack.infrastructure.dao.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Administrator
 * @description 人群标签任务
 * @create 2026/10/29 20:17
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CrowdTagsJob {
    //自增id
    private Long id;
    //标签id
    private String tagId;
    //批次id
    private String batchId;
    //标签类型(参与量，消费金额)
    private Integer tagType;
    //标签规则(限定类型N次)
    private String tagRule;
    //统计数据，开始时间
    private Date statStartTime;
    //统计数据,结束时间
    private Date statEndTime;
    //状态 0:初始 1：计划(进入执行阶段) 2：重置 3:完成
    private Integer status;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;

}
