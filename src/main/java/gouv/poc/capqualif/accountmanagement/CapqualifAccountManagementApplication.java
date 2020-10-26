package gouv.poc.capqualif.accountmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CapqualifAccountManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapqualifAccountManagementApplication.class, args);
	}

}
