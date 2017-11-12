package com.springboot.web;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 如果要把此项目部署到外部tomcat 流程如下：
 * 1 需要添加一个继承SpringBootServletInitializer的类  指明SpringBootApplication类动的类 用于启动springboot
 * 2 pom.xml如下配置 (普通sprinboot启动下面依赖依旧适用  只不过需要使用SpringBootApplication类去启动)
 *  <dependency>
 <groupId>org.springframework.boot</groupId>
 <artifactId>spring-boot-starter-web</artifactId>
 </dependency>

 <dependency>
 <groupId>org.springframework.boot</groupId>
 <artifactId>spring-boot-starter-tomcat</artifactId>
 <scope>provided</scope>
 </dependency>

 <dependency>
 <groupId>org.apache.tomcat.embed</groupId>
 <artifactId>tomcat-embed-jasper</artifactId>
 </dependency>

 <dependency>
 <groupId>javax.servlet</groupId>
 <artifactId>javax.servlet-api</artifactId>
 <scope>provided</scope>
 </dependency>
 <dependency>
 <groupId>javax.servlet</groupId>
 <artifactId>jstl</artifactId>
 </dependency>

 3 pom的packing为war 替换原来的jar
 4 idea配置tomcat  把通过maven的pack达成的war包 部署到新建的tomcat中（外包引入的tomcat）
 */
public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootWebApplicationContext.class);
    }
}
