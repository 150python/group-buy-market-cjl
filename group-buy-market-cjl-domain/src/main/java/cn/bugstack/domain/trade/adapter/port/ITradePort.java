package cn.bugstack.domain.trade.adapter.port;

import cn.bugstack.domain.trade.model.entity.NotifyTaskEntity;

/**
 * @author Administrator
 * @description
 * @create 2026/11/17 16:03
 */
public interface ITradePort {

    String groupBuyNotify(NotifyTaskEntity notifyTaskEntity) throws Exception;

}
