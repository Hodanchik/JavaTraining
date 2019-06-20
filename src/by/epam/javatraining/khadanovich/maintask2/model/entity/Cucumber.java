package by.epam.javatraining.khadanovich.maintask2.model.entity;

import java.util.Objects;

public class Cucumber extends Vegetable {
    private int countPimples;
    private boolean bitterButt;

    private static int calories = 15;
    private static int quantityVitC= 8;
    private static int quantityProtein= 1;
    private static int quantityCarbohydrate= 2;

    public Cucumber(int weight) {
        super(weight);
    }

    public Cucumber(int weight, int countPimples, boolean bitterButt) {
        super(weight);
        this.countPimples = countPimples;
        this.bitterButt = bitterButt;
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

    public int getCountPimples() {
        return countPimples;
    }

    public void setCountPimples(int countPimples) {
        this.countPimples = countPimples;
    }

    public boolean isBitterButt() {
        return bitterButt;
    }

    public void setBitterButt(boolean bitterButt) {
        this.bitterButt = bitterButt;
    }

    public static void setCalories(int calories) {
        Cucumber.calories = calories;
    }

    public static void setQuantityVitC(int quantityVitC) {
        Cucumber.quantityVitC = quantityVitC;
    }

    public static void setQuantityProtein(int quantityProtein) {
        Cucumber.quantityProtein = quantityProtein;
    }

    public static void setQuantityCarbohydrate(int quantityCarbohydrate) {
        Cucumber.quantityCarbohydrate = quantityCarbohydrate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cucumber)) return false;
        if (!super.equals(o)) return false;
        Cucumber cucumber = (Cucumber) o;
        return getCountPimples() == cucumber.getCountPimples() &&
                isBitterButt() == cucumber.isBitterButt();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCountPimples(), isBitterButt());
    }

    @Override
    public String toString() {
        return "Cucumber{" +
                "countPimples=" + countPimples +
                ", bitterButt=" + bitterButt +
                super.toString() +
                " calories= " + calories +
                " quantityVitC= " + quantityVitC +
                " quantityProtein= " + quantityProtein +
                " quantityCarbohydrate= " + quantityCarbohydrate + "}";
    }
}

