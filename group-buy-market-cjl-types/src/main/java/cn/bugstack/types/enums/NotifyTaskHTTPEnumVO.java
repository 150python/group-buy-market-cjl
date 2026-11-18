package cn.bugstack.types.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 * @description http调用返回状态
 * @create 2026/11/17 11:19
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum NotifyTaskHTTPEnumVO {
    SUCCESS("success", "成功"),
    ERROR("error", "失败"),
    NULL(null, "空执行"),
    ;

    private String code;
    private String info;
}
