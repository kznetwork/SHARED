package org.example;


class Account {
    private String name;
    private String juminNo;
    private String addr;
    private String cellNo;
    private String acc;
    int balance = 0;
    AccountStatus status;;

    public Account(String name, String juminNo, String addr, String cellNo, String acc, int balance) {
        this.name = name;
        this.juminNo = juminNo;
        this.addr = addr;
        this.cellNo = cellNo;
        this.acc = acc;
        this.balance = balance;
        this.status = AccountStatus.Active;
    }

    int getBalance() {
        return this.balance;
    }

    String getName() {
        return this.name;
    }

    String getJuminNo() {
        return this.juminNo;
    }

    String getAddr() {
        return this.addr;
    }

    String getCellNo() {
        return this.cellNo;
    }

    String getAcc() {
        return this.acc;
    }

    void deposit(int amount) {

        this.balance += amount;
    }

    void withdraw(int amount) {

        if(balance < amount)
            return;

        this.balance -= amount;
    }

    void printInfo() {
        if (status == AccountStatus.Inactive) {
            return;
        }

        System.out.println("------------------------------");
        System.out.println("이름: " + name);
        System.out.println("주민번호: " + juminNo);
        System.out.println("주소: " + addr);
        System.out.println("핸드폰: " + cellNo);
        System.out.println("계좌번호: " + acc);
        System.out.println("잔고: " + balance);
    }

    boolean sel(String acc) {
        return this.acc == acc;
    }

    void setAccount(String name, String juminNo, String addr, String cellNo, String acc, int balance) {
        this.name = name;
        this.juminNo = juminNo;
        this.addr = addr;
        this.cellNo = cellNo;
        this.acc = acc;
        this.balance = balance;
        this.status = AccountStatus.Active;
    }

    void del() {
        status = AccountStatus.Inactive;
    }
}
