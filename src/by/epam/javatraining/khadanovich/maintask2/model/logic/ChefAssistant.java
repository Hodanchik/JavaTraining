package by.epam.javatraining.khadanovich.maintask2.model.logic;

import by.epam.javatraining.khadanovich.maintask2.model.entity.Fridge;
import by.epam.javatraining.khadanovich.maintask2.model.entity.Salad;
import by.epam.javatraining.khadanovich.maintask2.model.entity.Vegetable;
import org.apache.log4j.Logger;

/**
 * ChefAssistant class
 *
 * @author Tatsiana Khadanovich
 * @version 1.0
 * @createdate 18/06/19
 */
public class ChefAssistant {
    public static Logger logger = Logger.getLogger(ChefAssistant.class);

    public static boolean findIngredient(Fridge fridge, Vegetable ingredient) {
        if (fridge == null || fridge.size() == 0) {
            logger.error("NULL fridge");
            return false;
        }
        double findWeightIngredient = ingredient.getWeight();
        //basket for ingredients
        Salad saladBasket = new Salad();

        for (int i = 0; i < fridge.size(); i++) {
            if (fridge.get(i).getClass() == ingredient.getClass()) {
                if (fridge.get(i).getWeight() < findWeightIngredient) {
                    findWeightIngredient -= fridge.get(i).getWeight();
                    saladBasket.add(fridge.get(i));
                    fridge.remove(i);
                    logger.debug("remove vegetables from fridge");
                } else if (fridge.get(i).getWeight() > findWeightIngredient) {
                    fridge.get(i).setWeight((int) (fridge.get(i).getWeight() - findWeightIngredient));
                    return true;
                } else if (fridge.get(i).getWeight() == findWeightIngredient) {
                    fridge.remove(i);
                    logger.debug("remove vegetables from fridge");
                    return true;
                }
            }
        }
        //if not found right amount vegetables
        logger.warn("not enough ingredients");
        fridge.add(saladBasket.getAll());
        return false;
    }

}
