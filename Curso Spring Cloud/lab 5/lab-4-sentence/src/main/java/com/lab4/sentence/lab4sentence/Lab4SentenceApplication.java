package com.lab4.sentence.lab4sentence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab4SentenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab4SentenceApplication.class, args);


	}

	@Bean
	@LoadBalanced //automaticamente vai fazer o load balance com o ribbon
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
