package cn.bugstack.domain.trade.service;


import cn.bugstack.domain.trade.model.entity.TradePaySettlementEntity;
import cn.bugstack.domain.trade.model.entity.TradePaySuccessEntity;

import java.util.Map;

/**
 * @author Administrator
 * @description
 * @create 2026/11/9 20:18
 */
public interface ITradeSettlementOrderService {
    TradePaySettlementEntity settlementMarketPayOrder(TradePaySuccessEntity  tradePaySuccessEntity) throws Exception;

    Map<String, Integer> execSettlementNotifyJob() throws Exception;
    Map<String, Integer> execSettlementNotifyJob(String teamId) throws Exception;


}
