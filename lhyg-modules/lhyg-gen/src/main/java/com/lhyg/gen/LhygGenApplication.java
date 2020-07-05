package com.lhyg.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import com.lhyg.common.security.annotation.EnableCustomConfig;
import com.lhyg.common.security.annotation.EnableRyFeignClients;
import com.lhyg.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 代码生成
 * 
 * @author lhyg
 */
@EnableCustomConfig
@EnableCustomSwagger2   
@EnableRyFeignClients
@SpringCloudApplication
public class LhygGenApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(LhygGenApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  代码生成模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .____     ___ ___ _____.___. ________\n" +
                "|    |   /   |   \\\\__  |   |/  _____/\n" +
                "|    |  /    ~    \\/   |   /   \\  ___\n" +
                "|    |__\\    Y    /\\____   \\    \\_\\  \\\n" +
                "|_______ \\___|_  / / ______|\\______  /\n" +
                "        \\/     \\/  \\/              \\/");
    }
}
