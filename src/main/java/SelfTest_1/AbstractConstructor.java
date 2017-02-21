package SelfTest_1;

/**
 * Created by apadnevici on 2/3/2017.
 */
public abstract class AbstractConstructor {
    private int a;
    private int b;

    public AbstractConstructor(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public abstract int add();


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
