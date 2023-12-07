package com.bdp.backendhr4bdp;

import com.bdp.backendhr4bdp.mapper.CityMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Backendhr4bdpApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Backendhr4bdpApplication.class, args);
	}

	private final CityMapper cityMapper;

	public Backendhr4bdpApplication(CityMapper cityMapper) {
		this.cityMapper = cityMapper;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("###TESTING RESULT: " + this.cityMapper.findByState("CA"));
	}
}
