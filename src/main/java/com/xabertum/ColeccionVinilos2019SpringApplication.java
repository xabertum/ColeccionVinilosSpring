package com.xabertum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.xabertum.controller.ControladorViniloREST;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackageClasses=ControladorViniloREST.class)
public class ColeccionVinilos2019SpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColeccionVinilos2019SpringApplication.class, args);
	}

}
