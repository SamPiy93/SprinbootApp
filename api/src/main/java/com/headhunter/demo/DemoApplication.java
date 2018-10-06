package com.headhunter.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	@Autowired
	JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Value("${custom.sample}")
	private String sampleValue;
	@Override
	public void run(String... args) throws Exception {

		log.info("creating tables => " + sampleValue);
		String createHeadHunterTable = "create table headhunter(" +
				"id serial primary key," +
				"name varchar(100)," +
				"description varchar(200)" +
				")";
//		jdbcTemplate.execute("DROP TABLE headhunter");
//		jdbcTemplate.execute(createHeadHunterTable);

		log.info("tables created");
	}
}
