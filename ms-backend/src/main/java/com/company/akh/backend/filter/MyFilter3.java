package com.company.akh.backend.filter;

import com.company.akh.backend.config.ApplicationConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

@Slf4j
@Order(3)
@Component
@Profile(ApplicationConstants.SPRING_PROFILE_DEV)
public class MyFilter3 implements Filter {

    @Value("${api.message}")
    private String message;

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        log.info("Filter3 is called");
        log.warn(message);
        filterChain.doFilter(servletRequest, servletResponse);
    }

}