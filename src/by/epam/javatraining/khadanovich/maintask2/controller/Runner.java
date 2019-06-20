package by.epam.javatraining.khadanovich.maintask2.controller;
import by.epam.javatraining.khadanovich.maintask2.model.entity.Fridge;
import by.epam.javatraining.khadanovich.maintask2.model.entity.Salad;
import by.epam.javatraining.khadanovich.maintask2.model.logic.Chef;
import by.epam.javatraining.khadanovich.maintask2.model.logic.SaladAssistant;
import by.epam.javatraining.khadanovich.maintask2.model.logic.Storekeeper;

import by.epam.javatraining.khadanovich.maintask2.view.Printer;
import org.apache.log4j.Logger;
/**
 * Runner class
 *
 * @author Tatsiana Khadanovich
 * @version 1.0
 * @createdate 18/06/19
 *
 */

public class Runner {
    public static Logger logger = Logger.getLogger(Runner.class);

    public static void main(String[] args) {
        logger.debug("Create Storekeeper");
        Storekeeper storekeeper = new Storekeeper();
        logger.debug("Storekeeper create Fridge");
        Fridge firstFridge = storekeeper.createNewFridge();
        logger.debug("Storekeeper fill Fridge");
        storekeeper.fillFridge(firstFridge, 10);
        logger.debug("Create Chef");
        Chef boss = new Chef();
        logger.debug("chef create First Tomato Salad");
        Salad firstSalad = boss.makeSaladTomatoParadise(firstFridge);
        logger.debug("chef create Second mix salad");
        Salad secondSalad = boss.makeSaladMix(firstFridge);
        SaladAssistant assistant = new SaladAssistant();
        logger.debug("Assistant makes calculations with salad");
        Printer.printResult("assistant calculate Calories of First Salad: "
                , assistant.calculateCaloriesOfSalad(firstSalad));
        Printer.printResult("assistant calculate weight of First Salad: "
                , assistant.calculateWeightOfSalad(firstSalad));
        Printer.printResult("assistant find ingredients in first salad between 5 and 50 callories: "
                , assistant.findByParametrCalories(firstSalad, 5, 50));
        Printer.printResult("assistant find the high calorie vegetable in first salad: "
                , assistant.findTheHighCalorieVegetable(firstSalad));
        Printer.printResult("assistant find the vegetable contain the high Vit C of First Salad: "
                , assistant.findTheHighVitCVegetable(firstSalad));
        Printer.printResult("assistant find the lowest calorie vegetable in first salad: "
                , assistant.findTheLowestCalorieVegetable(firstSalad));
        Printer.printResult("assistant assistant find the lowest vegetable contain the high Vit C of First Salad:"
                , assistant.findTheLowestVitCVegetable(firstSalad));
        Printer.printResult("assistant find ingredients in first salad between 1 and 10 protein: "
                , assistant.findVegetableByParametrQuantityProtein(firstSalad
                        , 1, 10));
        assistant.sortVegetableByWeight(firstSalad);
        Printer.printResult("assistant sort ingredients in first salad by weight:  "
                , firstSalad);

        Printer.printResult("assistant calculate Calories of second Salad: "
                , assistant.calculateCaloriesOfSalad(secondSalad));
        Printer.printResult("assistant calculate weight of second Salad: "
                , assistant.calculateWeightOfSalad(secondSalad));
        Printer.printResult("assistant find ingredients in second salad between 5 and 50 callories: "
                , assistant.findByParametrCalories(secondSalad, 5, 50));
        Printer.printResult("assistant find the high calorie vegetable in second salad: "
                , assistant.findTheHighCalorieVegetable(secondSalad));
        Printer.printResult("assistant find the vegetable contain the high Vit C of second Salad: "
                , assistant.findTheHighVitCVegetable(secondSalad));
        Printer.printResult("assistant find the lowest calorie vegetable in second salad: "
                , assistant.findTheLowestCalorieVegetable(secondSalad));
        Printer.printResult("assistant assistant find the lowest vegetable contain the high Vit C of second Salad:"
                , assistant.findTheLowestVitCVegetable(secondSalad));
        Printer.printResult("assistant find ingredients in second salad between 1 and 10 protein: "
                , assistant.findVegetableByParametrQuantityProtein(secondSalad
                        , 1, 10));
        assistant.sortVegetableByWeight(secondSalad);
        Printer.printResult("assistant sort ingredients in second salad by weight:  "
                , secondSalad);
    }
}
