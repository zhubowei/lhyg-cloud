package com.lhyg.job;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import com.lhyg.common.security.annotation.EnableCustomConfig;
import com.lhyg.common.security.annotation.EnableRyFeignClients;
import com.lhyg.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 定时任务
 * 
 * @author lhyg
 */
@EnableCustomConfig
@EnableCustomSwagger2   
@EnableRyFeignClients
@SpringCloudApplication
public class LhygJobApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(LhygJobApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  定时任务模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .____     ___ ___ _____.___. ________\n" +
                "|    |   /   |   \\\\__  |   |/  _____/\n" +
                "|    |  /    ~    \\/   |   /   \\  ___\n" +
                "|    |__\\    Y    /\\____   \\    \\_\\  \\\n" +
                "|_______ \\___|_  / / ______|\\______  /\n" +
                "        \\/     \\/  \\/              \\/");
    }
}
