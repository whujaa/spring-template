package com.github.whujay.spring.template.mapper;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.springframework.beans.factory.annotation.Value;

import java.nio.file.Paths;
import java.util.Collections;

public class AutoGenerator {
    private static final String url="jdbc:mysql://localhost:3306/bit_quant?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String username="bit-quant";
    private static final String password="123456";


    public static void main(String[] args) {
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> builder
                        .author("jieli")
                        .outputDir(Paths.get(System.getProperty("user.dir")) + "/src/main/java")
                        .commentDate("yyyy-MM-dd")
                )
                .packageConfig(builder -> builder
                        .parent("com.github.whujay.spring.template")
                        .entity("mapper.entity")
                        .mapper("mapper")
                        .service("service")
                        .serviceImpl("service.impl")
                        // 设置 Mapper XML 文件生成路径
                        .pathInfo(Collections.singletonMap(OutputFile.xml, Paths.get(System.getProperty("user.dir"))  + "/src/main/resources/mapper"))
                )
                .strategyConfig(builder -> {
                    builder.addInclude("admin_user") // 设置需要生成的表名
                            .entityBuilder()
                            .enableLombok() // 启用 Lombok
                            .enableTableFieldAnnotation() // 启用字段注解
                            .controllerBuilder()
                            .enableRestStyle(); // 启用 REST 风格
                })
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();


    }
}
