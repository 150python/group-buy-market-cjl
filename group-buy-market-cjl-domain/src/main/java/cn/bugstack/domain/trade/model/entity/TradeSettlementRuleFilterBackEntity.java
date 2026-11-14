package cn.bugstack.domain.trade.model.entity;

import cn.bugstack.types.enums.GroupBuyOrderEnumVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Administrator
 * @description
 * @create 2026/11/14 17:18
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TradeSettlementRuleFilterBackEntity {
    private String teamId;
    private Long activityId;

    private Integer targetCount;

    private Integer completeCount;

    private Integer lockCount;

    private GroupBuyOrderEnumVO status;

    private Date validStartTime;

    private Date validEndTime;
}
