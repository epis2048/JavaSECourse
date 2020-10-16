import java.util.Scanner;

public class TVMConsole {
    public static void main(String[] args) {
        TVM tvm1 = new TVM();
        if (args.length > 0) {
            tvm1.setPrice(Integer.parseInt(args[0]));
        } else {
            tvm1.setPrice(2);
        }
        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean quitFlag = false;
            System.out.println("===============欢迎使用自动售票机===============");
            System.out.println("本机销售固定票价 " + tvm1.getPrice() + " 元的车票");
            System.out.println("请选择服务...");
            System.out.println("1 投币");
            System.out.println("2 打印车票");
            System.out.println("3 找零");
            System.out.println("reset 重置");
            System.out.println("turn off 关机");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    System.out.println("请投币：");
                    int amount = scanner.nextInt();
                    scanner.nextLine();
                    if (amount <= 0) {
                        System.out.println("请投大于0的钱");
                    } else {
                        tvm1.addBalance(amount);
                    }
                    System.out.println("当前余额：" + tvm1.getBalance() + " 元");
                    break;
                case "2":
                    tvm1.getTicket();
                    System.out.println("当前余额：" + tvm1.getBalance() + " 元");
                    break;
                case "3":
                    System.out.println("请收好找零 " + tvm1.refund() + " 元");
                    break;
                case "reset":
                    System.out.println("本次运营总收入 " + tvm1.getTotal() + " 元");
                    tvm1.reset();
                    System.out.println("============本机被重置============");
                    break;
                case "turn off":
                    quitFlag = true;
                    break;
                default:
                    System.out.println("请输入正确的功能序号");
            }
            if (quitFlag) {
                break;
            }
        }
    }
}