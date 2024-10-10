package com.example.demo.datetime;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class TimezoneApplication {
	private static final Random RANDOM = new SecureRandom();
	private static final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
	private static final String SECRET_KEY = "YmljLnRlY2g6MjAyMw==";
	public static void main(String[] args) throws Exception {
		SpringApplication.run(TimezoneApplication.class, args);

		LocalDateTime localDateTime = LocalDateTime.now(ZoneId.systemDefault());
		System.out.println(localDateTime);

		LocalDateTime localDateTime1 = LocalDateTime.now(ZoneId.of("Asia/Ho_Chi_Minh"));
		System.out.println(localDateTime1);

		LocalDateTime localDateTime2 = LocalDateTime.now(ZoneId.of("Asia/Phnom_Penh"));
		System.out.println(localDateTime2);
	}

}
