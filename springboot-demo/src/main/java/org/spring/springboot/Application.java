package org.spring.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * <p>Title:start springboot application</p>
 * <p>Description:</p>
 * <p>Company:旺旺集团</p>
 * @author 00301082
 * @date 2017年12月13日 上午10:47:46
 */
//以下三个注解等同 @SpringBootApplication
@Configuration //标明该类使用Spring基于Java的配置
@ComponentScan //启用组件扫描,这样你写的Web控制器类和其他组件才能被 自动发现并注册为Spring应用程序上下文里的Bean
@EnableAutoConfiguration //开启了Spring Boot自动配置

// Spring Boot 应用的标识
//@SpringBootApplication

// mapper 接口类扫描包配置
@MapperScan("org.spring.springboot.dao")
public class Application {

    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(Application.class,args);
    }
}
