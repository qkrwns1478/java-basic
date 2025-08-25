package poly.ex.pay1;

public class PayService {
    public void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        Pay pay = PayStore.findPay(option);
        boolean result = pay.pay(amount);

        System.out.println("결제가 " + (result ? "성공" : "실패") + "했습니다.");
    }
}