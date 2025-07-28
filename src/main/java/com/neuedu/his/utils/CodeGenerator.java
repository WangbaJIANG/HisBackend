package com.neuedu.his.utils;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;

public class CodeGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/his01", "root", "123456")
                .globalConfig(builder -> {
                    builder.author("wangba")
                            .outputDir(System.getProperty("user.dir") + "/src/main/java")
                            .disableOpenDir();
                })
                .packageConfig(builder -> {
                    builder.parent("com.example") // 修改为你的包名
                            .entity("pojo")
                            .mapper("mapper")
                            .service("service")
                            .controller("controller");
                })
                .strategyConfig(builder -> {
                    builder.addInclude("drug_info") // ⭐️ 指定只生成 drug_info 表
                            .entityBuilder().enableLombok(); // 使用 Lombok
                })
                .execute();
    }
}
