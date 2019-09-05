package com.example.myproject.config;

/**
 * @Description TODO
 * @Author lijin
 * @Date 2019/9/4 11:12
 * @Version 1.0
 **/

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;
/**
 * @Author：JCccc
 * @Description：
 * @Date： created in 15:56 2019/5/13
 */
@Configuration
public class WebSocketConfig {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

    @Bean
    public MyEndpointConfigure newConfigure() {
        return new MyEndpointConfigure();
    }
}
