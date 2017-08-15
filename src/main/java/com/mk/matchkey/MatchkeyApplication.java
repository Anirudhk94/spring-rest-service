package com.mk.matchkey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MatchkeyApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MatchkeyApplication.class, args);
	}
//  INSERT INTO `match_key` (`id`, `description`, `mk_id`, `name`, `validity`) VALUES
//	(1, 'Test description 1', 1, 'Test1 + Dummy1 + Sample1', '17-10-1994'),
//	(2, 'Test description 2', 2, 'Test2 + Dummy2 + Sample2', '18-10-1994');
}
