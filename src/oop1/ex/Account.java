package oop1.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
        System.out.println("정상적으로 입금되었습니다. (잔고: " + balance + ")");
    }

    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액이 부족합니다.");
        } else {
            balance -= amount;
            System.out.println("정상적으로 출금되었습니다. (잔고: " + balance + ")");
        }
    }

    void check() {
        System.out.println("잔고: " + balance);
    }
}
