package md.springboot.webservice.config.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by veladii on 21.10.2018
 */
@SpringBootApplication(scanBasePackages = {"md.springboot.webservice"})
public class TrackingManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrackingManagementApplication.class, args);
    }
}
