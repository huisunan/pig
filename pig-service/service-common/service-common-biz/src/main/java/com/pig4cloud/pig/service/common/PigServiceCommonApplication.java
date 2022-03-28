package com.pig4cloud.pig.service.common;

import com.pig4cloud.pig.common.feign.annotation.EnablePigFeignClients;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnablePigFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class PigServiceCommonApplication {
	public static void main(String[] args) {

	}
}
