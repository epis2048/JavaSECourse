public class TVM { //自动售票机 Ticket Vending Machine
    private int price;
    private int balance;
    private int total;

    public void TVM() {
        price = 2;
        balance = 0;
        total = 0;
    }

    public void setPrice(int inputPrice) {
        this.price = inputPrice;
    }

    public int getPrice() {
        return this.price;
    }

    public void addBalance(int inputBalance) {
        this.balance += inputBalance;
    }

    public int getBalance() {
        return this.balance;
    }

    public int getTotal() {
        return this.total;
    }

    public void getTicket() {
        if (balance >= price) {
            System.out.println("车票：" + price + "元");
            balance -= price;
            total += price;
        } else {
            System.out.println("余额不足，出票失败！");
        }
    }

    public int refund() {
        int temp = balance;
        balance = 0;
        return temp;
    }

    public void reset() {
        balance = 0;
        total = 0;
    }
}