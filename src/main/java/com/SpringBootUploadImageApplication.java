package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.service.FilesStorageService;

import jakarta.annotation.Resource;

@SpringBootApplication
public class SpringBootUploadImageApplication {

	@Resource
	FilesStorageService storageService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootUploadImageApplication.class, args);
	}

	public void run(String... arg) throws Exception {
//		storageService.deleteAll();
		storageService.init();
	}
}
