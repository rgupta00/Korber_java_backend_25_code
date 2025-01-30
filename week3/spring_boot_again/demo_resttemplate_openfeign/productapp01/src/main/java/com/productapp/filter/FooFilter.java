package com.productapp.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.lang.annotation.Annotation;


public class FooFilter implements Filter , Order{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        System.out.println("init foo filter");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter of foo");

        HttpServletRequest httpServletRequest=(HttpServletRequest) servletRequest;
        System.out.println(httpServletRequest.getRequestURI());
        System.out.println(httpServletRequest.getRemoteAddr());
        boolean auth=true;
        if(auth) {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
        System.out.println("destroy of foo");
    }

    @Override
    public int value() {
        return 1;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
