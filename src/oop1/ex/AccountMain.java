package oop1.ex;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        System.out.println("안녕하세요! 문식은행입니다.");
        Account account = new Account();

        Scanner scanner = new Scanner(System.in);
        int input;
        int n;
        boolean run = true;

        while (run) {
            System.out.print("무엇을 하시겠습니까?(1-입금, 2-출금, 3-잔고 확인, 0-종료) ") ;
            input = scanner.nextInt();
            switch (input) {
                case 0:
                    run = false;
                    break;
                case 1:
                    System.out.print("얼마만큼 입금하시겠습니까? ");
                    n = scanner.nextInt();
                    account.deposit(n);
                    break;
                case 2:
                    System.out.print("얼마만큼 출금하시겠습니까? ");
                    n = scanner.nextInt();
                    account.withdraw(n);
                    break;
                case 3:
                    account.check();
                    break;
                default:
                    System.out.println("유효하지 않은 입력입니다.");
                    break;
            }
        }

        System.out.println("안녕히 가세요!");
    }
}
