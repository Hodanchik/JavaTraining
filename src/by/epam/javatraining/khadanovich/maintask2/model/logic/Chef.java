package by.epam.javatraining.khadanovich.maintask2.model.logic;
import by.epam.javatraining.khadanovich.maintask2.model.entity.*;
import org.apache.log4j.Logger;

/**
 * Chef class
 *
 * @author Tatsiana Khadanovich
 * @version 1.0
 * @createdate 18/06/19
 *
 */
public class Chef {
    public static Logger logger = Logger.getLogger(Chef.class);


//method create  salad by application
    public Salad makeSalad(Vegetable... vegetable) {

        Salad salad = new Salad();
        salad.add(vegetable);
        logger.trace("create salad");
        return salad;
    }

    //method create  salad by some recipe
    public Salad makeSaladTomatoParadise(Fridge fridge) {
        int tomatoWeight = 100;
        int onionWeight = 20;
        int pepperWeight = 10;
        Salad salad = new Salad();
        //salad products
        Vegetable tomatoForSalad = new Tomato(tomatoWeight);
        Vegetable onionForSalad = new Onion(onionWeight);
        Vegetable pepperForSalad = new Pepper(pepperWeight);

        //request for ChefAssistant search products
        logger.debug("request for ChefAssistant search products");
        if (ChefAssistant.findIngredient(fridge, tomatoForSalad)
                && ChefAssistant.findIngredient(fridge, onionForSalad)
                && ChefAssistant.findIngredient(fridge, pepperForSalad)) {
            logger.debug("enough products in a fridge");
            //create new salad
            salad.add(tomatoForSalad, onionForSalad, pepperForSalad);

        } else {
            logger.warn("not enough products in a fridge");
            logger.warn("return empty salad");
        }

        return salad;
    }
    public Salad makeSaladMix(Fridge fridge) {
        int tomatoWeight = 60;
        int broccoliWeight = 90;
        int cabbageWeight = 20;
        int onionWeight = 50;
        int pepperWeight = 50;
        int cucumberWeight = 50;
        Salad salad = new Salad();
        //salad products
        Vegetable tomatoForSalad = new Tomato(tomatoWeight);
        Vegetable onionForSalad = new Onion(onionWeight);
        Vegetable pepperForSalad = new Pepper(pepperWeight);
        Vegetable broccoliForSalad = new Broccoli(broccoliWeight);
        Vegetable cabbageForSalad = new Cabbage(cabbageWeight);
        Vegetable cucumberForSalad = new Cucumber(cucumberWeight);

        //request for ChefAssistant search products
        logger.debug("request for ChefAssistant search products");
        if (ChefAssistant.findIngredient(fridge, tomatoForSalad)
                && ChefAssistant.findIngredient(fridge, onionForSalad)
                && ChefAssistant.findIngredient(fridge, pepperForSalad)
                && ChefAssistant.findIngredient(fridge, broccoliForSalad)
                && ChefAssistant.findIngredient(fridge, cabbageForSalad)
                && ChefAssistant.findIngredient(fridge, cucumberForSalad)) {
            logger.debug("enough products in a fridge");
            //create new salsd
            salad.add(tomatoForSalad, onionForSalad, pepperForSalad, broccoliForSalad, cabbageForSalad
                    , cucumberForSalad);

        } else {
            logger.warn("not enough products in a fridge");
            logger.warn("return empty salad");
        }

        return salad;
    }


}
