package md.springboot.webservice.config.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by veladii on 20.10.2018
 */
@SpringBootApplication(scanBasePackages = {"md.springboot.webservice"})
public class ProductManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductManagementApplication.class, args);
    }
}
