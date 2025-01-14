package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class BankMain {

    public static void main(String[] args) {

        String acc;
        int amount;
        boolean found;
        String addr, cellNo, name, juminNo;
        int balance;
        ArrayList<Account> accounts = new ArrayList<>();;
        Scanner scanner = new Scanner(System.in);
        int q = 0;

        while (q != 9) {
            System.out.print("1. 계좌 등록\n");
            System.out.print("2. 입금\n");
            System.out.print("3. 출금\n");
            System.out.print("4. 사용자 계좌정보 출력\n");
            System.out.print("5. 계좌 정보 변경\n");
            System.out.print("6. 계좌 삭제\n");
            System.out.print("7. 종료\n");
            System.out.print("===============================\n");
            System.out.print("메뉴 : ");

            int a;
            a = scanner.nextInt();

            switch (a) {
                case 1:
                    System.out.print("이름: ");
                    name = scanner.next();
                    System.out.print("주민번호: ");
                    juminNo = scanner.next();
                    System.out.print("주소: ");
                    addr = scanner.next();
                    System.out.print("핸드폰: ");
                    cellNo = scanner.next();
                    System.out.print("계좌번호: ");
                    acc = scanner.next();
                    System.out.print("금액: ");
                    amount = scanner.nextInt();

                    accounts.add(new Account(name, juminNo, addr, cellNo, acc, amount));
                    break;
                case 2:
                    System.out.print("계좌번호를 입력하세요: ");
                    acc = scanner.next();
                    System.out.print("입금할 금액을 입력하세요:: ");
                    amount = scanner.nextInt();

                    if (amount < 0) {
                        System.out.print("입금할 금액은 0보다 커야 합니다.\n");
                        return;
                    }

                    found = false;
                    for (Account account : accounts) {
                        if (account.sel(acc)) {
                            account.deposit(amount);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.print("검색한 계좌 번호가 없습니다.\n");
                    }
                    break;
                case 3:
                    System.out.print("계좌번호를 입력하세요: ");
                    acc = scanner.next();
                    System.out.print("출금할 금액을 입력하세요:: ");
                    amount = scanner.nextInt();

                    if (amount < 0) {
                        System.out.print("출금할 금액은 0보다 커야 합니다.\n");
                        return;
                    }

                    found = false;
                    for (Account account : accounts) {
                        if (account.sel(acc)) {
                            if (account.getBalance() < amount) {
                                System.out.print("잔액 부족\n");
                            }
                            else {
                                account.withdraw(amount);
                            }
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.print("검색한 계좌 번호가 없습니다.\n");
                    }
                    break;
                case 4:
                    found = false;
                    for (Account account : accounts) {
                        account.printInfo();
                        found = true;
                    }

                    if (!found) {
                        System.out.print("검색한 계좌가 없습니다.\n");
                    }

                    System.out.print("------------------------------\n");
                    break;

                case 5:
                    System.out.print("계좌번호를 입력하세요: ");
                    acc = scanner.next();

                    found = false;
                    for (Account account : accounts) {
                        if (account.sel(acc)) {

                            System.out.print("새 주소: ");
                            addr = scanner.next();;
                            System.out.print("새 핸드폰 번호: ");
                            cellNo = scanner.next();;
                            account.setAccount(account.getName(), account.getJuminNo(), addr, cellNo, account.getAcc(), account.getBalance());
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.print("검색한 계좌가 없습니다.\n");
                    }
                    break;

                case 6:
                    System.out.print("계좌번호를 입력하세요: ");
                    acc = scanner.next();

                    found = false;
                    for (Account account : accounts) {
                        if (account.sel(acc)) {
                            account.del();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.print("검색한 계좌가 없습니다.\n");
                    }
                    break;
                case 7:
                    System.out.print("종료합니다.\n");
                    q = 9;
                    break;
            }
        }
    }
}
