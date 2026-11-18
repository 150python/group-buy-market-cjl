package cn.bugstack.trigger.http;

import cn.bugstack.api.dto.NotifyRequestDTO;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author Administrator
 * @description
 * @create 2026/11/17 14:42
 */
@Slf4j
@RestController()
@CrossOrigin("*")
@RequestMapping("/api/v1/test/")
public class TestApiClientController {
@RequestMapping(value = "group_buy_notify", method = RequestMethod.POST)
    public String groupBuyNotify(@RequestBody NotifyRequestDTO notifyRequestDTO){
        log.info("模拟测试第三方服务接受拼团回调 {}", JSON.toJSONString(notifyRequestDTO));
        return "success";
    }
}
