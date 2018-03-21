package org.spring.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * <p>Title:this controller just test static </p>
 * <p>Description:</p>
 * <p>Company:旺旺集团</p>
 * @author 00301082
 * @date 2017年12月13日 上午10:32:29
 */
@Controller
public class StaticController {

	/**
	 * 
	 * <p>Description:return a modelandview </p>
	 * <p>Company:旺旺集团 </p>
	 * @author 00301082
	 * @date 2017年12月13日 上午10:32:48
	 * @return
	 */
    @RequestMapping(value = "view" ,method = RequestMethod.GET)
    public ModelAndView page(){
    	
    	System.out.println("--------------------test");
    	
    	ModelAndView mv = new ModelAndView();
    	
    	mv.setViewName("index");
    	
    	
        return mv;
    }
    
    /**
     * 
     * <p>Description:test return string </p>
     * <p>Company:旺旺集团 </p>
     * @author 00301082
     * @date 2017年12月13日 上午10:33:05
     * @return
     */
    @RequestMapping("/")
    String index(){
        return "index";
    }
}
