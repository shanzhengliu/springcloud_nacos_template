package nacosConfig;
import nacosConfig.controller.ConfigController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfig {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfig.class, args);
    }
}




