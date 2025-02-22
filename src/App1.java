public class App1 {
    public static void main() {
        Account coo = new Account();

        coo.deposit(1000);

        Account coo1 = new Account();
        coo1.deposit(100);

        coo1.printBalance();
        coo.printBalance();

        coo.transfer(200, coo1);
        coo1.printBalance();
        coo.printBalance();

    }
}
