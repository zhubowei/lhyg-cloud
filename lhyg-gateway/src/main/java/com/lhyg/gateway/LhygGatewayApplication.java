package com.lhyg.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 网关启动程序
 * 
 * @author lhyg
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class LhygGatewayApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(LhygGatewayApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  网关启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                ".____     ___ ___ _____.___. ________\n" +
                "|    |   /   |   \\\\__  |   |/  _____/\n" +
                "|    |  /    ~    \\/   |   /   \\  ___\n" +
                "|    |__\\    Y    /\\____   \\    \\_\\  \\\n" +
                "|_______ \\___|_  / / ______|\\______  /\n" +
                "        \\/     \\/  \\/              \\/");
    }
}