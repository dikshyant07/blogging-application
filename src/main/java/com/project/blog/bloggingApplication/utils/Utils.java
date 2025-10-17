package com.project.blog.bloggingApplication.utils;

import com.project.blog.bloggingApplication.enums.Gender;
import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "utils")
@Data
@Getter
public class Utils {
    private Admin admin;
    private Manager manager;
    private Jwt jwt;

    @Data
    @Getter
    public static class Admin {
        private String name;
        private int age;
        private Gender gender;
        private String email;
        private String password;
    }

    @Data
    @Getter
    public static class Manager {
        private String name;
        private int age;
        private Gender gender;
        private String email;
        private String password;
    }

    @Data
    @Getter
    public static class Jwt {
        private int expiry;
        private String secret;
    }
}
