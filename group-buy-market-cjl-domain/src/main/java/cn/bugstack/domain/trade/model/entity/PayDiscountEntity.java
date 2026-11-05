package cn.bugstack.domain.trade.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Administrator
 * @description 优惠实体
 * @create 2026/11/5 20:02
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class PayDiscountEntity {
    private  String source;

    private String channel;

    private String goodsId;

    private String goodsName;

    private BigDecimal originalPrice;

    private BigDecimal deductionPrice;

    private String outTradeNo;


}
