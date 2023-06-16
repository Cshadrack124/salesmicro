package com.codepride.salesmicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ={"src/main/java/com/codepride/salesmicro"} )
public class SalesmicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesmicroApplication.class, args);
	}

}
