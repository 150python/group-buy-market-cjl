package cn.bugstack.domain.trade.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 * @description 用户实体
 * @create 2026/11/5 19:58
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    private String userId;
}
