package com.alibou.videocall;

import com.alibou.videocall.user.User;
import com.alibou.videocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	) {
		return args -> {
			service.register(User.builder()
							.username("Hung")
							.email("hung@gmail.com")
							.password("1")
					.build());

			service.register(User.builder()
					.username("Nam")
					.email("nam@gmail.com")
					.password("1")
					.build());

			service.register(User.builder()
					.username("Admin")
					.email("admin@gmail.com")
					.password("1")
					.build());
		};
	}

}
