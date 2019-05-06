package cn.itsource.aigou;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //eureka的客户端
public class PlatServiceProvider8001 {

    public static void main(String[] args) {
        SpringApplication.run(PlatServiceProvider8001.class);
    }
}
