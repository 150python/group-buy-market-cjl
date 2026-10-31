package cn.bugstack.infrastructure.dao.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Administrator
 * @description 关联活动配置表
 * @create 2026/10/31 16:50
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SCSkuActivity {
    private Long id;

    private String source;

    private String channel;

    private Long activityId;

    private String goodsId;

    private Date createTime;

    private Date updateTime;

}
