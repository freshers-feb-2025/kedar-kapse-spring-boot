package com.thinkkk.Demo_Admin_Server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class DemoAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAdminServerApplication.class, args);
	}

}
