package by.epam.javatraining.khadanovich.maintask2.view;

import by.epam.javatraining.khadanovich.maintask2.controller.Runner;
import org.apache.log4j.Logger;


public class Printer {

    public static Logger logger = Logger.getLogger(Runner.class);

    public static void printResult(String msg, Object ob) {
        logger.info(msg + ob);
    }

    public static void print(String msg) {
        logger.info(msg);
    }

}

