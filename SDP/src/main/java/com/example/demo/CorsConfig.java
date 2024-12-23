package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Allow cross-origin requests from your frontend URL
        registry.addMapping("/**")  // Apply CORS to all endpoints
                .allowedOrigins("http://localhost:3000","https://jfsdproject-zeta.vercel.app")  // Allow requests from localhost:3000
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Allowed HTTP methods
                .allowedHeaders("*")  // Allow all headers
                .allowCredentials(true);  // Allow credentials (like cookies or authorization headers)
    }
}
