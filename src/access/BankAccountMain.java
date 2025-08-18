package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdraw(3000);
        System.out.println("balance: " + account.getBalance());
    }
}

/* 좋은 캡슐화의 조건
 * 1. 데이터를 숨겨라: 객체의 데이터는 객체가 제공하는 기능인 메서드를 통해서 접근해야 한다.
 * 2. 기능을 숨겨라: 객체의 기능 중에서 꼭 필요한 기능만 노출하는 것이 좋다.
 */