package org.spring.springboot.service;

public interface RedisService {

	/**
	 * 
	 * <p>Description:redis插入一条数据 </p>
	 * <p>Company:旺旺集团 </p>
	 * @author 00301082
	 * @date 2017年12月8日 下午1:38:09
	 * @param key
	 * @param value
	 * @throws Exception
	 */
	public void setRedis(String key, String value) throws Exception;

	/**
	 * 
	 * <p>Description:获取单个redis值 </p>
	 * <p>Company:旺旺集团 </p>
	 * @author 00301082
	 * @date 2017年12月8日 下午1:52:40
	 * @param key
	 * @return
	 * @throws Exception 
	 */
	public String getRedis(String key) throws Exception;

}
