package com.example;

import java.util.Arrays;
import java.util.stream.Collectors;

import javax.inject.Named;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class CommandLineRunnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommandLineRunnerApplication.class, args);
	}
}

class DefaultRunner implements	CommandLineRunner {
	// CommandLineRunner의 run 메소드 구현
	// args는 메인 메소드의 아규먼트를 받아들인다.
	@Override
	public void run(String... args) throws Exception {
		// stream; java8
		// joining
		System.out.println(Arrays.asList(args).stream().collect(Collectors.joining(",", getClass().getSimpleName() + "[", "]")));
	}
	
}

@Named
@Order(2)
class Runner1 extends DefaultRunner {
	
}

@Named
@Order(1)
class Runner2 extends DefaultRunner {
	
}

@Named
@Order(3)
class Runner3 extends DefaultRunner {
	
}