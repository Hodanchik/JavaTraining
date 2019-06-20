package by.epam.javatraining.khadanovich.maintask2.model.logic;

import by.epam.javatraining.khadanovich.maintask2.model.entity.Salad;
import by.epam.javatraining.khadanovich.maintask2.model.entity.Vegetable;
import org.apache.log4j.Logger;

/**
 * SaladAssistant class
 *
 * @author Tatsiana Khadanovich
 * @version 1.0
 * @createdate 18/06/19
 */

public class SaladAssistant {
    public static Logger logger = Logger.getLogger(SaladAssistant.class);

    public int calculateCaloriesOfSalad(Salad salad) {
        if (salad == null || salad.size() == 0) {
            logger.error("salad = null or salad size = 0");
            return -1;
        }
        int countCalories = 0;
        int coefficient = 100; // calories in vegetable reflected of 100 grams
        Vegetable currentVegetable;
        for (int i = 0; i < salad.size(); i++) {
            currentVegetable = salad.get(i);
            countCalories += currentVegetable.getCalories() * currentVegetable.getWeight() / coefficient;
        }
        return countCalories;
    }

    public double calculateWeightOfSalad(Salad salad) {
        if (salad == null || salad.size() == 0) {
            logger.error("salad = null or salad size = 0");
            return -1;
        }
        int countWeight = 0;
        Vegetable currentVegetable;
        for (int i = 0; i < salad.size(); i++) {
            currentVegetable = salad.get(1);
            countWeight += currentVegetable.getWeight();
        }
        return countWeight;
    }

    public void sortVegetableByWeight(Salad salad) {

        if (salad == null || salad.size() == 0) {
            logger.error("salad = null or salad size = 0");
            return;
        }
        int size = salad.size();
        boolean isSorted = false;
        int lastIndex = size - 1; // last element index
        while (!isSorted) {
            isSorted = true;// assume the array is sorted
            for (int i = 0; i < lastIndex; i++) {
                if (salad.get(i).getWeight() > salad.get(i + 1).getWeight()) {
                    isSorted = false;
                    salad.swap(i, i + 1);
                }
            }
        }

    }

    public Salad findByParametrCalories(Salad salad, int minCalories, int maxCalories) {

        Salad listVegetable = new Salad();
        if (salad == null || salad.size() == 0) {
            logger.error("salad = null or salad size = 0");
            return listVegetable;
        }
        int size = salad.size();
        for (int i = 0; i < size; i++) {
            if (salad.get(i).getCalories() >= minCalories && salad.get(i).getCalories() < maxCalories) {
                listVegetable.add(salad.get(i));
            }
        }
        return listVegetable;
    }

    public Salad findVegetableByParametrQuantityProtein(Salad salad, int minQuantityProtein, int maxQuantityProtein) {
        Salad listVegetable = new Salad();
        if (salad == null || salad.size() == 0) {
            logger.error("salad = null or salad size = 0");
            return listVegetable;
        }
        int size = salad.size();
        for (int i = 0; i < size; i++) {
            if (salad.get(i).getQuantityProtein() >= minQuantityProtein
                    && salad.get(i).getQuantityProtein() < maxQuantityProtein) {
                listVegetable.add(salad.get(i));
            }
        }
        return listVegetable;
    }

    public Vegetable findTheHighVitCVegetable(Salad salad) {

        if (salad == null || salad.size() == 0) {
            logger.error("salad = null or salad size = 0");
        }
        int maxVitC = salad.get(0).getQuantityVitC();
        Vegetable findVegetable = salad.get(0);
        int size = salad.size();
        for (int i = 0; i < size; i++) {
            if (salad.get(i).getQuantityVitC() > maxVitC) {
                findVegetable = salad.get(i);
            }
        }
        return findVegetable;
    }

    public Vegetable findTheLowestVitCVegetable(Salad salad) {
        if (salad == null || salad.size() == 0) {
            logger.error("salad = null or salad size = 0");
        }
        int minVitC = salad.get(0).getQuantityVitC();
        Vegetable findVegetable = salad.get(0);
        int size = salad.size();
        for (int i = 0; i < size; i++) {
            if (salad.get(i).getQuantityVitC() < minVitC) {
                findVegetable = salad.get(i);
            }
        }
        return findVegetable;
    }

    public Vegetable findTheHighCalorieVegetable(Salad salad) {
        if (salad == null || salad.size() == 0) {
            logger.error("salad = null or salad size = 0");
        }
        int maxCalorie = salad.get(0).getCalories();
        Vegetable findVegetable = salad.get(0);
        int size = salad.size();
        for (int i = 0; i < size; i++) {
            if (salad.get(i).getCalories() > maxCalorie) {
                findVegetable = salad.get(i);
            }
        }
        return findVegetable;
    }

    public Vegetable findTheLowestCalorieVegetable(Salad salad) {
        if (salad == null || salad.size() == 0) {
            logger.error("salad = null or salad size = 0");
        }
        int minCalorie = salad.get(0).getCalories();
        Vegetable findVegetable = salad.get(0);
        int size = salad.size();
        for (int i = 0; i < size; i++) {
            if (salad.get(i).getCalories() < minCalorie) {
                findVegetable = salad.get(i);
            }
        }
        return findVegetable;
    }
}
