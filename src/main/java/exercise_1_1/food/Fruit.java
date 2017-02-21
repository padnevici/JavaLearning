package exercise_1_1.food;

/**
 * Created by apadnevici on 1/23/2017.
 */
public abstract class Fruit {
    private String color;
    private double weight;
    private String specia;

    int x = 5;

    public abstract void howDoesItGrowt();

    protected String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecia() {
        return specia;
    }

    public void setSpecia(String specia) {
        this.specia = specia;
    }
}
