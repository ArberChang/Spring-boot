package org.spring.springboot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * <p>Title:restful style controller </p>
 * <p>Description:</p>
 * <p>Company:旺旺集团</p>
 * @author 00301082
 * @date 2017年12月13日 上午10:33:34
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.GET)
    public City findOneCity(@PathVariable("id") Long id) {
        return cityService.findCityById(id);
    }

    
/*************************************************this is demo begin*******************************************************************************************************/
    /**
     * 
     * <p>Description:test query data from mysql </p>
     * <p>Company:旺旺集团 </p>
     * @author 00301082
     * @date 2017年11月28日 下午5:03:27
     * @return
     */
    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public Map<String, Object> findAllCity() {
    	
    	Map<String, Object> map = new HashMap<String, Object>();
    	
    	try {
    		List<City> findAllCity = cityService.findAllCity();
    		map.put("status", true);
    		map.put("data", findAllCity);
    		
		} catch (Exception e) {
			map.put("status", false);
			map.put("data", "");
			e.printStackTrace();
		}
    	return map;
    }
    
    /**
     * 
     * <p>Description:test map return map </p>
     * <p>Company:旺旺集团 </p>
     * @author 00301082
     * @date 2017年11月28日 下午5:03:27
     * @return
     */
    @RequestMapping(value = "map",method = RequestMethod.GET)
    public Map<String, Object> doGetMap() {
    	
    	Map<String, Object> map = new HashMap<String, Object>();
    	
    	try {
    		map.put("status", true);
    		map.put("data", "this is map result");
    		
    	} catch (Exception e) {
    		map.put("status", false);
    		map.put("data", "");
    		e.printStackTrace();
    	}
    	return map;
    }
    
    /**
     * 
     * <p>Description:test GET request</p>
     * <p>Company:旺旺集团 </p>
     * @author 00301082
     * @date 2017年11月28日 下午5:03:27
     * @return
     */
    @RequestMapping(value = "list",method = RequestMethod.GET)
    public List<String> doGetList() {
    	
    	List<String> list = new ArrayList<String>();
    	
    	try {
    		list.add("this is list result");
    		
    	} catch (Exception e) {
    		list.add("500");
    		e.printStackTrace();
    	}
    	return list;
    }
    
    /**
     * 
     * <p>Description:test pojo</p>
     * <p>Company:旺旺集团 </p>
     * @author 00301082
     * @date 2017年11月28日 下午5:03:27
     * @return
     */
    @RequestMapping(value = "pojo",method = RequestMethod.GET)
    public City doGetPojo() {
    	
    	City city = new City();
    	
    	try {
    		city.setCityName("Hong Kong");
    		city.setDescription("this is Hong kong,welcome man");
    		city.setId(1L);
    		city.setProvinceId(5L);
    		
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	return city;
    }
    
    
    /**
     * 
     * <p>Description:test map and pojo </p>
     * <p>Company:旺旺集团 </p>
     * @author 00301082
     * @date 2017年11月28日 下午5:03:27
     * @return
     */
    @RequestMapping(value = "map_pojo",method = RequestMethod.GET)
    public Map< String, Object> doGetMapPojo() {
    	
    	Map< String, Object> map = new HashMap< String, Object>();
    	
    	try {
    		City city = new City();
    		city.setCityName("Hong Kong");
    		city.setDescription("this is Hong kong,welcome man");
    		city.setId(1L);
    		city.setProvinceId(5L);
    		
    		map.put("data", city);
    		map.put("status", 200);
    		
    	} catch (Exception e) {
    		map.put("data", "");
    		map.put("status", 500);
    		e.printStackTrace();
    	}
    	return map;
    }
    
    
    
/*************************************************this is demo end*******************************************************************************************************/

    @RequestMapping(value = "/api/city", method = RequestMethod.POST)
    public void createCity(@RequestBody City city) {
        cityService.saveCity(city);
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.PUT)
    public void modifyCity(@RequestBody City city) {
        cityService.updateCity(city);
    }

    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.DELETE)
    public void modifyCity(@PathVariable("id") Long id) {
        cityService.deleteCity(id);
    }
}
