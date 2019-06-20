package by.epam.javatraining.khadanovich.maintask2.model.entity;

public class Pepper extends Vegetable {
    private static int calories = 27;
    private static int quantityVitC= 168;
    private static int quantityProtein= 1;
    private static int quantityCarbohydrate= 6;

    public Pepper(int weight) {
        super(weight);
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

    public static void setCalories(int calories) {
        Pepper.calories = calories;
    }

    public static void setQuantityVitC(int quantityVitC) {
        Pepper.quantityVitC = quantityVitC;
    }

    public static void setQuantityProtein(int quantityProtein) {
        Pepper.quantityProtein = quantityProtein;
    }

    public static void setQuantityCarbohydrate(int quantityCarbohydrate) {
        Pepper.quantityCarbohydrate = quantityCarbohydrate;
    }

    @Override
    public String toString() {
        return "Pepper{ " + super.toString()+
                " calories= " + calories +
                " quantityVitC= " + quantityVitC +
                " quantityProtein= " + quantityProtein +
                " quantityCarbohydrate= " + quantityCarbohydrate + "}";
    }
}
