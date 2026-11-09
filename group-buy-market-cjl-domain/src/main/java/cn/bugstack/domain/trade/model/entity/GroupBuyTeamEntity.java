package cn.bugstack.domain.trade.model.entity;

import cn.bugstack.types.enums.GroupBuyOrderEnumVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 * @description 拼团的组队信息
 * @create 2026/11/9 21:02
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GroupBuyTeamEntity {
    private String teamId;

    private Long activityId;

    private Integer targetCount;

    private Integer completeCount;

    private Integer lockCount;

    private GroupBuyOrderEnumVO status;
}
