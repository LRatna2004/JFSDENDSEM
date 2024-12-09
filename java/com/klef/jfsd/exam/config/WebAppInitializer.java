package com.klef.jfsd.exam.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {}; // No root config class, you can add if needed
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { AppConfig.class }; // Java-based config class
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" }; // Maps the DispatcherServlet to the root context
    }
}
