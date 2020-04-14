package com.baseproject.business.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baseproject.business.healthy.entity.MockEntity;

@RestController
public class UserController {

	@Autowired
	RedisTemplate<String, String> redisTemplate;

	@GetMapping("/testSetRedis")
	public ResponseEntity<Object> setRedis() {

		redisTemplate.opsForValue().set("loda", "hello world");
		return new ResponseEntity<Object>(new MockEntity(1, "tienph"), HttpStatus.OK);
	}

	@GetMapping("/testGetRedis")
	public ResponseEntity<Object> getRedis() {
		String value = redisTemplate.opsForValue().get("loda");
		return new ResponseEntity<Object>(new MockEntity(1, value), HttpStatus.OK);
	}
}
