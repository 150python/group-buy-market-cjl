package cn.bugstack.domain.activity.model.valobj;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Administrator
 * @description
 * @create 2026/10/20 16:57
 */
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SkuVO {
    //商品id
    private String goodsId;
    //商品名称
    private String goodsName;
    //原始价格
    private BigDecimal originalPrice;

}
