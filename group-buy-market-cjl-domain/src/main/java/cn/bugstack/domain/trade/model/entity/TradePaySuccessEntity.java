package cn.bugstack.domain.trade.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 * @description
 * @create 2026/11/9 20:32
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TradePaySuccessEntity {
    private String source;

    private String channel;

    private String userId;

    private String outTradeNo;
}
