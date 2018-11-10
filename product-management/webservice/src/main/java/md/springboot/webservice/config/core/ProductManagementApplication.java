package md.springboot.webservice.config.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by veladii on 20.10.2018
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {
        "md.springboot.webservice",
        "md.springboot.business",
        "md.springboot.repository"})
@EntityScan({"md.springboot.repository"})
@EnableJpaRepositories({"md.springboot.repository"})
public class ProductManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductManagementApplication.class, args);
    }
}
