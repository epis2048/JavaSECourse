import java.util.Scanner;

public class Shapes_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle_test c = new Circle_test();
        Trapezoid_test t = new Trapezoid_test();
        System.out.println("请输入圆形的半径：");
        c.setR(scanner.nextInt());
        System.out.println("请输入梯形的上底：");
        t.setA(scanner.nextInt());
        System.out.println("请输入梯形的下底：");
        t.setB(scanner.nextInt());
        System.out.println("请输入梯形的高：");
        t.setH(scanner.nextInt());
        System.out.println("圆形的面积是："+c.getS());
        System.out.println("梯形的面积是："+t.getS());
    }
}
