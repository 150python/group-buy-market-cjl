package cn.bugstack.infrastructure.dao.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Administrator
 * @description
 * @create 2026/11/9 19:57
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NotifyTask {
    private Long id;

    private Long activityId;

    private String teamId;
//回调接口
    private String notifyUrl;
//回调次数
    private Integer notifyCount;
//回调状态 0 初始 1 完成 2重试 3失败
    private Integer notifyStatus;
//参数对象
    private String parameterJson;

    private Date createTime;

    private Date updateTime;

}
