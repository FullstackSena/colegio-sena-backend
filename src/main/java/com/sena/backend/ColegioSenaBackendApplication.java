package com.sena.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(scanBasePackages={"com.sena.backend"})
public class ColegioSenaBackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(ColegioSenaBackendApplication.class, args);
	}

}
