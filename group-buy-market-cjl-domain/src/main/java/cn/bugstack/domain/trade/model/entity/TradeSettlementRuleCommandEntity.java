package cn.bugstack.domain.trade.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Administrator
 * @description
 * @create 2026/11/14 17:17
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TradeSettlementRuleCommandEntity {

    private String source;

    private String channel;

    private String userId;

    private String outTradeNo;

    private Date outTradeTime;

}
