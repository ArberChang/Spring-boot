package org.spring.springboot.service.impl;

import org.spring.springboot.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
@Service
public class RedisServiceImpl implements RedisService {

	@Autowired
	private StringRedisTemplate template;
	
	@Override
	public void setRedis(String key, String value) throws Exception{
		
		ValueOperations<String, String> ops = this.template.opsForValue();
		
		if (!this.template.hasKey(key)) {
			ops.set(key, value);
		}
		System.out.println("Found key " + key + ", value=" + ops.get(key));
	}

	
	@Override
	public String getRedis(String key) throws Exception{
		
		ValueOperations<String, String> ops = this.template.opsForValue();
		return ops.get(key);
	}

}
