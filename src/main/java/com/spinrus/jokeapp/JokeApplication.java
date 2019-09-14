package com.spinrus.jokeapp;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JokeApplication {

	@Bean
	ChuckNorrisQuotes chuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}

	public static void main(String[] args) {
		SpringApplication.run(JokeApplication.class, args);
	}

}
