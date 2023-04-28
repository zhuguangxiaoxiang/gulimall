package com.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

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
 * 	2、逻辑删除
 * 		1)、配置全局的逻辑删除规则 (logic-delete-field: flag 全局逻辑删除的实体字段名(需要Mybatis-Plus版本高于 3.3.0,配置后可以忽略不配置步骤2))
 * 		2)、实体类字段上加上@TableLogic注解
 */
@EnableDiscoveryClient
@MapperScan("com.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallProductApplication.class, args);
	}

}
