package by.epam.javatraining.khadanovich.maintask2.model.logic;

import by.epam.javatraining.khadanovich.maintask2.model.entity.Fridge;
import org.apache.log4j.Logger;

/**
 * Storekeeper class
 *
 * @author Tatsiana Khadanovich
 * @version 1.0
 * @createdate 18/06/19
 */

public class Storekeeper {
    public static Logger logger = Logger.getLogger(Storekeeper.class);

    public Fridge createNewFridge() {
        Fridge fridge = new Fridge();
        return fridge;
    }

    public void fillFridge(Fridge fridge, int countDelivery) {
        if (fridge == null) {
            logger.error("fridge = null");
        }
        for (int i = 0; i < countDelivery; i++) {
            fridge.add(Generator.generateBroccoli());
            fridge.add(Generator.generateCabbage());
            fridge.add(Generator.generateCucumber());
            fridge.add(Generator.generateOnion());
            fridge.add(Generator.generatePepper());
            fridge.add(Generator.generateTomato());
        }
    }


}
