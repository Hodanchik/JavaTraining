package by.epam.javatraining.khadanovich.maintask2.model.entity;

import java.util.Objects;

public class Broccoli extends Vegetable {
    private boolean hasBro;
    private static int calories = 300;
    private static int quantityVitC = 120;
    private static int quantityProtein = 4;
    private static int quantityCarbohydrate = 5;


    public Broccoli(int weight) {
        super(weight);
    }

    public Broccoli(int weight, boolean hasBro) {
        super(weight);
        this.hasBro = hasBro;
    }

    public boolean isHasBro() {
        return hasBro;
    }

    public void setHasBro(boolean hasBro) {
        this.hasBro = hasBro;
    }

    public static void setCalories(int calories) {
        Broccoli.calories = calories;
    }

    public static void setQuantityVitC(int quantityVitC) {
        Broccoli.quantityVitC = quantityVitC;
    }

    public static void setQuantityProtein(int quantityProtein) {
        Broccoli.quantityProtein = quantityProtein;
    }

    public static void setQuantityCarbohydrate(int quantityCarbohydrate) {
        Broccoli.quantityCarbohydrate = quantityCarbohydrate;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Broccoli)) return false;
        if (!super.equals(o)) return false;
        Broccoli broccoli = (Broccoli) o;
        return isHasBro() == broccoli.isHasBro();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isHasBro());
    }

    @Override
    public String toString() {
        return "Broccoli{ " + super.toString() +
                " calories= " + calories +
                " quantityVitC= " + quantityVitC +
                " quantityProtein= " + quantityProtein +
                " quantityCarbohydrate= " + quantityCarbohydrate + "}";
    }
}
