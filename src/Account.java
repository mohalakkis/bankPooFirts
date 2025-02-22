public class Account {

    double accoutNumber;
    double balace;
    String accountOwner;

    void printBalance() {
        System.out.println("saldo: " + balace);
    }

    boolean deposit(double value) {
        if (value > balace) {
            balace += value;
            return true;
        }
        return false;
    }

    boolean saque(double valorSaque) {
        if (valorSaque > 0) {
            balace -= valorSaque;
            return true;
        }
        return false;
    }

    void transfer(double valor, Account targetAccont) {
        saque(valor);
        targetAccont.deposit(valor);

    }
}


