package com.baseproject.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfig {

	@Value("${redis.host}")
	private String redisHost;

	@Value("${redis.port}")
	private int redisPort;

	@Bean
	public LettuceConnectionFactory redisConnectionFactory() {

		// create Standalone Connection to Redis server
		return new LettuceConnectionFactory(new RedisStandaloneConfiguration(redisHost, redisPort));
	}

	@Bean
	@Primary
	public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {

		// create a tempalbe which operate with redis server by redis connection factory
		RedisTemplate<Object, Object> template = new RedisTemplate<>();
		template.setConnectionFactory(redisConnectionFactory);
		return template;
	}
}
