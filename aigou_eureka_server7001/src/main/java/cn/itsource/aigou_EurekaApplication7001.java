package cn.itsource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //eureka注册中心的服务端
public class aigou_EurekaApplication7001 {

    public static void main(String[] args) {
        SpringApplication.run(aigou_EurekaApplication7001.class);
    }
}
