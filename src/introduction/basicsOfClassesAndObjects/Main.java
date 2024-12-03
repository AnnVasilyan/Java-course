package introduction.basicsOfClassesAndObjects;

class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    // Метод снятия денег
    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

// Сберегательный счет с лимитом минимального остатка
class SavingsAccount extends Account {
    private final double minimumBalance;

    public SavingsAccount(double balance, double minimumBalance) {
        super(balance);
        this.minimumBalance = minimumBalance;
    }

    @Override // ожидаемое поведение для родительского класса
    public void withdraw(double amount) {
        if (balance - amount < minimumBalance) {
            throw new IllegalArgumentException("Cannot withdraw below minimum balance");
        }
        super.withdraw(amount);
    }
}

// Текущий счет без ограничений - базовая реализация
class CurrentAccount extends Account {
    public CurrentAccount(double balance) {
        super(balance);
    }
}


public class Main {
    public static void main(String[] args) {
        Account savings = new SavingsAccount(1000, 200); // Замена родительского типа на дочерний
        Account current = new CurrentAccount(1000); // Замена родительского типа на дочерний

        savings.withdraw(700); // Остаток 300, работает нормально
        current.withdraw(900); // Остаток 100, работает нормально

        try {
            savings.withdraw(850); // Минимальный баланс нарушен
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
