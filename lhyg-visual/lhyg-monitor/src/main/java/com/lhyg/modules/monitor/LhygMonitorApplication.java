package com.lhyg.modules.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 监控中心
 * 
 * @author lhyg
 */
@EnableAdminServer
@SpringCloudApplication
public class LhygMonitorApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(LhygMonitorApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  监控中心启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .____     ___ ___ _____.___. ________\n" +
                "|    |   /   |   \\\\__  |   |/  _____/\n" +
                "|    |  /    ~    \\/   |   /   \\  ___\n" +
                "|    |__\\    Y    /\\____   \\    \\_\\  \\\n" +
                "|_______ \\___|_  / / ______|\\______  /\n" +
                "        \\/     \\/  \\/              \\/");
    }
}
