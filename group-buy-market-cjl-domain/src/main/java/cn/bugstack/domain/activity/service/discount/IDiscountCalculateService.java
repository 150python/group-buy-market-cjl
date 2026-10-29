package cn.bugstack.domain.activity.service.discount;

import cn.bugstack.domain.activity.model.valobj.GroupBuyActivityDiscountVO;

import java.math.BigDecimal;

/**
 * @author Administrator
 * @description 策略模式
 * @create 2026/10/29 16:36
 */
public interface IDiscountCalculateService {
    BigDecimal calculate(String userId, BigDecimal originalPrice, GroupBuyActivityDiscountVO.GroupBuyDiscount groupBuyDiscount);

}
