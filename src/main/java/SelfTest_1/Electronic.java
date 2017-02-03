package SelfTest_1;

/**
 * Created by apadnevici on 1/30/2017.
 */
public class Electronic implements Device {
    public void doIt() {
    }
}

abstract class Phone1 extends Electronic {
}

abstract class Phone2 extends Electronic {
    public void doIt(int x) {
    }
//    public double doIt(int x) { // error
//        return 0d;
//    }
    public int doIt(int x, int y) {
        return 0;
    }
}

class Phone3 extends Electronic implements Device {
    public void doStuff() {
    }
}

interface Device {
    public void doIt();
}

class TestClass extends Phone2{
    public TestClass()
    {
        doIt();
        doIt(3);
    }
}
