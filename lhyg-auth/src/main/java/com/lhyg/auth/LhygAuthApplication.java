package com.lhyg.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import com.lhyg.common.security.annotation.EnableRyFeignClients;

/**
 * 认证授权中心
 * 
 * @author lhyg
 */
@EnableRyFeignClients
@SpringCloudApplication
public class LhygAuthApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(LhygAuthApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  认证授权中心启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .____     ___ ___ _____.___. ________\n" +
                "|    |   /   |   \\\\__  |   |/  _____/\n" +
                "|    |  /    ~    \\/   |   /   \\  ___\n" +
                "|    |__\\    Y    /\\____   \\    \\_\\  \\\n" +
                "|_______ \\___|_  / / ______|\\______  /\n" +
                "        \\/     \\/  \\/              \\/");
    }
}
