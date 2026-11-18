package cn.bugstack.config;

import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 * @description okhttp客户端
 * @create 2026/11/17 15:29
 */
@Configuration
public class OKHttpClientConfig {

    @Bean
    public OkHttpClient okHttpClient(){
        return new OkHttpClient();
    }
}
