package org.spring.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.spring.springboot.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * <p>Title:Redis controller </p>
 * <p>Description:</p>
 * <p>Company:旺旺集团</p>
 * @author 00301082
 * @date 2017年12月13日 上午10:35:25
 */
@RestController
@RequestMapping(value="redis")
public class RedisController {

	
	@Autowired
	private RedisService redisService;
	
	/**
	 * 
	 * <p>Description:insert redis </p>
	 * <p>Company:want-want </p>
	 * @author 00301082
	 * @date 2017年12月13日 上午10:47:09
	 * @param key
	 * @param value
	 * @return
	 */
	@RequestMapping(method=RequestMethod.PUT)
	public Map<String, Object> setRedis(String key, String value){
		
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			
			redisService.setRedis( key, value);
			map.put("status", 200);
			map.put("data", "");
		} catch (Exception e) {
			
			map.put("status", 500);
			map.put("data", "");
			e.printStackTrace();
		}
		
		return map;
	}
	
	/**
	 * 
	 * <p>Description:get redis </p>
	 * <p>Company:want-want </p>
	 * @author 00301082
	 * @date 2017年12月13日 上午10:47:25
	 * @param key
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET)
	public Map<String, Object> getRedis(String key){
		
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			
			String value = redisService.getRedis(key);
			map.put("status", 200);
			map.put("data", value);
		} catch (Exception e) {
			
			map.put("status", 500);
			map.put("data", "");
			e.printStackTrace();
		}
		
		return map;
	}
	
}
