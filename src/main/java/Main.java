import exercise_1_1.food.Apple;
import exercise_1_1.food.Fruit;
import exercise_1_1.food.Pineapple;

/**
 * Created by apadnevici on 1/23/2017.
 */
public class Main {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit pineapple  = new Pineapple();

        apple.howDoesItGrowt();
        pineapple.howDoesItGrowt();
    }
}
