package cn.bugstack.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Administrator
 * @description
 * @create 2026/11/17 14:46
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NotifyRequestDTO {

    private String teamId;

    private List<String> outTradeNoList;

}
