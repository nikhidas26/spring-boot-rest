package com.nikhil.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Nikhil Das Nomula on 12/24/17.
 *
 * The annotation tells spring boot that it is starting point of our application.
 */
@SpringBootApplication
public class CourseApiApp {

    public static void main(String[] args) {

        // This sets up the default configuration, starts spring application context
        // Performs class path scan and starts tomcat server
        SpringApplication.run(CourseApiApp.class, args);
    }
}
