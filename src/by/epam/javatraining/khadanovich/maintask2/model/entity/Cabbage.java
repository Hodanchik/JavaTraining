package by.epam.javatraining.khadanovich.maintask2.model.entity;

import java.util.Objects;

public class Cabbage extends Vegetable{
    private int countsSheet;
    private static int calories = 27;
    private static int quantityVitC= 44;
    private static int quantityProtein= 2;
    private static int quantityCarbohydrate= 5;

    public Cabbage(int weight) {
        super(weight);
    }

    public Cabbage(int weight, int countsSheet) {
        super(weight);
        this.countsSheet = countsSheet;
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

    public int getCountsSheet() {
        return countsSheet;
    }

    public void setCountsSheet(int countsSheet) {
        this.countsSheet = countsSheet;
    }

    public static void setCalories(int calories) {
        Cabbage.calories = calories;
    }

    public static void setQuantityVitC(int quantityVitC) {
        Cabbage.quantityVitC = quantityVitC;
    }

    public static void setQuantityProtein(int quantityProtein) {
        Cabbage.quantityProtein = quantityProtein;
    }

    public static void setQuantityCarbohydrate(int quantityCarbohydrate) {
        Cabbage.quantityCarbohydrate = quantityCarbohydrate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cabbage)) return false;
        if (!super.equals(o)) return false;
        Cabbage cabbage = (Cabbage) o;
        return getCountsSheet() == cabbage.getCountsSheet();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCountsSheet());
    }

    @Override
    public String toString() {
        return "Cabbage{" +
                "countsSheet=" + countsSheet
                 + super.toString() +
                " calories= " + calories +
                " quantityVitC= " + quantityVitC +
                " quantityProtein= " + quantityProtein +
                " quantityCarbohydrate= " + quantityCarbohydrate + "}";
    }
}

