package by.epam.javatraining.khadanovich.maintask2.model.entity;

import java.util.Objects;

public class Onion extends Vegetable {
    private boolean causeTears;
    private static int calories = 41;
    private static int quantityVitC= 5;
    private static int quantityProtein= 2;
    private static int quantityCarbohydrate= 9;

    public Onion(int weight) {
        super(weight);
    }

    public Onion(int weight, boolean causeTears) {
        super(weight);
        this.causeTears = causeTears;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public int getQuantityVitC() {
        return quantityVitC;
    }

    @Override
    public int getQuantityProtein() {
        return quantityProtein;
    }

    @Override
    public int getQuantityCarbohydrate() {
        return quantityCarbohydrate;
    }

    public boolean isCauseTears() {
        return causeTears;
    }

    public void setCauseTears(boolean causeTears) {
        this.causeTears = causeTears;
    }

    public static void setCalories(int calories) {
        Onion.calories = calories;
    }

    public static void setQuantityVitC(int quantityVitC) {
        Onion.quantityVitC = quantityVitC;
    }

    public static void setQuantityProtein(int quantityProtein) {
        Onion.quantityProtein = quantityProtein;
    }

    public static void setQuantityCarbohydrate(int quantityCarbohydrate) {
        Onion.quantityCarbohydrate = quantityCarbohydrate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Onion)) return false;
        if (!super.equals(o)) return false;
        Onion onion = (Onion) o;
        return isCauseTears() == onion.isCauseTears();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isCauseTears());
    }

    @Override
    public String toString() {
        return "Onion{" + super.toString() +
                " causeTears=" + causeTears +
                " calories= " + calories +
                " quantityVitC= " + quantityVitC +
                " quantityProtein= " + quantityProtein +
                " quantityCarbohydrate= " + quantityCarbohydrate + "}";

    }
}




