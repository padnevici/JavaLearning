package exercise_3_2.gc;

/**
 * Created by apadnevici on 2/17/2017.
 */

import java.util.Date;

public class CheckGC {

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total JVM memory: "
                + rt.totalMemory());

        System.out.println("Before Memory = "
                + rt.freeMemory());
        Date d = null;
        for (int i = 0; i < 100000; i++) {
            d = new Date();
            d = null;
        }
        System.out.println("After Memory = "
                + rt.freeMemory());
        rt.gc(); // an alternate to System.gc()
        System.out.println("After GC Memory = "
                + rt.freeMemory());

        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[6];
        a = b;
    }

}
