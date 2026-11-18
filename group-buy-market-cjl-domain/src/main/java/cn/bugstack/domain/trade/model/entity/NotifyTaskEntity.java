package cn.bugstack.domain.trade.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 * @description
 * @create 2026/11/17 16:04
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NotifyTaskEntity {

    private String teamId;

    private String notifyUrl;

    private Integer notifyCount;

    private String parameterJson;


    public String lockKey(){
        return "notify_job_lock_key_" + this.teamId;
    }

}
