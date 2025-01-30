package com.productapp.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.lang.annotation.Annotation;

@Component

public class BarFilter implements Filter , Order{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        System.out.println("init of bar");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter of bar");

        HttpServletRequest httpServletRequest=(HttpServletRequest) servletRequest;
        System.out.println(httpServletRequest.getRequestURI());
        System.out.println(httpServletRequest.getRemoteAddr());

       long start=System.currentTimeMillis();
            filterChain.doFilter(servletRequest, servletResponse);
       long end=System.currentTimeMillis();
        System.out.println("time taken to ex: "+ (end-start)+" ms");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
        System.out.println("destroy of bar");
    }

    @Override
    public int value() {
        return 2;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
