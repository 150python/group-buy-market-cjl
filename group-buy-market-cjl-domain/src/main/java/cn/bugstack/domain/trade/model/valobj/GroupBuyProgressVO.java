package cn.bugstack.domain.trade.model.valobj;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 * @description 查询拼团进度
 * @create 2026/11/5 20:27
 */
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GroupBuyProgressVO
{
    private Integer targetCount;

    private Integer completeCount;

    private Integer lockCount;

}
