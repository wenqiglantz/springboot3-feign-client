package com.github.wenqiglantz.service.demo;

import com.github.wenqiglantz.service.demo.democlient.DemoClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(clients = {DemoClient.class})
//@EnableReactiveFeignClients(clients = {DemoClient.class})
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
