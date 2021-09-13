package com.stackroute.mongoDBRestService;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class MongoDbRestServiceApplication {

	//static Logger logger;
	public static void main(String[] args) {
		log.info("this is the info");
		log.warn("this is a warning");
		SpringApplication.run(MongoDbRestServiceApplication.class, args);
	}

}
