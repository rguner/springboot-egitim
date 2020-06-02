package com.turkcell.akademi.spring.training.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	RedisTemplate redisTemplate;
	
	@Autowired
	ApplicationContext applicationContext;
	
	@Bean
	public RedisTemplate<String, Student> studentRedisTemplate(RedisConnectionFactory connectionFactory) {
		RedisTemplate<String, Student> result = new RedisTemplate<>();
		
		//result.setSe
		result.setConnectionFactory(connectionFactory);
		return result;
	}
	
	@Autowired
	RedisTemplate<String, Student> myStudentRedisTemplate;
	@Override
	public void run(String... arg0) throws Exception {
		applicationContext.getBeansOfType(RedisTemplate.class)
			.keySet().forEach(k -> System.out.println(k));
		
		HashOperations<String, String, Student> opsForHash = myStudentRedisTemplate.opsForHash();
		
		//Student student = new Student(1l, "foo");
		//opsForHash.put("STUDENTS", "ID_1", student);
		
		Student student = opsForHash.get("STUDENTS", "ID_1");
		
		System.out.println(student);
		
		if (student == null) {
			student = new Student(1l, "foo");
			opsForHash.put("STUDENTS", "ID_1", student);
		}
		
		System.exit(0);
	}
}
