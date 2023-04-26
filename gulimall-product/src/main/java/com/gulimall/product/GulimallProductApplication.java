package com.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、整合Mybatis-Plus
 * 		1)、导入依赖
 * 		<dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.2.0</version>
 *      </dependency>
 *      2)、配置
 *      	1、配置数据源：
 *      		1)、导入数据库驱动。
 *      		2)、在application.yml中配置数据源中相关信息
 *      	2、配置Mybatis-Plus：
 *      		1)、使用@MapperScan
 *      		2)、告诉Mybatis-Plus,SQL映射文件位置
 */
@MapperScan("com.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallProductApplication.class, args);
	}

}
