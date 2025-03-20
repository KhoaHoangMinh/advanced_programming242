class PayPal {
    public void construct() {}
    public void sendPayment(int amount) {
        System.out.println("Paying via PayPal " + amount);
    }
}
class MoneyBooker {
    public void payMoney(int amount) {
        System.out.println("Paying via MoneyBooker " + amount);
    }
}
interface Adapter {
    public void pay(int amount);
}
class PayPalAdapter implements Adapter {
    PayPal payPal;
    PayPalAdapter(PayPal obj) {payPal = obj;}
    @Override
    public void pay(int amount) {payPal.sendPayment(amount);}
}
class MoneyBookerAdapter implements Adapter {
    MoneyBooker moneyBooker;
    MoneyBookerAdapter(MoneyBooker obj) {moneyBooker = obj;}
    @Override
    public void pay(int amount) {
        moneyBooker.payMoney(amount);
    }
}
public class PayPalProblem {
    public static void main(String[] args) {
        PayPal payPal = new PayPal();
        Adapter payPalAdapter = new PayPalAdapter(payPal);
        payPalAdapter.pay(100000);

        MoneyBooker moneyBooker = new MoneyBooker();
        Adapter moneyBookerAdapter = new MoneyBookerAdapter(moneyBooker);
        moneyBookerAdapter.pay(5000);
    }
}
