package cn.bugstack.domain.trade.service;


import cn.bugstack.domain.trade.model.entity.TradePaySettlementEntity;
import cn.bugstack.domain.trade.model.entity.TradePaySuccessEntity;

/**
 * @author Administrator
 * @description
 * @create 2026/11/9 20:18
 */
public interface ITradeSettlementOrderService {
    TradePaySettlementEntity settlementMarketPayOrder(TradePaySuccessEntity  tradePaySuccessEntity);
}
