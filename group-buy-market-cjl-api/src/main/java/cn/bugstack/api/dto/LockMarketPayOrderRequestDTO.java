package cn.bugstack.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 * @description
 * @create 2026/11/6 16:58
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LockMarketPayOrderRequestDTO {

    private String userId;

    private String teamId;

    private Long activityId;

    private String goodsId;

    private String source;

    private String channel;

    private String outTradeNo;
}
