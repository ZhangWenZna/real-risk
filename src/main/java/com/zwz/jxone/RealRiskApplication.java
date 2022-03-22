package com.zwz.jxone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.zwz.jxone.dao.mapper")
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class RealRiskApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealRiskApplication.class, args);
	}

}
