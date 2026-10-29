package cn.bugstack.domain.activity.service.discount.impl;

import cn.bugstack.domain.activity.model.valobj.GroupBuyActivityDiscountVO;
import cn.bugstack.domain.activity.service.discount.AbstractDiscountCalculateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author Administrator
 * @description 直减优惠策略
 * @create 2026/10/29 18:44
 */
@Slf4j
@Service("ZJ")
public class ZJCalculateService extends AbstractDiscountCalculateService {
    @Override
    protected BigDecimal doCalculate(BigDecimal originalPrice, GroupBuyActivityDiscountVO.GroupBuyDiscount groupBuyDiscount) {
        String marketExpr = groupBuyDiscount.getMarketExpr();
        BigDecimal deductionPrice = originalPrice.subtract(new BigDecimal(marketExpr));
        if(deductionPrice.compareTo(BigDecimal.ZERO) <= 0){
            return new BigDecimal("0.01");
        }
        return deductionPrice;
    }
}
