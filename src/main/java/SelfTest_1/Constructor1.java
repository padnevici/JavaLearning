package SelfTest_1;

/**
 * Created by apadnevici on 2/3/2017.
 */
public class Constructor1 extends AbstractConstructor {

    private int c;

    public Constructor1()
    {this(1,2,3);}

    public Constructor1(int a, int b, int c) {
        super(a, b);

        this.c = c;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add() {
        return getA() + getB() + getC();
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
