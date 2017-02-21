package SelfTest_1;

/**
 * Created by apadnevici on 2/17/2017.
 */
public class Alien {
    String invade(Short ships) {
        return "a few";
    }

    String invade(Object... o) {
        return "many";
    }

    int[][] a = {{1, 2,}, {3, 4}};
    int[] b = (int[]) a[1];
}

class Defender {
    public static void main(String[] args) {
        System.out.println(new Alien().invade(7,6l));
    }

    public void inttt(int i)
    {
//        for (  int i=1; i<4; i++)
//            System.out.print('b');

    }
}
