public class Trapezoid_test {
    private int a;//上底
    private int b;//下底
    private int h;//高

    public Trapezoid_test() {

    }

    public void setA(int ia) {
        a = ia;
    }

    public void setB(int ib) {
        b = ib;
    }

    public void setH(int ih) {
        h = ih;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getH() {
        return h;
    }

    public double getS() {
        return (a + b) * h * 1.0 / 2;
    }

}
