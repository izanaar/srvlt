package com.izanaar.practice.srvlt;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Set;


public class MyContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        servletContext.addServlet("initialized", new InitializableServlet());
        System.out.println("\tINITIALIZE!");
    }
}
