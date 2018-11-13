package md.springboot.webservice.config.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by veladii on 20.10.2018
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"md.springboot.webservice"})
public class GeoLocationManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeoLocationManagementApplication.class, args);
    }
}
