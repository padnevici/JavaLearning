package exercise_1_1.food;

/**
 * Created by apadnevici on 1/23/2017.
 */
public class Apple extends Fruit {
    public final int anInt=4;
    public int anotherInt=1;

    public void howDoesItGrowt() {
        System.out.println("The apple grows on trees");
        x++;
    }

    @Override
    public String getColor()
    {
        return super.getColor() + "-----";
    }
}
