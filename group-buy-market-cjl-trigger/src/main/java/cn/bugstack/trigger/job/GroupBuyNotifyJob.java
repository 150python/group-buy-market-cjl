package cn.bugstack.trigger.job;

import cn.bugstack.domain.trade.service.ITradeSettlementOrderService;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author Administrator
 * @description 回调任务
 * @create 2026/11/18 14:57
 */
@Slf4j
@Service
public class GroupBuyNotifyJob {
    @Resource
    private ITradeSettlementOrderService  tradeSettlementOrderService;
    @Scheduled(cron = "0/15 * * * * ?")
    public void exec(){
        try {
            Map<String, Integer> result = tradeSettlementOrderService.execSettlementNotifyJob();
            log.info("定时任务， 回调通知拼团完结任务 result:{}", JSON.toJSONString(result));
        }catch (Exception e){
            log.error("定时任务，回调通知拼团完结任务失败", e);

        }
    }

}
