package Class_0705;

public class AccountTest1 {
    public static void main(String[] args) {
        Account1 a = new Account1("123-45", 10000);
        Account1 b = new Account1("567-89", 10000);
        while (a.transfer(b, 3000)) {
            ;
        }
        // while 루프를 이용해서 a계좌에서 b계좌로 3000을 이체하는동안 반복
        // transfer 메서드는 이체가 성공하면 'true'를 반환하고
        // 이체가 실패하면 'false'를 반환한다.

        // a계좌 정보 출력
        System.out.println(a.toStr());
        // b계좌 정보 출력
        System.out.println(b.toStr());
    }
}

class Account1 {
    String num;
    int balance;

    public Account1(String num, int balance) {
        this.num = num;
        this.balance = balance;
    }

    // 잔액이 3000보다 작으면 종료
    public boolean transfer(Account1 account1, int amount) {
        if (balance < amount) {
            return false;
        }
        // a의 balance를 amount(3000)을 빼서
        balance -= amount;
        // b의 balance에 amount(3000)을 더해서 balnce에 저장
        account1.balance += amount;
        return true;
    }

    public String toStr() {
        return String.format("Account {num: %s, balance: %d}", num, balance);
    }
}