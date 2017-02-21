package SelfTest_1;

/**
 * Created by apadnevici on 2/3/2017.
 */
public class Constructo2 extends Constructor1 {
    private int d;

    public Constructo2(int a, int b, int c, int d) {
        super(a, b, c);
        this.d = d;
    }

    @Override
    public int add() {
        System.out.println("Overloaded");
        return super.add() + d;
    }
}
