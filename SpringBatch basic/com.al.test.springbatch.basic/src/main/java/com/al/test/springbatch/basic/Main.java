package com.al.test.springbatch.basic;

import org.springframework.boot.SpringApplication;

import com.al.test.springbatch.basic.config.BatchConfiguration;

public class Main {
	public static void main(String[] args) {
		System.exit(SpringApplication.exit(SpringApplication.run(BatchConfiguration.class, args)));
	}
}
