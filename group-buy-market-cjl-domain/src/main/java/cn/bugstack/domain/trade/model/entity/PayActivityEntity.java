package cn.bugstack.domain.trade.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Administrator
 * @description 支付实体
 * @create 2026/11/5 19:58
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PayActivityEntity {
    private String teamId;

    private Long activityId;

    private String activityName;

    private Date startTime;

    private Date endTime;

    private Integer targetCount;
}
