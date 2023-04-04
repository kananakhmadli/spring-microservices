package com.company.akh.backend.config;

import com.company.akh.backend.filter.MyFilter3;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("unused")
@Configuration
public class FilterConfiguration {

    public FilterRegistrationBean<MyFilter3> registrationBean() {
        FilterRegistrationBean<MyFilter3> bean = new FilterRegistrationBean<>();
        bean.setFilter(new MyFilter3());
        bean.addUrlPatterns("/api/*");
        return bean;
    }

}