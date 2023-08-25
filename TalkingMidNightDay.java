package com.example.midnightday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class TalkingMidNightDay {

	public static void main(String[] args) {
		SpringApplication.run(TalkingMidNightDay.class, args);
	}

}
