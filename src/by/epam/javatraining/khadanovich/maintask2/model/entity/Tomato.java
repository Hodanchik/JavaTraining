package by.epam.javatraining.khadanovich.maintask2.model.entity;

import java.util.Objects;

public class Tomato extends Vegetable {

    private boolean hasJuice;
    private static int calories = 23;
    private static int quantityVitC= 17;
    private static int quantityProtein= 2;
    private static int quantityCarbohydrate= 4;

    public Tomato(int weight) {
        super(weight);
    }

    public Tomato(int weight, boolean hasJuice) {
        super(weight);
        this.hasJuice = hasJuice;
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

    public boolean isHasJuice() {
        return hasJuice;
    }

    public void setHasJuice(boolean hasJuice) {
        this.hasJuice = hasJuice;
    }

    public static void setCalories(int calories) {
        Tomato.calories = calories;
    }

    public static void setQuantityVitC(int quantityVitC) {
        Tomato.quantityVitC = quantityVitC;
    }

    public static void setQuantityProtein(int quantityProtein) {
        Tomato.quantityProtein = quantityProtein;
    }

    public static void setQuantityCarbohydrate(int quantityCarbohydrate) {
        Tomato.quantityCarbohydrate = quantityCarbohydrate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tomato)) return false;
        if (!super.equals(o)) return false;
        Tomato tomato = (Tomato) o;
        return isHasJuice() == tomato.isHasJuice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isHasJuice());
    }

    @Override
    public String toString() {
        return "Tomato{" +
                "hasJuice=" + hasJuice +
                super.toString() +
                " calories= " + calories +
                " quantityVitC= " + quantityVitC +
                " quantityProtein= " + quantityProtein +
                " quantityCarbohydrate= " + quantityCarbohydrate + "}";
    }
}
