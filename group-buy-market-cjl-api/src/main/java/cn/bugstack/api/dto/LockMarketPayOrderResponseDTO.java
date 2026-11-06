package cn.bugstack.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Administrator
 * @description
 * @create 2026/11/6 16:58
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LockMarketPayOrderResponseDTO {
    //预购订单id
    private String orderId;
    //折扣金额
    private BigDecimal deductionPrice;
    //交易订单状态
    private Integer tradeOrderStatus;

}
