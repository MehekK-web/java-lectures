class InsufficientFundsException extends Exception {
    InsufficientFundsException(String msg) {
        super(msg);
    }
}

class Account {
    String accNo;
    String name;
    double balance;

    Account(String a, String n, double b) {
        accNo = a;
        name = n;
        balance = b;
    }

    void deposit(double amt) {
        balance = balance + amt;
    }

    void withdraw(double amt) throws InsufficientFundsException {
        if (amt > balance)
            throw new InsufficientFundsException("No money");
        balance = balance - amt;
    }

    void transfer(Account t, double amt) throws InsufficientFundsException {
        if (amt > balance)
            throw new InsufficientFundsException("No money");
        balance = balance - amt;
        t.balance = t.balance + amt;
    }

    void display() {
        System.out.println(accNo + " " + name + " " + balance);
    }
}

class Bank {
    Account acc[] = new Account[2];
    int count = 0;

    void createAccount(String a, String n, double b) {
        acc[count] = new Account(a, n, b);
        count++;
    }
}

public class Mainbank
    public static void main(String[] args) {
        Bank b = new Bank();
        b.createAccount("1", "Asha", 5000);
        b.createAccount("2", "Rahul", 3000);

        try {
            b.acc[0].deposit(1000);
            b.acc[0].withdraw(2000);
            b.acc[0].transfer(b.acc[1], 1000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        b.acc[0].display();
        b.acc[1].display();
    }
}
