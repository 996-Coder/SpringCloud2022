package util;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class MybatisGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://127.0.0.1:3306/springcloud2022?userUnicode=true&useSSL=false&characterEncoding=utf8&serverTimezone=Asia/Shanghai", "michael", "Password1")
                .globalConfig(builder -> {
                    builder.author("michael") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D:\\IdeaProjects\\SpringCloud2022\\common-service\\src\\main\\resources"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.example.mapper") // 设置父包名
                            .moduleName("SpringCloud2022") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapper, "D:\\IdeaProjects\\SpringCloud2022\\common-service\\src\\main\\resources")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("t_user") // 设置需要生成的表名
                            .addTablePrefix("t_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }
}
