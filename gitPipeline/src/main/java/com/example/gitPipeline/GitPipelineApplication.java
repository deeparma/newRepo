package com.example.gitPipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class GitPipelineApplication {

	@GetMapping("/home")
	public String Hello()
	{
		return "Hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitPipelineApplication.class, args);
	}

}
