package chapter18.example5;

class Account {
    String accountNo;
    String ownerName;
    int balance;

    public Account(String accountNo, String ownerName, int balance) {
        this.accountNo = accountNo;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public int withdraw(int amount){
        if( balance  < amount){
            return 0;
        } else {
            balance -= amount;
            return amount;
        }
    }
}

class SharedArea{
    Account account1;
    Account account2;
}
