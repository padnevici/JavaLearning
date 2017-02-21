import SelfTest_1.AbstractConstructor;
import SelfTest_1.Constructo2;
import SelfTest_1.Constructor1;
import exercise_1_1.food.Apple;
import exercise_1_1.food.AppleRed;
import exercise_1_1.food.Fruit;
import exercise_1_1.food.Pineapple;

/**
 * Created by apadnevici on 1/23/2017.
 */
public class Main {
    public static void main(String[] args) {


        double d = 5.2313131321;
        float f = (float)5.2313131321;
        byte b = 1;
        b+=2+2;
        short s = 6;
        byte b1 = (byte) (b+s);//because expr result is an int

        float f1 = 234.56F;
        short s1 = (short)f1;
        System.out.println(s1);

        System.out.print(b);
        printOctals();
        Fruit apple = new Apple();
        Fruit pineapple = new Pineapple();

        new AppleRed().go((AppleRed) new Apple(), new AppleRed());

        apple.howDoesItGrowt();
        pineapple.howDoesItGrowt();
        ((Apple) apple).getColor();

        final Apple apple2 = new Apple();
        apple2.anotherInt = 3;
//        apple2 = new Apple(); // Error
        Boolean[] ba[] = new Boolean[][]{{true, false}, {true}};

        AbstractConstructor abstractConstructor = new Constructo2(1, 2, 3, 4);
        System.out.println(abstractConstructor.add());

        Constructor1 constructo1 = new Constructo2(1, 2, 3, 5);
        System.out.println(constructo1.add());
    }

    public static void printOctals() {
        for (int i = -100; i < 100; i++)
            System.out.println(i + " - " + Integer.toHexString(i) + " - " + Integer.toOctalString(i));
    }
}


class Alien {
    String invade(short ships) { return "a few"; }
    String invade(short... ships) { return "many"; }
}
class Defender {
    public static void main(String [] args) {
//        System.out.println(new Alien().invade(7));
    }
}