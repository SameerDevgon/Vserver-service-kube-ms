package all;


import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
//@EnableSwagger2 
//@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class VserverService {


	public static void main(String[] args) {
		SpringApplication.run(VserverService.class, args);
		
		//repo.saveAndFlush(e);
		
	}

}
