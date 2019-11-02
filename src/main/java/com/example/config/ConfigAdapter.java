package com.example.config;

import com.example.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *   新华保险
 *   待上线域名newchinalife.com
 *   http://39.103.177.30/  admin:newchinalife
 *   zhanglong@newchinalife.com
 **/
@Configuration
public class ConfigAdapter implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/*").excludePathPatterns("materils_v2.0/index.html");
    }
}
