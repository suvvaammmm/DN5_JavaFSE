package com.cognizant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExercise1 {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingExercise1.class);

    public static void main(String[] args) {

        logger.info("Application Started");

        logger.warn("This is a warning message");

        logger.error("This is an error message");

        logger.info("Application Finished");
    }
}