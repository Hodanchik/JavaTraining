package by.epam.javatraining.khadanovich.maintask2.model.entity;

import java.util.Objects;

public abstract class Vegetable {
    private int weight;

    public Vegetable(int weight) {
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public abstract int getCalories();

    public abstract int getQuantityVitC();

    public abstract int getQuantityProtein();

    public abstract int getQuantityCarbohydrate();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vegetable)) return false;
        Vegetable vegetable = (Vegetable) o;
        return weight == vegetable.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " weight=" + weight;
    }
}
