package cn.bugstack.domain.activity.model.valobj;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 * @description
 * @create 2026/10/31 17:21
 */
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SCSkuActivityVO {
    private String source;
    private String channel;
    private Long activityId;
    private String goodsId;
}
