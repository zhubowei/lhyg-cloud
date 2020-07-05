package com.lhyg.system;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import com.lhyg.common.security.annotation.EnableCustomConfig;
import com.lhyg.common.security.annotation.EnableRyFeignClients;
import com.lhyg.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 系统模块
 * 
 * @author lhyg
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringCloudApplication
public class LhygSystemApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(LhygSystemApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  系统模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .____     ___ ___ _____.___. ________\n" +
                "|    |   /   |   \\\\__  |   |/  _____/\n" +
                "|    |  /    ~    \\/   |   /   \\  ___\n" +
                "|    |__\\    Y    /\\____   \\    \\_\\  \\\n" +
                "|_______ \\___|_  / / ______|\\______  /\n" +
                "        \\/     \\/  \\/              \\/");
    }
}
