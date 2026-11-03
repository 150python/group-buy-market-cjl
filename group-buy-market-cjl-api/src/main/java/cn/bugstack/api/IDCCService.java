package cn.bugstack.api;

import cn.bugstack.api.response.Response;

/**
 * @author Administrator
 * @description
 * @create 2026/11/3 16:47
 */
public interface IDCCService {
    Response<Boolean> updateConfig(String key, String value);

}
