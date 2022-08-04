package com.parkwell;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.parkwell.service.FileStorageService;

@SpringBootApplication
public class MultipleFileLoaderApplication implements CommandLineRunner {

	@Resource
	FileStorageService storageService;
	public static void main(String[] args) {
		SpringApplication.run(MultipleFileLoaderApplication.class, args);
	}

	  @Override
	  public void run(String... arg) throws Exception {
	    storageService.deleteAll();
	    storageService.init();
	  }

}
